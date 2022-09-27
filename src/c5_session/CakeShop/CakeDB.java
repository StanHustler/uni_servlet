package c5_session.CakeShop;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class CakeDB {
    private static Map<String, Cake> cake = new LinkedHashMap<String, Cake>();
    static {
        cake.put("1",new Cake("1","Type A"));
        cake.put("2",new Cake("2","Type B"));
        cake.put("3",new Cake("3","Type C"));
        cake.put("4",new Cake("4","Type D"));
        cake.put("5",new Cake("5","Type E"));
    }

    public static Collection<Cake> getAll(){
        return cake.values();
    }

    public static Cake getCake(String id){
        return cake.get(id);
    }
}
