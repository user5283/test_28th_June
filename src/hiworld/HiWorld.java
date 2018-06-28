/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiworld;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Clera
 */
public class HiWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] countries = new String[4];
        
        countries[0] = "NZ";
        countries[1] = "Australia";
        countries[2] = "Japan";
      //  countries[3] = 12345;
        
        
        //countries[4] = "Canada";
        
        for(int i=0;i<4;i++){
        
            System.out.println(countries[i]);
        }
        
        ArrayList listArray = new ArrayList();
        
        listArray.add("NZ");
        listArray.add(1300);
        listArray.add("Canada");
        
       
           
            
            listArray.add(3,"Japan");
            
             System.out.println(listArray);
             
             
            System.out.println(listArray.get(2));
            
            Iterator it = listArray.iterator();
            
            
            while(it.hasNext()) {
            System.out.println(it.next());
            }
            
            
            
            
             
        
        
        
        
        
        
        
        
    }
    
}
