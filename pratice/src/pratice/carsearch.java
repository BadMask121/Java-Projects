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
public class carsearch {
    public static void main(String[] args) {
        System.out.println("Cars Database \n");
        Scanner copy = new Scanner(System.in);
        String [] models ={"Toyota Camry Hybrid","Toyota Corrola","Toyota Yaris","Bentley Arnage","Bentley Continental GT","BMW M3","BMW 3 Series","BMW X3"};
String [] Carsbrand ={"Toyota","BMW","Bentley"};

List<String> modelList = new LinkedList<String>();
List<String> brandList = new LinkedList<String>();
        for (String brand : Carsbrand)
        brandList.add(brand);
        
        for (String model : models) {
            modelList.add(model);
        }
       /** 
        brandList.addAll(modelList);
   modelList= null;    
        System.out.println(brandList);
        * 
**/    
        System.out.print("Search for:");
                     String input=copy.next();
       System.out.println(" Brands" + "   "+" Model");
                    
                
                     if(input.toString()==""){
                     System.out.println("No Search Made");
                     System.exit(0);                    
                     }else if (input.equalsIgnoreCase("toyota") || input.equalsIgnoreCase("bmw") || input.equalsIgnoreCase("bentley"))
                     {     
          System.out.println("");
                         for (int i = 0; i < brandList.size(); i++) {
            String getbrandlist = brandList.get(i);
            for (int j = 0; j < modelList.size(); j++) {
                String getmodellist = modelList.get(j);
                if(input.equalsIgnoreCase("toyota")&&getmodellist.contains("Toyota") && getbrandlist.contains("Toyota"))
                {
                System.out.println(getbrandlist + "  "+getmodellist);
                }else if(input.equalsIgnoreCase("bmw")&&getmodellist.contains("BMW") && getbrandlist.contains("BMW"))
                {
                System.out.println(getbrandlist + "  "+getmodellist);
                }else if(input.equalsIgnoreCase("bentley")&&getmodellist.contains("Bentley") && getbrandlist.contains("Bentley"))
                {
                System.out.println(getbrandlist + "  "+getmodellist);
                }
                    }
        }
                     }else{
                     System.out.println("No Search Found!!!");
                     }
        
}
    
}
