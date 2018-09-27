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
public class Arraylist {
   
    
    public static void main(String[] args) {
  String [] veges={"latose","carrot","cabbage"};
        String [] foods ={"carrot","sausage","goat meat","cabbage","cow meat","latose"};
     
        List<String> foodlist= new ArrayList<String>();
   List<String> vegelist = new ArrayList<String>();
   
        for (String food : foods) {
   foodlist.add(food);
        }
          for (String vege : veges) {
            vegelist.add(vege);
        }
        
          for (int i = 0; i < foodlist.size(); i++) {
           removeitem(vegelist, foodlist);
              System.out.println(foodlist.get(i));   
        }
         
   
      }
    
    public static void removeitem(Collection<String> item1, Collection<String> item2){ 
        Iterator<String> it = item1.iterator();
        while (it.hasNext()) {
            String next = it.next();
             if (item2.contains(next)) {
                item2.remove(next);
            }
        }
    }
    
}
