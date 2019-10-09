import java.util.*;
public class Triangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What character do you want your triangle made of");
        String x = sc.nextLine();
        System.out.println("How tall do you want your triangle?");
        int y = sc.nextInt();
        System.out.println("Here's your triangle!");
        for (int a = 0; a<y; a++){
            for (int b = 0; b<=a; b++){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}