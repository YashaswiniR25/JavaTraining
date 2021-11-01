package com.FlowerName;

import java.util.Scanner;

public class FlowerDemo {
	private static void displayFlower(String cont) {
		
			switch(cont) {
			case "Asia": 
			case "asia": System.out.println("Asia\t\t| India   \t| Lotus\t          |");
						 System.out.println("\t\t| Pakistan\t| Jasmine\t  |");
						 System.out.println("\t\t| Nepal   \t| Lali Gurans\t  |");
						 break;
		  case "europe":
		  case "Europe": System.out.println("Europe\t\t| Germany\t| Corn Flower\t  |");
		  				 System.out.println("\t\t| France\t| Lily\t          |");
		  			     System.out.println("\t\t| Greece\t| ACANTHUS MOLLIS |");
		  			     break;
		  case "africa":
		  case "Africa": System.out.println("Africa\t\t| Egypt  \t|  Blue Lotus\t  |");
		  				 System.out.println("\t\t| Nigeria\t| Yellow Trumpet  |");
		  				 System.out.println("\t\t| Kenya  \t| Orchid\t  |");
		  				 break;
	  case "antarctica":
	  case "Antarctica": System.out.println("Antarctica\t| Antarctica\t|Colobanthus quitensis|");
	    				 break;
		  				
    case "northamerica":
    case "NorthAmerica": System.out.println("North America\t| USA\t\t| Rose\t\t  |");
   						 System.out.println("\t\t| Cuba  \t| ButterflyJasmine|");
   						 System.out.println("\t\t| Canada  \t| Bunch Berry\t  |");
   						 break;
	   
    case "SouthAmerica":
    case "southamerica": System.out.println("South America\t| Colombia\t| Orchid\t  |");
		 				 System.out.println("\t\t| Brazil  \t| GoldenTrumpet   |");
		 				 System.out.println("\t\t| Peru  \t| Cantuta\t  |");
		 				 break;
	   
   	   case "Australia":
   	   case "australia": System.out.println("Australia\t| Australia\t| Golden Wattle\t  |");
   	   					 break;
   	   	
   	   		default: System.out.println("Enter one among the seven continents:)");
   	   		         break;
			}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of continent: ");
		String cont=sc.next();
		System.out.println("Continent Name  | Country Name  | National Flower | ");
		System.out.println("----------------|---------------|-----------------| ");
		displayFlower(cont);
	}

	

}
