package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberSum n = new NumberSum();
        Scanner sc= new Scanner(System.in);
        int[] temp =new int[6];

        //getting input
        System.out.println("Enter 6 numbers: ");
        for(int i=0;i<6;i++){
            temp[i]=sc.nextInt();
        }

        //using set function
        n.setNum(temp);

        //displaying the sum of even numbers
        System.out.println("Sum of even numbers: "+n.evenSum());
    }
}