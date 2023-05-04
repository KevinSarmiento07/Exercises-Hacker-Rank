/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kevin
 */
public class TimeConversion {

    public static String time24(String s) throws ParseException {
        int h1 = 0;
        String hora = "";
        hora = s.substring(0, 2);
        h1 = Integer.parseInt(hora);

        String nuevaHora = "";
        if (s.charAt(8) == 'A' && h1 != 12) {

            nuevaHora = s.substring(0, 8);
        } else if (s.charAt(8) == 'P' && h1 == 12) {
            nuevaHora = s.substring(0, 8);
        } else if (s.charAt(8) == 'P' && h1 != 12) {


            hora = s.substring(0, 2);
            h1 = Integer.parseInt(hora) + 12;
            hora = String.valueOf(h1);
            nuevaHora = hora + s.substring(2, 8);

        } else if (h1 == 12 && s.charAt(8) == 'A') {

            hora = "00";
            nuevaHora = hora + s.substring(2, 8);
        }

        return nuevaHora;

    }

    public static void main(String[] args) throws ParseException {

        String s = "12:05:45PM";

        time24(s);

        System.out.println(time24(s));
    }
}
