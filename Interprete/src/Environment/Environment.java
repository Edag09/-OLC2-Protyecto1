package Environment;
import java.util.HashMap;
import java.util.Locale;

public class Environment {
    public HashMap<String, Symbol> SymbolTable;
    public Environment global;
    public Environment sig;
    public int last_position;

    public Environment(Environment global){
        SymbolTable = new HashMap<String, Symbol>();
        this.global = global;
        this.last_position = 0;
    }

    public void newSymbol(String name, Symbol nuevo){
        if (SymbolTable.containsKey(name.toUpperCase())){
            System.out.println("La variable "+name+" ya existe.");
        }else{
            SymbolTable.put(name.toUpperCase(), nuevo);
        }
    }

    public Symbol find(String name){
        for (Environment ent = this; ent != null; ent = ent.global){
            if (ent.SymbolTable.containsKey(name.toUpperCase()))
                return ent.SymbolTable.get(name.toUpperCase());
        }
        return null;
    }

    public void actualiseishon(String name, Symbol date){
        for (Environment envi = this; envi != null; envi = envi.global){
            if (envi.SymbolTable.containsKey(name.toUpperCase()))
                envi.SymbolTable.get(name.toUpperCase()).Symbol_value = date;
        }
    }

    public int getSize(){
        int size = 0;
        for (Environment envi = this.global; envi != null; envi = envi.global){
            size += envi.SymbolTable.size();
        }
        return size;
    }
}
