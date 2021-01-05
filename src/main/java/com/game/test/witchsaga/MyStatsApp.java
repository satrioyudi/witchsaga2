package com.game.test.witchsaga;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyStatsApp {

	public void run(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> totalList = new ArrayList<Integer>();
		List<Integer> resList = new ArrayList<Integer>();
		
		int num = 1;
		Boolean flag = false;
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Please enter Age of Death person " + num + " : ");
			int input = scanner.nextInt();
			if(input < 1) {
				flag = true;
			}
			
			list.add(input);

			System.out.print("Please enter Year of Death person " + num + " : ");
			input = scanner.nextInt();
			if(input < 1) {
				flag = true;
			}
			list.add(input);

			totalList.add(list.get(1) - list.get(0));
			list = new ArrayList<Integer>();
			
			System.out.print("Do you want to add new Person ? (y/n) ");
			scanner = new Scanner(System.in);
			String inputStr = scanner.nextLine();
			if (inputStr.toLowerCase().equalsIgnoreCase("n")) { 
				break; 
			}
			
			num++;
		}
		
		if(!flag) {
			totalList.forEach( x ->{				
				int yearOfDeathRes = fibonacciIterative(x);
				resList.add(yearOfDeathRes);
			});
		
			double average = (double) resList.stream().reduce(0, Integer::sum) / (double)resList.size();
			System.out.println("So the average is : " + average);
			
		} else {
			System.out.println(-1);
		}
	}

	public int fibonacciIterative(int num) {
		if(num <= 1) {
			return num;
		}
		int fib = 1;
		int prevFib = 1;
		
		for(int i = 1; i <= num; i++) {
			int temp = fib;
			fib += prevFib;
			prevFib = temp;
		}
		return fib - 1;
	}
}
