package org.example;
import java.util.*;
// git token: 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
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// made a change
public class Main {
    public float add(float a,float b){
        return a+b;
    }
    public float sub(float a,float b){
        return a-b;
    }
    public float div(float a,float b){
        if(b!=0)
            return a/b;
        return -999999;
    }
    public float multiply(float a,float b){
        return a*b;
    }

    public static void main(String[] args) {
        Main calc = new Main();
        Scanner in = new Scanner(System.in);
        System.out.println("WELCOME TO HELL, CHOOSE OPTIONS:");
        int choice = 5;
        do{
            System.out.println("1: add");
            System.out.println("2: subtract");
            System.out.println("3: divide");
            System.out.println("4: Multiply");
            System.out.println("5: Exit");
            choice = in.nextInt();
            float a,b,ans;
            switch (choice) {
                case 1:
                    System.out.println("Enter 2 numbers");
                    a = in.nextFloat();
                    b = in.nextFloat();
                    ans = calc.add(a, b);
                    System.out.println("Apka Ans: " + ans);
                    break;
                case 2:
                    System.out.println("Enter 2 numbers");
                    a = in.nextFloat();
                    b = in.nextFloat();
                    ans = calc.sub(a, b);
                    System.out.println("Apka Ans: " + ans);
                    break;
                case 3:
                    System.out.println("Enter 2 numbers");
                    a = in.nextFloat();
                    b = in.nextFloat();
                    ans = calc.div(a, b);
                    if (ans != -999999)
                        System.out.println("Apka Ans: " + ans);
                    else
                        System.out.println("Division by 0 error");
                    break;
                case 4:
                    System.out.println("Enter 2 numbers");
                    a = in.nextFloat();
                    b = in.nextFloat();
                    ans = calc.multiply(a, b);
                    System.out.println("Apka Ans: " + ans);
                    break;
                case 5:
                    System.out.println("Outta Hell");
                    break;
                default:
                    System.out.println("Samajh ni ati kya choices, enter again");
            }
            System.out.println(" ");
        }while(choice!=5);
        in.close();
    }
}