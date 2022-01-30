import java.util.*;
public class Rock_Paper_Scissor
{
    public static void main(String[]Args)
    {
        System.out.println("Simple rock paper scissor game in java by Vaibhav Raut");
        System.out.println("In this game you wil play with computer"); 
        Scanner sc =new Scanner(System.in);                                   //Just a simple rock paper scissor game using java
        int min,max;
        min = 0;         
        max =2;
         System.out.println("choose 0 for rock , 1 for paper ,and 2 for scossor");
         int choice = sc.nextInt();
         int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);      // for generating random numbers 0-2
         System.out.println("your value is "+choice+ " System value is "+random_int);
         switch(choice)
         {
             case 0:
             if(random_int==0&&choice==0)
             System.out.println("Tie");
             else if(random_int==1&&choice==0)
             System.out.println("you loose");
             else if(random_int==2&&choice==0)
             System.out.println("you win");
             break;
             
             case 1:
             if(random_int==0&&choice==1)
             System.out.println("you loose");
             else if(random_int==1&&choice==1)
             System.out.println("Tie");
             else if(random_int==2&&choice==1)
             System.out.println("you win");
             break;

             case 2:
              if(random_int==0&&choice==2)
             System.out.println("You loose");
             else if(random_int==1&&choice==2)
             System.out.println("you win");
             else if(random_int==2&&choice==2)
             System.out.println("tie");
            break;

             default :
         System.out.println("Invaild value");
         }
    }
    
}
