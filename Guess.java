import java.util.*;
public class Guess{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("I've picked a random number between 1 and 100. Try to guess it!");
        int random = (int)(Math.random()*99+1);
        int ans = sc.nextInt();
        int tries = 1;
        while (random!=ans){
            if (random>ans){
                System.out.println("Too low ...");
                tries = tries + 1;
                System.out.println("What's your next guess?");
                ans = sc.nextInt();
            } else if (random<ans){
                System.out.println("Too high ...");
                tries = tries + 1;
                System.out.println("What's your net guess?");
                ans = sc.nextInt();
            } 
        }
        if (random==ans){
                System.out.println("You've guessed my number! Good job! It only took you " + tries + " tries");
            }
    }
}