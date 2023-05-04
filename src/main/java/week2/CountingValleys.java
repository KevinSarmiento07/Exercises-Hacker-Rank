/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author kevin
 */
public class CountingValleys {
    
    public static void main(String[] args) {
        
        
        String path = "UDDDUDUU";
        
        int count = 0; 
        int step = 0;
        for(int i = 0; i < path.length(); i++){
            char c = path.charAt(i);
            
            if(c == 'U'){
                step++;
                
                if(step == 0){
                    count++;
                }
            }else{
                step--;
            }
            
        }
    }
    
}
