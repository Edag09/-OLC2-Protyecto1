import Environment.Environment;
import Environment.Symbol;
import Gramatica.GramaticasParser;

import java.util.ArrayList;

public class Subroutine {
    public String sub_name;
    public ArrayList<Symbol> sub_params;
    public Object listInstruct;
    public GramaticasParser.ParamsubContext declaration_params;
    public Environment environment_Subroutine;

    public Subroutine(String name_sub, ArrayList<Symbol> params_sub, Object list_instruct, GramaticasParser.ParamsubContext g_params){
        this.sub_name = name_sub;
        this.sub_params = params_sub;
        this.listInstruct = list_instruct;
        this.declaration_params = g_params;
    }
}
