import java.util.concurrent.locks.Condition;

public class WhileLooop {
    public static void main(String[] args) {
        //System.out.println(5<=6);
        //1-10 print 
        //int i=1;
        // while(i<=10){//<= < > <= == != true false
        //     System.out.println(i);
        //     i=i+1;
        // }
        //---->  10-1 --->10 9 8 7 6 5 4 3 2 1
        //int i=10;
        // while(i>=1){
        //     System.out.println(i);
        //     i=i-1;
        // }
        // + - * / %   %->remder /->quotien
        //  int a=5 and b=2   a/b  = 2    a%b = 1
        // int a=5,b=2;
        // System.out.println(a/b); //2
        // System.out.println(a%b);  //1
        //============================================
        //user gives a nuber ,I need each digits
        // int a= 60345   60345%1000 --345
        int a=2576; 
        System.out.println("using while");
        while(a>0){
            int rem=a%10;
            a=a/10;
            System.out.print(rem+" ");
        }
        System.out.println();
        int b=2576;
        System.out.println("using for");
        for(;b>0;b=b/10){
            int rem=b%10;
            System.out.print(rem+" ");
        }
        // a=98547 assment  74589
        //String "this for beginers" ---srenig.....sith
        /// a=759673 ---even numbers print 
        // odd 

    }
}
