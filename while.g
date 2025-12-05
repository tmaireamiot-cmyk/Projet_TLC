grammar while;

options {
    output=AST;
}

tokens{
    PROGRAM;
    FUNCTION;
    DEFINITION;
    INPUT;
    INPUTSUB;
    OUTPUT;
    COMMANDS;
    COMMAND;
    VARS;
    EXPRS;
    EXPRESSION;
    EXPRBASE;
    LEXPR;
    NOP;
    VARIABLES;
    EXPRESSIONS;
    VAR;
    IF;
}

VARIABLE: ('A'..'Z') (('A'..'Z')|('a'..'z')|('0'..'1'))* ('!'|'?')?;
SYMBOL: ('a'..'z') (('A'..'Z')|('a'..'z')|('0'..'1'))* ('!'|'?')?;


COMMA : ',';
PERCENT : '%';

program : function+ -> ^(PROGRAM function+);

function : 'function' s=SYMBOL ':' definition -> ^(FUNCTION $s definition);

definition
    : 'read' i=input? PERCENT c=commands PERCENT 'write' o=output -> ^(DEFINITION ^(INPUT $i?) ^(OUTPUT $o) $c)
    ;
input 	:	v=VARIABLE (COMMA v=VARIABLE)* -> ^(INPUT $v+);

output : v=VARIABLE (COMMA v=VARIABLE)* -> ^(OUTPUT $v+);

vars : v=VARIABLE (COMMA v=VARIABLE)* -> ^(VARIABLES $v+);

exprs : e=expression (COMMA e=expression)* -> ^(EXPRESSIONS $e+);

commands : c=command ( ';' c=command )* -> ^(COMMANDS $c+);

command_nop : 'nop' -> ^(NOP);

command_var : vars ':=' exprs -> ^(VAR vars exprs);

command_if
    : 'if' expression 'then' c1=commands ('else' c2=commands)? 'fi'
      -> ^(COMMAND 'if' expression $c1 ($c2)?)
    ;

command_while : 'while' expression 'do' commands 'od' -> ^(COMMAND 'while' expression commands);

command_for : 'for' expression 'do' commands 'od' -> ^(COMMAND 'for' expression commands);

command_foreach : 'foreach' VARIABLE 'in' expression 'do' commands 'od'
    -> ^(COMMAND 'foreach' VARIABLE expression commands);

command
    : command_nop
    | command_var
    | command_if
    | command_while
    | command_for
    | command_foreach
    ;

exprbase_symbol: s=SYMBOL -> ^(EXPRBASE $s);
exprbase_variable: v=VARIABLE -> ^(EXPRBASE $v);
exprbase_nil: 'nil' -> ^(EXPRBASE 'nil');
exprbase_list: '(' 'list' lexpr ')' -> ^(EXPRBASE 'list' lexpr);
exprbase_cons: '(' 'cons' lexpr ')' -> ^(EXPRBASE 'cons' lexpr);
exprbase_hd: '(' 'hd' exprbase ')' -> ^(EXPRBASE 'hd' exprbase);
exprbase_tl: '(' 'tl' exprbase ')' -> ^(EXPRBASE 'tl' exprbase);
exprbase_symbol2: '(' a=SYMBOL lexpr ')' -> ^(EXPRBASE $a lexpr);

exprbase
    : exprbase_nil
    | exprbase_variable
    | exprbase_list
    | exprbase_cons
    | exprbase_hd
    | exprbase_tl
    | exprbase_symbol2
    | exprbase_symbol
    ;

expression : c=exprbase ('=?' d=exprbase)? -> ^(EXPRESSION $c ($d)?);

lexpr : e=exprbase* -> ^(LEXPR $e*);


