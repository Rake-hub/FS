/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.util.regex.Pattern;

/**
 *
 * @author tarde
 */
public class RegexDNI {

    public static void main(String[] args) {
        String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z]";

        //devuelve true
        System.out.println(Pattern.matches(dniRegexp, "01234567C"));

        //devuelve false
        System.out.println(Pattern.matches(dniRegexp, "01234567U"));
        System.out.println(Pattern.matches(dniRegexp, "0123567X"));

        String emailRegexp = "[^@]+@[^@]+\\.[a-zA-Z]{2,}";

        //  devuelve true
        System.out.println(Pattern.matches(emailRegexp, "a@b.com"));
        System.out.println(Pattern.matches(emailRegexp, "+++@+++.com"));

        // devuelve faslse
        System.out.println(Pattern.matches(emailRegexp, "@b.com")); // Falta el nombre
        System.out.println(Pattern.matches(emailRegexp, "a@b.c")); // El dominio final debe tener al menos dos letras
    }

}
