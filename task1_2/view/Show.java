package task1_2.view;

import task1_2.execute.Perfect;

import java.util.Arrays;      //Used only to perform my result;
import java.util.Scanner;

public class Show {



    public static void main(String[] args){
        Perfect P = new Perfect();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter boundary of range: ");
        int input = in.nextInt();
        System.out.println(Arrays.toString(P.findAllPerf(input)));

    }

}
