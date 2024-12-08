/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author kevin
 */
public class NumberLineJumps {
    
    
    public static String kangaroo(int x1, int v1, int x2, int v2){
        
        
        if(x2 - x1 > 0 && v1 - v2 > 0 && (x2-x1) % (v1-v2) == 0){
            return "YES";
        }
        
        return "NO";
    }
    
}
