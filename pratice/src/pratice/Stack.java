/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;

import java.util.PriorityQueue;

/**
 *
 * @author User
 */
public class Stack {
        public static void main(String[] args) {
            PriorityQueue<String> qu = new PriorityQueue<String>();
            qu.offer("first");
            qu.offer("second");
            qu.offer("third");
            System.out.println(qu);
            
            System.out.println(qu.peek());
        qu.poll();
        System.out.println(qu);
        
            System.out.println(qu.peek());
        qu.poll();
           System.out.println(qu);
        }
    
}
