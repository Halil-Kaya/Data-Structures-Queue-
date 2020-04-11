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
public class Test {
    public static void main(String[] args) {
       
        Queue<Integer> kuyruk = new Queue<>();
        
        kuyruk.enqueue(5);
        kuyruk.enqueue(3);
        kuyruk.enqueue(7);
        
        System.out.println("size: "+kuyruk.size());
        kuyruk.print();
        
        
        kuyruk.dequeue();
        kuyruk.print();
    }
}
