/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuyruklar.LinkedList;

/**
 *
 * @author minter
 */
public class Queue<T> {
    
    private Node<T> front;
    private Node<T> rear;
    
    
    public void enqueue(T newData){
        
        Node<T> newNode = new Node<>(newData);
        
        if(isEmpty()){
            front = newNode;
            rear = newNode;
            
        }else{
            rear.nextNode = newNode;
            rear = newNode;
        }
        
    }
    
    public T dequeue(){
        
        if(isEmpty()){
            System.out.println("liste bos");
            return null;
        }else{
            
            T tmp = front.data;
            
            front = front.nextNode;
            
            if(isEmpty()){
                rear = null;
            }
            
            return tmp;
        }
        
    }
    
    
    public void print(){
        
        
        Node<T> temp = front;
        
        while(temp != null){
            System.out.print(temp.data+" <- ");
            temp = temp.nextNode;
        }
        
        System.out.println("null");
        
        
    }
    
    public int size(){
        
        int size = 0;
        
        Node<T> temp = front;
        
        while(temp != null){
            size++;
            temp = temp.nextNode;
        }
        
        
        return size;
    }
    
    
    private boolean isEmpty(){
        return front==null;
    }
    
    
}
