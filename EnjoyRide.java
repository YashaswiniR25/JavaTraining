package com.fair;

import java.util.Scanner;

public class EnjoyRide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------Welcome to the Rides--------------------------");
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println("| Sl no |      Ride      |     Adult price     |    Child price    |");
		System.out.println("|-------|----------------|---------------------|-------------------|");
		System.out.println("|   1   |     Alibaba    |         $50         |        $40        |");
		System.out.println("|   2   |  Alpine slide  |         $60         |        $30        |");
		System.out.println("|   3   |   Bumper Cars  |         $45         |        $25        |");
		System.out.println("|   4   |   Baloon Race  |         $70         |        $60        |");
		System.out.println("|-------|----------------|---------------------|-------------------|");
		
		
		System.out.println("No of Adults : ");
		int adults =  sc.nextInt();
		
		System.out.println("No of Children : ");
		int child = sc.nextInt();
		
		System.out.println("Sl no of the Ride : ");
		int slno = sc.nextInt();
		
		System.out.println("No of Hours : ");
		int hours = sc.nextInt();
		
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Total hours of Ride : "+hours);
		
		switch(slno) {
		case 1:Alibaba(adults,child,hours);
		break;
		
		case 2:Alpine(adults,child,hours);
		break;
		
		case 3:BumperCars(adults,child,hours);
		break;
		
		case 4:BaloonRace(adults,child,hours);
		break;
		
		default:System.out.println("Enter options only between 1-4");
		break;
		
		
		}
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Thank you, Visit again !!");

	}

	private static void BaloonRace(int adults, int child, int hours) {
		
		System.out.println("Adult Ride Fare : "+(adults*70));
		System.out.println("Children Ride Fare : "+(child*60));
		int y = (70*adults+60*child)*hours;
		System.out.println("Total Fare : "+y);
		
		
	}

	private static void BumperCars(int adults, int child, int hours) {
		System.out.println("Adult Ride Fare : "+(adults*45));
		System.out.println("Children Ride Fare : "+(child*25));
		int y = (45*adults+25*child)*hours;
		System.out.println("Total Fare : "+y);
		
	}

	private static void Alpine(int adults, int child, int hours) {
		System.out.println("Adult Ride Fare : "+(adults*60));
		System.out.println("Children Ride Fare : "+(child*30));
		int y = (60*adults+30*child)*hours;
		System.out.println("Total Fare : "+y);
		
	}

	private static void Alibaba(int adults, int child, int hours) {
		System.out.println("Adult Ride Fare : "+(adults*50));
		System.out.println("Children Ride Fare : "+(child*40));
		int y = (50*adults+40*child)*hours;
		System.out.println("Total Fare : "+y);
	}

}
