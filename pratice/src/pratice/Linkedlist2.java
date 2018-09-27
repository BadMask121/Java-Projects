/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;
import java.util.*;
/**
 *
 * @author User
 */
public class Linkedlist2 {

    public static void main(String[] args) {
 String[] fruits ={"pear","orange","guava","watermelon","banana"};
       
        String[] food ={"Rice","Beans","melons","eba","porrage"};
    LinkedList<String> foodlist = new LinkedList<String>(Arrays.asList(food));
        LinkedList<String> fruitlist = new LinkedList<String>(Arrays.asList(fruits));
 
        foodlist.add("pumpkin");
foodlist.addFirst("garri");
    
Collections.sort(foodlist,Collections.reverseOrder());
foodlist.addAll(fruitlist);

food=foodlist.toArray(new String [foodlist.size()]);
                
        for (String x : foodlist) {
            System.out.println(x);
        }
        System.out.print("");
        
        System.out.println("number of pearl : ");
        //finds a repeation of object
        System.out.println(Collections.frequency(foodlist, "pear"));
    }
    
}
