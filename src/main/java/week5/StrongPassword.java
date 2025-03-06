/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author kevin
 */
public class StrongPassword {
    public static int minimumNumber(int n, String password) {
    // Return the minimum number of characters to make the password strong
        int res = 0;
        boolean[] isMatch = {false, false, false, false};
        String specialChar = "!@#$%^&*()-+";
        for (char c: password.toCharArray()){
            if (c >= '0' && c <= '9' && !isMatch[0])
                isMatch[0] = true;
            else if(c >= 'a' && c <= 'z' && !isMatch[1])
                isMatch[1] = true;
            else if(c >= 'A' && c <= 'Z' && !isMatch[2])
                isMatch[2] = true;
            else if(specialChar.contains(String.valueOf(c)) && !isMatch[3])
                isMatch[3] = true;
            
            for (boolean b : isMatch){
                if (!b) res++;
            }
            int sum = n+res;
            if(sum<6)res +=(6-sum);
        }
        return res;
    }
}


//public static int minimumNumber(int n, String password) {
//// Return the minimum number of characters to make the password strong
//int res = 0;
//boolean[] isMatch = {false, false, false, false};
//// isMatch = [digit,lowerCase,upperCase,specialChar]
//String specialChar = "!@#$%^&*()-+";
//for (char c : password.toCharArray()) {
//if (c >= '0' && c <= '9' && !isMatch[0]) 
//       isMatch[0] = true;
//else if (c >= 'a' && c <= 'z' && !isMatch[1])
//       isMatch[1] = true;
//else if (c >= 'A' && c <= 'Z' && !isMatch[2]) 
//       isMatch[2] = true;
//else
// if (specialChar.contains(String.valueOf(c)) && !isMatch[3])
//       isMatch[3] = true;
//}
//        for (boolean b : isMatch) {
//            if (!b) res++;
//        }
//        int tmp = n + res;
//        if (tmp < 6) res += (6 - tmp);
//        return res;
//    }