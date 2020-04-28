package stackclass;

public class StackClass {

    
    public static void main(String[] args) {
        Stack B = new Stack("House");
        B.push("Cat");
        B.push("Dog");
        B.push("Horse");
        B.push("Hamburger");
        System.out.println(B);
        System.out.println(B.pop());
        System.out.println(B.pop());
        System.out.println(B.pop());
        System.out.println(B.pop());
        System.out.println(B.pop());
        System.out.println(B.pop());
        System.out.println(B.pop());
    }
    
}
