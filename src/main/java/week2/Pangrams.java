/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class Pangrams {
    
    public static void main(String[] args) {
        
        String s = "";
        String sMinuscula = s.toLowerCase();
    
     byte bytes[] = sMinuscula.getBytes(StandardCharsets.US_ASCII);

     ArrayList<Byte> arr = new ArrayList<>();
     
     
    for(int i = 0; i < bytes.length; i++){
       if(bytes[i] >= 97 && bytes[i] <= 122){
           arr.add(bytes[i]);
       }
    }
    
    
    boolean bol = false;
   
    for(byte i = 97; i <= 122; i++){
        if(arr.contains(i)){     
            bol = true;
        }else{
            System.out.println( "not pangram");
        }
        
    }
    
    
    if(bol){
       System.out.println( "pangram");
    }

   

    }
    
    
}
