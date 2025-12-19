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
    LIST;
    NIL;
    FUNC;
    CONS;
    HD;
    TL;
    SYM;
    ASSIGN;
    EXPR_PARENT;
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
      -> ^(DEFINITION $i? $o $c)
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
      v=vars ':=' e=exprs -> ^(ASSIGN $v $e)
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
    : 'nil'                 -> NIL
    | v=VARIABLE              -> ^(VAR $v)
    | s=SYMBOL                -> ^(SYM $s)
    | '(' exprbase_paren ')' -> ^(EXPR_PARENT exprbase_paren)
    ;

exprbase_paren
    : 'list' lexpr          -> ^(LIST lexpr)
    | 'cons' lexpr          -> ^(CONS lexpr)
    | 'hd' exprbase         -> ^(HD exprbase)
    | 'tl' exprbase         -> ^(TL exprbase)
    | s=SYMBOL lexpr          -> ^(FUNC $s lexpr)
    ;

expression :
      a=exprbase ('=?' b=exprbase)?
      -> $a ($b)?
    ;

lexpr :
      exprbase* -> exprbase*
    ;



