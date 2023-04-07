import java.util.Scanner;

public class triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 2*x-1;
        for ( int i=1; i<=n;i+=2){
            for (int j=1;j<=n;j++){
                if ( j>((n-i)/2)&&j<=(n-(n-i)/2)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}