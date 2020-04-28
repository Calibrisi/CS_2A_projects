/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jmellen
 */
public class LinkedList {
    Node header;
    
    public LinkedList()
    {
        header = null;
    }
    public LinkedList(int data)
    {
        header = new Node();
        header.value = data;
    }
    public void addNode(int data)
    {
        Node temp = header;
        if(header != null)
        {
            //list has at least one node, add at end
            addNode(data,temp);
        }
        else
        {
            //list is empty, create node
            header = new Node();
            header.value = data;
        }
    }
    private void addNode(int data, Node node)
    {
        //this is a helper method that implements adding at the end of the list
        if(node.next == null)
        {
            node.next = new Node();
            node = node.next;
            node.value = data;
            return;
        }
        addNode(data,node.next);
    }
    
    public void deleteFirst()
    {
        header = header.next;
    }
    
    private Node deleteValueHelper(int data, Node node)
    {
        if(node == null) return null;
        if(node.value == data)
        {
            //one to delete
            return node.next;
        }
        else
        {
            node.next = deleteValueHelper(data, node.next);
            return node;
        }
    }
    
    public void deleteValue(int data)
    {
          // use recursion to find the value and delete it __ similar to addNode
        header = deleteValueHelper(data, header);
        
    }
    
    public String toString()
    {
        String data = "";
        if (header != null)
        {
            Node temp = header;
            data = toString(temp);
        }
        return data;
    }
    public String toString(Node node)
    {
        if(node != null)
        {
            return node.value + " " + toString(node.next);
        }
        return "";
    }
}
