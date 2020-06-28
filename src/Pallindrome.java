import java.util.Scanner;

/* Class to check if a particular number is a pallindrome or not*/
public class Pallindrome {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n;
        n=in.nextInt();
        int s,r,t;
        int a = n;
        t=0;

        while (n > 0)
        {
            s=n%10;//getting reminder
            n =n/10;
            t= t*10+s;

        }
        if (a==t)
            System.out.println("Its a Pallindrome");
        else
            System.out.println("Its not a Pallindrome");
    }











}
