import java.util.Scanner;

public class programs {
    public static void main(String[] args) {
        //length of integer
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=0;
        int c=0;
        while(i<=a){
            c=a%10;
            a=a/10;
            System.out.println();
        }
    }
}
