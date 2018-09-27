/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author User
 */
public class linkedlist {
    public static void main(String[] args) {
                String [] models ={"Toyota Camry Hybrid","Toyota Corrola","Toyota Yaris","Bentley Arnage","Bentley Continental GT","BMW M3","BMW 3 Series","BMW X3"};
String [] Carsbrand ={"Toyota","BMW","Bentley"};

List<String> modelList = new LinkedList<String>();
List<String> brandList = new LinkedList<String>();
        for (String brand : Carsbrand)
        brandList.add(brand);
        
        for (String model : models) {
            modelList.add(model);
        }

        brandList.addAll(modelList);
   modelList= null;    
     printdata(brandList);
     removedata(brandList,5,8);
        System.out.println("");
    printdata(brandList);
    System.out.println("");
    reversedata(brandList);
    }
    
    private static  void printdata(List<String> list){
    for (String getlist : list){
        System.out.println(getlist);
    }
    }
    private static  void removedata(List<String> list, int from,int to){
    list.subList(from, to).clear();
    }
    private static void reversedata(List<String> list){
        ListIterator<String> it = list.listIterator(list.size());
        while(it.hasPrevious()){
        System.out.printf("%s ", it.previous());
        }
    }
}
