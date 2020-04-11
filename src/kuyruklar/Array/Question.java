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
public class Question {

    public static void main(String[] args) {

        int k = 10;

        System.out.println(fibonacci(k));

        fibonacciPrint(k);

    }

    public static int fibonacci(int n) {
        Queue<Integer> kuyruk = new Queue<>(2);

        kuyruk.enqueue(0);
        kuyruk.enqueue(1);

        for (int i = 0; i < n; i++) {

            int sum = kuyruk.dequeue();
            kuyruk.enqueue(sum + kuyruk.dequeue());
            kuyruk.enqueue(sum);

        }

        return kuyruk.dequeue();
    }

    public static void fibonacciPrint(int n) {

        Queue<Integer> kuyruk = new Queue<>(2);

        kuyruk.enqueue(0);
        kuyruk.enqueue(1);
        
        for (int i = 0; i < n; i++) {

            int sum = kuyruk.dequeue();
            kuyruk.enqueue(sum);
            kuyruk.enqueue(sum + kuyruk.dequeue());
            System.out.print(kuyruk.dequeue() + " -> ");
            kuyruk.enqueue(sum);

        }

    }

}
