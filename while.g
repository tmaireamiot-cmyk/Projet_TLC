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

VARIABLE: ('A'..'Z') (('A'..'Z')|('a'..'z')|('0'..'9'))* ('!'|'?')?;
SYMBOL:   ('a'..'z') (('A'..'Z')|('a'..'z')|('0'..'9'))* ('!'|'?')?;

COMMA : ',' ;
PERCENT : '%' ;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;


program :
    function+ -> ^(PROGRAM function+)
    ;

function :
    'function' s=SYMBOL ':' definition
        -> ^(FUNCTION $s definition)
    ;

definition :
      'read' i=input? PERCENT c=commands PERCENT 'write' o=output
      -> ^(DEFINITION ^(INPUT $i?) ^(OUTPUT $o) $c)
    ;

input :
      v=VARIABLE (COMMA v2=VARIABLE)*
      -> ^(INPUT $v $v2*)
    ;

output :
      v=VARIABLE (COMMA v2=VARIABLE)*
      -> ^(OUTPUT $v $v2*)
    ;

vars :
      v=VARIABLE (COMMA v2=VARIABLE)*
      -> ^(VARIABLES $v $v2*)
    ;

exprs :
      e=expression (COMMA e2=expression)*
      -> ^(EXPRESSIONS $e $e2*)
    ;

commands :
      c=command ( ';' c2=command )*
      -> ^(COMMANDS $c $c2*)
    ;

command_nop :
      'nop' -> ^(NOP)
    ;

command_var :
      v=vars ':=' e=exprs -> ^(VAR $v $e)
    ;

command_if :
    'if' expression 'then' c1=commands ('else' c2=commands)? 'fi'
        -> ^(COMMAND 'if' expression $c1 ($c2)?)
    ;

command_while :
      'while' expression 'do' commands 'od'
      -> ^(COMMAND 'while' expression commands)
    ;

command_for :
      'for' expression 'do' commands 'od'
      -> ^(COMMAND 'for' expression commands)
    ;

command_foreach :
      'foreach' v=VARIABLE 'in' expression 'do' commands 'od'
      -> ^(COMMAND 'foreach' $v expression commands)
    ;

command :
      command_nop
    | command_var
    | command_if
    | command_while
    | command_for
    | command_foreach
    ;

exprbase
    : 'nil'                 -> ^(EXPRBASE 'nil')
    | v=VARIABLE              -> ^(EXPRBASE $v)
    | s=SYMBOL                -> ^(EXPRBASE $s)
    | '(' exprbase_paren ')' -> ^(EXPRBASE exprbase_paren)
    ;

exprbase_paren
    : 'list' lexpr          -> ^(EXPRBASE 'list' lexpr)
    | 'cons' lexpr          -> ^(EXPRBASE 'cons' lexpr)
    | 'hd' exprbase         -> ^(EXPRBASE 'hd' exprbase)
    | 'tl' exprbase         -> ^(EXPRBASE 'tl' exprbase)
    | s=SYMBOL lexpr          -> ^(EXPRBASE $s lexpr)
    ;

expression :
      a=exprbase ('=?' b=exprbase)?
      -> ^(EXPRESSION $a ($b)?)
    ;

lexpr :
      e=exprbase* -> ^(LEXPR $e*)
    ;



