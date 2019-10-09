import java.util.*;
public class Bar{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("What character do you want your bar made of?");
        String x = sc.nextLine();
        System.out.println("How long do you want your bar?");
        int b = sc.nextInt();
        System.out.println("Here's your bar!");
        for (int a=0; a<b; a++){
            System.out.print(x);
        }
    }
}