package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int v = Integer.parseInt(scan.nextLine());
	int p1 = Integer.parseInt(scan.nextLine());
	int p2 = Integer.parseInt(scan.nextLine());
	double h = Double.parseDouble(scan.nextLine());
    double water = p1*h + p2*h;

	if(water <=v){
        System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",
                (water/v*100),
                (p1*h/water*100),
                (p2*h/water*100));
    }else {
        System.out.printf("For %f hours the pool overflows with %f liters.", h, water - v);
    }


    }
}
