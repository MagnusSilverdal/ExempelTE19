import javax.swing.*;

/**
 * This is a class
 * Created 2020-11-10
 *
 * @author Magnus Silverdal
 */
public class EquationSolver {
    public static void main(String[] args) {
        System.out.println("Medelvärdet av 3 och 4 är " + MinaFunktioner.medelvärde(3,4));
        /*int a = 0;
        int b = 0;
        int c = 0;

        boolean isStupid = true;
        while (isStupid) {
            try {
                a = Integer.parseInt(JOptionPane.showInputDialog("Ange konstanten före x^2"));
                b = Integer.parseInt(JOptionPane.showInputDialog("Ange konstanten före x"));
                c = Integer.parseInt(JOptionPane.showInputDialog("Ange konstantentermen i ekvationen a x^2 + b x " +
                        "+ c = 0"));
                isStupid = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Ange koefficienten som ett heltal!");
            }
        }
        double p = ((double)b)/a;
        double q = ((double)c)/a;
        double x1 = -p/2+Math.sqrt(p*p/4-q);
        double x2 = -p/2-Math.sqrt(p*p/4-q);
        System.out.println("Ekvationen har rötterna x=" + x1 + " och x=" + x2 );*/
    }
}
