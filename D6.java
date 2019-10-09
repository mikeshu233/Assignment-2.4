import java.util.*;
public class D6{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many D6's do you want to roll?");
        int a = sc.nextInt();
        int sum = 0;
        boolean again = true;
        while (again){
            for (int i = 0; i < a; i++){
                int b = (int)(Math.random()*6);
                System.out.print(b+" ");
                sum = sum + b;
            }
            System.out.println("\r"+"Total:" + sum);
            System.out.println("\r"+"\r"+"Again? [y,n]");
            String ans = sc.next();
            if (ans.equals("y")){
                again=true;
            } else if (ans.equals("n")){
                again=false;
            }
        }
    }
}