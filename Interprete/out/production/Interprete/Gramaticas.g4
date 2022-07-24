grammar Gramaticas;
//Token
NUMBER: [0-9]+ ;
DECI: [0-9]+[.][0-9]+ ;
STRING: '"' (~["\r\n] | '""')* '"';
//CARACTER: '"' (~["\r\n] | '""')* '"';
ID: [a-zA-Z0-9_]+;
WS: [ \n\t]+ -> skip;

//producciones
init: list_instructions;

list_instructions: instructions list_instructions
                | instructions
;

instructions: decla
;

decla: type ID '=' expr ';'
      | type ID ';'
      | ID '=' expr ';'
      | ID '+' '+'
      | ID '-' '-'
;

type: 'int' | 'string' | 'double' | 'boolean' | 'char';

expr : left=expr op='^' right=expr                                      #opExpr
   | left=expr op=('*'|'/'|'%') right=expr                              #opExpr
   | left=expr op=('+'|'-') right=expr                                  #opExpr
   | left=expr op=('<'| '>' | '<=' | '>=' | '==' | '!=') right=expr     #opExpr
   | left=expr op=('||' | '&&' | '!') right=expr                        #opExpr
   | '(' expr ')'                           #parenExpr
   | atom=NUMBER                            #atomExpr
   | str=STRING                             #strExpr
   | deci=DECI                              #deciExpr
   | bol='True'                             #bolExpr
   | bol='False'                            #bolExpr
   | ident=ID                               #identExpr
;