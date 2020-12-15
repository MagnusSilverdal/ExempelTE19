/**
 * This is a class
 * Created 2020-11-17
 *
 * @author Magnus Silverdal
 */
public class MinaFunktioner {
    static double medelvärde(double x, double y) {
        return (x+y)/2;
    }

    public static boolean isPalindrom(String text) {
        int index = 0;
        while (index <= text.length()/2) {
            if (text.charAt(index) != text.charAt(text.length()-1-index)) {
                return false;
            }
            index++;
        }

        return true;
    }

    // Metod som räknar ut roten av ett tall "för hand"
    public static double mySQRT(double y) {

        double xn = 1;
        double xnp1 = xn-(xn*xn-y)/(2*xn);
        System.out.println(xnp1);
        while (Math.abs(xn-xnp1) > 0.0000001) {
            xn = xnp1;
            xnp1 = xn-(xn*xn-y)/(2*xn);
            System.out.println(xnp1);
        }
        return xnp1;
    }
}
