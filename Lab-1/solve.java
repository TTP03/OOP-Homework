import java.util.Scanner;
import java.lang.Math;

public class solve {
    
    public static void FirstDegree_OneVariable(){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
        if (a==0) {
            if (b==0) System.out.println("Infinite Solution");
            else System.out.println("No Solution");
        }
        else {
            System.out.println("x = "+ (b/a) );
        }
    }

    public static void FirstDegree_TwoVariables(){
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[2][3];
        int count=0;
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                arr[i][j] = sc.nextDouble();
                if ((j<2&&arr[i][j]==0)||(j==2&&arr[i][j]!=0)) count++;
            }
        }
        sc.close();
        double D = arr[0][0]*arr[1][1] - arr[1][0]*arr[0][1];
        double Dx = arr[0][2]*arr[1][1] - arr[1][2]*arr[0][1];
        double Dy = arr[0][0]*arr[1][2] - arr[1][0]*arr[0][2];
        if ( D!=0 ) {
            System.out.println("x = " + (Dx/D));
            System.out.println("y = " + (Dy/D));
        } 
        else{
            if ( Dx!=0 || Dy != 0 || count>=5 ) System.out.println("No solution");
            else System.out.println("Infinite Solution");
        }
    }

    public static void SecondDegree_OneVariable(){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();
        if ( a==0 && b==0 && c!=0 ) System.out.println("No solution");
        else if ( a==0 && b==0 && c==0) System.out.println("Infinite Solution");
        else{
            double delta = b*b-4*a*c;
            if (delta < 0 ) System.out.println("No solution");
            else if ( delta==0) System.out.println("x = "+ (-b/(2*a)));
            else {
                System.out.println("x1 = "+ ( (-b + Math.sqrt(delta))/(2*a)));
                System.out.println("x2 = "+ ( (-b - Math.sqrt(delta))/(2*a)));
            }
        }
    }

    public static void main(String[] args){
        System.out.println("Choose solve type");
        System.out.println("1. ax=b \n2. a1x + b1y = c1 \n   a2x + b2y = c2 \n3. ax^2+bx+c=0");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if (s==1) FirstDegree_OneVariable();
        else if (s==2) FirstDegree_TwoVariables();
        else if (s==3) SecondDegree_OneVariable();
        sc.close();
    }
}