import java.util.*;
public class RunningTally{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's add some numbers! [Type a negative number to quit]");
        System.out.println("Add:");
        int i = sc.nextInt();
        int sum = 0;
        while (i>=0){
            sum=sum+i;
            System.out.println("Add: ");
            i = sc.nextInt();
        }
        System.out.println("Your total is " + sum);
    }
}