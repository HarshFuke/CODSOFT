//Number Game
/**
 * Task1 #CODSOFT
 */
import java.util.Random;
import java.util.*;
public class Task1 {
   public void fun(int count){
if (count ==0){
    System.out.println("Better luck next time");
}
if(count >=1 ){
    System.out.println("well done!!");
}
}

    public static void main(String[] args) {
        System.out.println("welcome to the guess game!!");
        System.out.println("you have to enter a number between 1-100");
        System.out.println("you will be given five chances ");
        Random a = new Random();
        int n = a.nextInt(100)+1;

         int count =0;
        
       
        for(int i =1;i<=5;i++){
            
        Scanner obj = new Scanner(System.in);
        System.out.print("Guess the number between 1-100:");
        int num = obj.nextInt();
        
        
         if(num - n <= 10 && num-n > 0 ){
            System.out.println("you are very close to number . ");
 }else if(n- num <= 10 && n-num > 0 ){
    System.out.println("you are very close to the number.");
 }else if(num-n>10){
    System.out.println("you are far from number");
 }
 else if(n-num>10){
    System.out.println("you are far from number");
 }
 else if (num -n == 0){
            System.out.println("your guess is correct ");
            count ++;
        }

    }
        
        
  Task1 o = new Task1();

       o.fun(count);
       System.out.println("The correct answer is :" + n);
    
     
    }
}