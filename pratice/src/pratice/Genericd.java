/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;

/**
 *
 * @author User
 * @param <T>
 */
public class Genericd <T> {
    
    public static void main(String[] args) {
        
        Integer [] num ={1,2,3,4};
        String [] word = {"hello","how","are","doing"};
        Character [] cha ={'A','B','C','D'};
        printAce(num);
        printAce(word);
        printAce(cha); 
    }
    public static <gen> void printAce(gen[] get){
        for (gen gettype : get) 
            System.out.printf("%s ",gettype);
           System.out.println();
    }
}
