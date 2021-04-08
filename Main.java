import java.util.Scanner;
public class Main{
    
    public static void main(String args[]){
    int total=0;
    Scanner obj=new Scanner(System.in);
    System.out.println("enter no of subjects : ");
    int n=obj.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
    System.out.println("the marks in subject " + (i + 1) + " is : ");
    arr[i]=obj.nextInt();
    
    }
    for(int i=0;i<n;i++){
    total+=arr[i];
    }
    System.out.println(total);
    int avg=total/n;
    int marks =avg/10;
    switch(marks){
    case 9:
        System.out.println("your grade is A " );
        break;
    case 8:
        System.out.println("your grade is B " );
        break;
    case 7:
        System.out.println("your grade is C " );
        break;
    case 6:
        System.out.println("your grade is D " );
        break;
    case 5:
        System.out.println("your grade is E " );
        break;
    default :
       System.out.println("sorry you failed " );
    }
}
    
}
