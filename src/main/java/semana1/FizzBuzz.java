/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1;

/**
 *
 * @author kevin
 */
public class FizzBuzz {
    
    
    public static void main(String[] args) {
     
        
        int n = 15;
        
        
        
        for(int i =1 ; i <= n; i++){
            
            if((i % 3== 0) && (i % 5==0)){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i %5 ==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
