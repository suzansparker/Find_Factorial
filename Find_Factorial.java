import java.util.Scanner;

public class Find_Factorial {
    public  static int Fact(int n) {
        if (n == 0) {return 0;}
        return (n - 1) * n;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        System.out.println(Find_Factorial.Fact(n));

    }}