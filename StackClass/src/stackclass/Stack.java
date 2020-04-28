package stackclass;

public class Stack {
    Node node;
    public Stack(String value){
        node = new Node();
        node.prev = null;
        node.value = value;
    }
    
    public void push(String value){
        Node temp = new Node();
        if(node == null){
            node = new Node();
            node.value = value;
            return;
        }
        temp.value = value;
        temp.prev = node;
        node = temp;
    }
    
    public String pop(){
        if(node == null)
            return null;
        String value = node.value;
        
        node = node.prev;
        return value;
    }
    
    public String peek(){
        return node.value;
    }
    
    public String toString(){
        Node temp = node;
        String info = "";
        while(temp.prev != null){
            info += temp.value + " ";
            temp = temp.prev;
        }
        info += temp.value + " "; 
        
        return info;
    }
}
