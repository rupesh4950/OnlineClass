import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        //int i=0;
        // for(;i<100;){  //for (intitilization(3) ; condition  (1) ; inc/dec(2))
        //     System.out.println("inside for"+i);
        //     i++;
        // }
        // for(int i=100;i>=0;i--){
        //     System.out.println(i);
        // }
        // for(int i=1;i<=100;i=i+2){ //2 4 6 8 10 ....
        //     System.out.println(i);
        // }
        Scanner sc=new Scanner(System.in);
        int a=0;
        for(int i=0;i<10;i++){
            System.out.println("enter number");
            a=sc.nextInt();
            System.out.println(a);
        }
    }
}
