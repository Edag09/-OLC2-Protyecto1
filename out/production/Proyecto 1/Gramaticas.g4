grammar Gramaticas;

options { caseInsensitive = true; }
//Token
NUMBER: [0-9]+ ;
FLOAT: [0-9]+[.][0-9]+ ;
CHARACTER: ["|'][A-Z]["|'];
//IMPRESION: ["|'][a-zA-Z \t-_]*["|'];
STRING: '"' (~["\r\n] | '""')* '"';
ID: [A-Z0-9_]+;
WS: [ \n\t]+ -> skip;
COMENTARIO: '!'(~[\n])+ -> skip;

//producciones
init: list_instructions;

list_instructions: instructions (instructions)*
;

instructions: subroutine //✔✔
             |function  //✔
             |program
             |imprimir
             |declaration
             |asignacion
             |decla_array //✔
             |asignacion_array //✔
             |call
             |sentes_if
             |sentes_do
             |sentes_do_while
             |subroutine_sin_params
             |function_sin_params
             |call_sin_params
;

program: 'program' idprogram1=ID 'implicit none' list_instructions 'end' 'program' idprogram2=ID //✔
;

subroutine: 'subroutine' idsub1=ID '(' params ')' 'implicit none' paramsub list_instructions 'end' 'subroutine' idsub2=ID   //✔
;

subroutine_sin_params: 'subroutine' idsub1=ID '(' ')' 'implicit none' list_instructions 'end' 'subroutine' idsub2=ID   //✔
;

paramsub: g+
;

g: type ',' 'intent(in)' '::' ID
;

function: 'function' idfun1=ID '(' params ')' 'result' '(' res=ID')' 'implicit none' paramsub list_instructions type '::' rest=ID  rest1=ID '=' expr 'end' 'function' idfun2=ID
;

function_sin_params: 'function' idfun1=ID '(' ')' 'result' '(' res=ID')' 'implicit none' list_instructions type '::' rest=ID  rest1=ID '=' expr 'end' 'function' idfun2=ID
;

params: expr (',' expr)*;

//-------------------------------------------Yasta------------------------------------------------------
imprimir: 'print' '*' ',' expr (',' expr)*
;

declaration: type '::' ID   #declaNormSinVal    //✔
            | type '::' expr (',' expr)*      #declaVarias //✔
            | type '::' ID '=' expr         #declaNorm  //✔
            | type '::' ID '=' expr (',' expr)*     #declaVariasExpr
            | type '::' ID '('expr (',' expr)*')'   #declaFunc
;

asignacion: ID '=' expr                 #normalAsig //✔
          | ID '(' ':' ',' ':' ')' '=' expr*    #asdvector
          | ID '(' ':' ')' '=' expr*            #asdvector
          | ID '('NUMBER')'                     #asdvector
;
//------------------------------------------------------------------------------------------------------------

sentes_if: 'if' '(' expr ')' 'then' instruct* 'end' 'if'    #if
        | 'if' '(' expr ')' 'then' instruct* 'else' intElse* 'end' 'if'     #ifelse
        | 'if' '(' expr ')' 'then' instruct* 'else' sentes_if   #ifanidado
;

sentes_do: d='do' ID '=' num1=expr ',' num2=expr ',' paso=expr  instruct* 'end' 'do'   #dofor
         | d='do' ID '=' number1=expr ',' number2=expr  instruct* 'end' 'do'  #do
;

sentes_do_while: d='do' 'while' '('ex=expr*')' instruct* 'end' 'do'
;

control_cicle:'exit' ID
             | 'cycle' ID
;

cycle_tag: c1=ID ':' sentes_do c2=ID
;

//----------------------------------------------------yasta---------------------------------------------------
decla_array: type ',' 'dimension' '('expr')' '::' ID  #vector //✔
            | type '::' ID '('expr')'                 #vector //✔
            | type ',' 'dimension' '('f=expr ',' c=expr')' '::' ID #array //✔
            | type '::' ID '('f=expr ',' c=expr')'                 #array //✔
            | type ',' 'allocatable' '::' ID '(' ':' ')'                #vdinamic
            | type ',' 'allocatable' '::' ID '(' ':' ',' ':' ')'        #mdinamic
;
asignacion_array: type '::' asignacion #asigMatrix
                | ID '=' '(' '/' expr (',' expr)* '/' ')' #asigVector
                | ID '['tam=expr']' '=' expr          #aVector
                | ID '['f=expr ',' c=expr']' '=' expr #aMatrix
                | 'allocate' '(' ID '(' expr ')' ')'  #asigVectorDin
                | 'allocate' '(' ID '(' f=expr ',' c=expr ')' ')' #asigMatrixDin
                | 'deallocate' '(' ID ')'   #desasignar
                //| type '::' ID '(' expr (',' expr)* ')'
;
//--------------------------------------------------------------------------------------------------------------

call: 'call' ID '(' e ')'
;

call_sin_params: 'call' ID '(' ')'
;

e:expr (',' expr)*
;

a: instruct (instruct)*
;

instruct: imprimir //✔
        | declaration //✔
        | asignacion //✔
        | decla_array
        | asignacion_array
        | sentes_if //✔
        | sentes_do //✔
        | sentes_do_while //✔
        | control_cicle //✔
        | cc=('exit'|'cycle')
        | cycle_tag
        | call //✔
        |call_sin_params
;

intElse: imprimir
            | declaration
            | asignacion
            | decla_array
            | asignacion_array
            | sentes_if
            | sentes_do
            | sentes_do_while
            | control_cicle
            | cc=('exit'|'cycle')
            | cycle_tag
            | call
            | call_sin_params
;

type: 'integer' | 'real' | 'complex' | 'character' | 'logical';

expr: left=expr op='**' right=expr        #opExpr
    | left=expr op=('*'|'/') right=expr                 #opExpr
    | left=expr op=('+'|'-') right=expr                 #opExpr
    | left=expr op=('==' | '.eq.' | '/=' | '.ne.' | '>' | '.gt.' | '<' | '.lt.' | '>=' | '.ge.' | '<=' | '.le.') right=expr   #opRela
    | left=expr op=('.and.' | '.or.' ) right=expr      #opLogica
    |  '.not.'  expr                       #notExpr
    | '('expr')'                          #parenExpr
    | deci=FLOAT                          #deciExpr     //✔
    | entero=NUMBER                       #enteroExpr   //✔
    | char=CHARACTER                      #charExpr     //✔
    | impStr=STRING                       #impStrExpr   //✔
    | id=ID                               #idExpr       //✔
    | bool='.false.'                      #boolfExpr     //✔
    | bool='.true.'                       #boolExpr     //✔
    | ID '(' params ')'                   #fconparams
    | ID '(' ')'                          #fsinparams
    | tam='size' '('ID')'                 #tamVec       //✔
    | ID '[' expr ']'                       #accesoV
    | ID '[' f=expr ',' c=expr ']'          #accesoM
;