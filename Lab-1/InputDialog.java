
import javax.swing.JOptionPane;

public class InputDialog {

    public static void main(String[] args){
        String input;
        input = JOptionPane.showInputDialog("Enter your age");
        JOptionPane.showMessageDialog(null, "Age: " + input);
    }

}