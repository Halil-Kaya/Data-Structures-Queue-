/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuyruklar.Array;

/**
 *
 * @author minter
 */
public class Queue<T> {
    
    private T[] dataArray;
    private int front;
    private int rear;
    private int size;
    
    public Queue(int capacity){
        dataArray = (T[])new Object[capacity];
        front = 0;
        rear = 0;
    }
    
    
    public void enqueue(T newdata){
        if(isFull()){
            System.out.println("kuyruk dolu");
        }else{
            dataArray[rear] = newdata;
            rear++;
            
            if(rear % dataArray.length == 0){
                rear = 0;
            }
            
            size++;   
        }
    }
    
    
    public T dequeue(){
        
        if(isEmpty()){
            System.out.println("liste bos");
            return null;
        }else{
            
            T tmp = dataArray[front];
            front++;
            
            if(front % dataArray.length == 0){
                front = 0;
            }
            
            size--;
            
            return tmp;
            
        }
        
        
    }
    
    
    
    public void print(){
        
        int index = front;
        
        for(int i=0;i<size;i++){
            System.out.print(dataArray[index++]+" <- ");
            
            if(index % dataArray.length == 0){
                index = 0;
            }
            
        }
        System.out.println("");
        
    }
    
    
    private boolean isEmpty(){
        return size == 0;
    }
    
    private boolean isFull(){
        return size == dataArray.length;
    }
    
    public int size(){
        return size;
    }
    
    
    
}
