package mod8quiz;

import java.util.Map;
import java.util.TreeMap;


public class Mod8Quiz {

    public static void main(String[] args) {
        
        Map m = new TreeMap(); 

        m.put(new Integer(1),"Amy");

        m.put(new Integer(4),"Ann");   

        m.put(new Integer(3),"Emy");   

        m.put(new Integer(2),"Sue");   

        m.put(new Integer(8),"Lea");   


        System.out.println(m.get(new Integer(1)));


        System.out.println(m.get(new Integer(3)));

        for(int i = 1; i < m.size(); i++)
            System.out.print(m.get(new Integer(i))+" ");


        System.out.println(m.remove(new Integer(2)));

        
    }
    
}
