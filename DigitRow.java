import java.util.Scanner;

public class DigitRow {
    public static void main (String[] args){
        Scanner Input = new Scanner (System.in);
        int numb1, numb2, numb3;

        System.out.println("enter numb1:");
        numb1=Input.nextInt();

        System.out.println("enter numb2:");
        numb2=Input.nextInt();

        System.out.println("enter numb3:");
        numb3=Input.nextInt();

        if (numb1>numb2 && numb1>numb3){
                if (numb2>numb3){
                System.out.println("high to low is:" + numb1 + ">" + numb2 + ">" + numb3);
        }       else {
                System.out.println("high to low is:" + numb1 + ">" + numb3 + ">" + numb2);

        }

        }else if (numb2>numb1 && numb2>numb3){
                if (numb1>numb3){
                System.out.println("high to low is:" + numb2 + ">" + numb1 + ">" + numb3);
        }       else {
                System.out.println( "high to low is:" + numb2 + ">" + numb3 + ">" + numb2);
        }

        }else if (numb3>numb1 && numb3>numb2){
                if (numb1>numb2){
                System.out.println( "high to low is:" + numb3 + ">" + numb1 + ">" + numb2);
        }       else {
                System.out.println( "high to low is:" + numb3 + ">" + numb2 + ">" + numb1);
                }

        }else {
            System.out.print("there is an error!!!;");
                }
        }
    }


