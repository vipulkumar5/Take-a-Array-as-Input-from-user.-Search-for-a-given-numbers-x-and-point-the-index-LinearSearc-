import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]number=new int[size];
        System.out.println("Enter a numbers ");
        for(int i=0; i<number.length;i++){
            
            number[i]=sc.nextInt();
        }
        System.out.println("enter a x value");
        int x=sc.nextInt();
        for(int i=0; i< number.length; i++){
            if(number[i]==x)
            System.out.println("index of x="+i);
            else{
                System.out.println("do not match x value.");
            }
        }
    }
}