import java.util.regex.*;
public class T4p1 {
    static boolean curp(String cadena){
        Pattern pat = Pattern.compile("[A-Z][AEIOU][A-Z]{2}[0-9]{6}[HM][A-Z]{2}[A-Z[^AEIOU]]{3}[0-9|A-Z][0-9]");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Cadena vacía");
        }
        else {
            if (curp(args[0])){
                System.out.println("CURP válida");
            }
            else {
                System.out.println("CURP inválida");
            }
        }
    }
}