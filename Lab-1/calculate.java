import javax.swing.JOptionPane;

public class calculate{
    public static void main(String[] args){
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.valueOf(strNum1);
        strNum2 = JOptionPane.showInputDialog(null,"Please input the second number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.valueOf(strNum2);
        String[] str = new String[4];
        str[0] = "num1 + num2 = " +(num1+num2);
        str[1] = "num1 - num2 = " +(num1-num2);
        str[2] = "num1 x num2 = " +(num1*num2);
        str[3] = "num1 : num2 = " +(num1/num2);
        JOptionPane.showMessageDialog(null,str[0] + "\n" + str[1] + "\n" + str[2] + "\n" + str[3] ,"Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}