package object2;

public class Object2 {
    
    public static void main(String[] args) {
        avg one = new avg(3, 13, 7);
        avg two = new avg(8, 45, 2);
        
        System.out.println(one);
        System.out.println("one average is " + one.average());
        System.out.println("one min is " + one.min());
        System.out.println("one max is " + one.max());
        
        System.out.println(two);
        System.out.println("two average is " + two.average());
        System.out.println("two min is " + two.min());
        System.out.println("two max is " + two.max());
        
    }
    
}

class avg{
    
    private int var1;
    private int var2;
    private int var3;
    
    public avg(int v1, int v2, int v3){
        var1 = v1;
        var2 = v2;
        var3 = v3;
    }
    
    
    public double average(){
        return (var1 + var2 + var3)/3;
    }
    
    public int min(){
        return Math.min(var1, Math.min(var2, var3));
    }
    
    public int max(){
        return 0;
    }
    
    public String toString(){
        return "avg{" + "var1 = " + var1 + ", var2 = " + var2 + ", var3 = " + var3 + "}";
    }
    
}

