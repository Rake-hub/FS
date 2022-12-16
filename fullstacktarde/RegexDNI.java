
package fundamentos;

import java.util.regex.Pattern;

public class RegexDNI {
    public static void main(String[] args) {
 String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z]";

// Lo siguiente devuelve true
System.out.println(Pattern.matches(dniRegexp, "01234567C"));

// Lo siguiente devuelve faslse
System.out.println(Pattern.matches(dniRegexp, "01234567U")); // La U no es válida
System.out.println(Pattern.matches(dniRegexp, "0123567X")); // No tiene 8 cifras
    }
   
    
}
