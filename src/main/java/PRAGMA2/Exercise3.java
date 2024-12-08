/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAGMA2;

import java.util.Arrays;

/**
 *
 * @author kevin
 */
public class Exercise3 {
    
    
    public static void main(String[] args) {
        
        
        Integer [] price = {2};
        Integer [] query = {8,4,3,10,6};
        
        
        Arrays.sort(price);
        int n = price.length;
        long[] preSum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            preSum[i + 1] = preSum[i] + price[i];
        }
        long[] ans = new long[query.length];
        for (int i = 0; i < query.length; i++) {
            int idx = Arrays.binarySearch(price, query[i]);
            if (idx < 0) {
                idx = -idx - 1;
            }
            long cur = (long) idx * query[i] - preSum[idx];
            cur += (preSum[n] - preSum[idx]) - (n - idx) * query[i];
            ans[i] = cur;
            
            System.out.println(ans[i]);
        }
        
        
    }
    
}
