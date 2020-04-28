/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jmellen
 */
public class LinkedListRunnerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data = 3;
        LinkedList info = new LinkedList(data);
        
        info.addNode(7);
        info.addNode(2);
        info.addNode(9);
        info.addNode(9);
        info.addNode(10);
        info.addNode(9);
        
        System.out.println(info);
        
        info.deleteValue(9);
        info.deleteValue(9);
        System.out.println(info);
    }
    
}
