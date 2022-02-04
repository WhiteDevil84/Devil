import java.util.Scanner;
public class Simple_calculter 
{
    public static void main(String[]Args)
    {
       Scanner sc = new Scanner(System.in);
       int n,n1,n2,n3;
       System.out.println("Enter 1 for plus , 2 for minus, 3 for multiply,4 for divide");
       n=sc.nextInt();

       switch(n)
       {
           case 1:
           System.out.println("Enter number 1");
           n1 = sc.nextInt();
           System.out.println("Enter number 2");
           n2 = sc.nextInt();
           n3 = n1+n2;
           System.out.println("your value afer adding  "+n1+" and "+n2+" is \n"+n3);
           break;
           case 2:
           System.out.println("Enter number 1");
           n1 = sc.nextInt();
           System.out.println("Enter number 2");
           n2 = sc.nextInt();
           n3 = n1-n2;
           System.out.println("your value afer subtracting"+n1+" and "+n2+" is \n"+n3);
           break;
           case 3:
           System.out.println("Enter number 1");
           n1 = sc.nextInt();
           System.out.println("Enter number 2");
           n2 = sc.nextInt();
           n3 = n1*n2;
           System.out.println("your value afer multiplying "+n1+" and "+n2+" is \n"+n3);
           break;
           case 4:
           System.out.println("Enter number 1");
           n1 = sc.nextInt();
           System.out.println("Enter number 2");
           n2 = sc.nextInt();
           n3 = n1/n2;
           System.out.println("your value afer dividing "+n1+" and "+n2+" is \n"+n3);
           break;
           default:
           System.out.println("Invaild value");
       }
    }
    
}
