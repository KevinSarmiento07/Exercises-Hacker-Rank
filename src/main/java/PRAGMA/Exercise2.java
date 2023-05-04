/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAGMA;

import java.util.Arrays;

/**
 *
 * @author kevin
 */
public class Exercise2 {
    public static void main(String[] args) {
        
        String skills = "mppzbmbpzcbmpbmczcz";
        char []arr = skills.toCharArray();
        Arrays.sort(arr);
        
        
        int p = 0;
        int c = 0;
        int m = 0;
        int b = 0;
        int z = 0;
        
       
        
        for(int i = 0; i < skills.length(); i++){
            if(arr[i] == 'p'){
                p++;
            }else if(arr[i] =='c'){
                c++;
            }
            else if(arr[i] =='m'){
                m++;
            }else if(arr[i] =='b'){
                b++;
            }else if(arr[i] =='c'){
                z++;
            }
        }
        
        
        Math.min(p, c);
        
        
    }
    
}
