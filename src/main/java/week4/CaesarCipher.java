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
public class CaesarCipher {
    
    public static String caesarCipher(String s, int k) {
        String cadenaFinal = "";
        int numSumar = k % 26;
        for(int i = 0; i < s.length(); i++) {
            int codigoAscci = (int) s.charAt(i);
            System.out.println("letra actual: " + s.charAt(i));
            if ((codigoAscci >= 65 && codigoAscci <= 90) || (codigoAscci >= 97 && codigoAscci <= 122 )){
                char letra = (char) (codigoAscci + numSumar);
                if ((codigoAscci + numSumar > 90 && codigoAscci <= 90 && codigoAscci >= 65) || (codigoAscci + numSumar > 122)) {
                    System.out.println("entro en if");
                    letra = (char) ((codigoAscci + numSumar) -26);
                }
                cadenaFinal = cadenaFinal + letra;
            } else {
                cadenaFinal = cadenaFinal + s.charAt(i);
            }
        }   
        return cadenaFinal;
    }
    
    public static void main(String[] args) {
        System.out.println(caesarCipher("!m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U", 62));
    }
    
}
