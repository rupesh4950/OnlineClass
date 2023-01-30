import java.util.Scanner;

public class string {
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter int");
    //     int a=sc.nextInt();
       
    //     System.out.println("enter string");
    //     String s=sc.nextLine();
    //     System.out.println(s);
    //     System.out.println(a+" int val");  
    //   //  System.out.println(n1);
    // }
//     public static void main(String[] args) {
//         //scanner- sc.next()-only word  sc.nextLine();-line or paragraph or 
//                                             //group of words
//         //String methods- lenght()-length of the string 
//                 // surekha hlo
//                     // toCharArray();- to convert a string into a character array
//                     //= new String()  String s=new String("ahfdj");

//     }
public static void main(String[] args) {
    int a[]={9,8,6,7,0};
    int i=0,j=a.length-1;// sl i j  temp  a[i] a[j] // 7 8 6 9
    while(i<a.length/2){         //   1 01 32   9                         
        int temp=a[i];  //   2 1  2
        a[i]=a[j];// 
        a[j]=temp;//  
        i++;
        j--;
    }// 145=/1**3 + 4**3 + 5**count  14567=1**5 +4**5+ */
    // 99 * 98* 97*...................................*-97*-98*-99=0
     int j=a.length-1;
     for(int i=0;i<a.length/2;i++){
         int temp=a[i];
         a[i]=a[j];
        a[j]=temp;
         j--;
    }
    for(int n=0;n<a.length;n++){
        System.out.print(a[n]+" ");
    }
 }
}