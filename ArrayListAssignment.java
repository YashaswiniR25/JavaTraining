package com.Examples;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignment {
	public static void Calculate(ArrayList<Integer> obj) {
		double sum=0;
		for(int i=0;i<obj.size();i++) {
			sum=sum+obj.get(i);
		}
		System.out.println("Sum : "+sum);
		double Mean=sum/obj.size();
		System.out.println("Mean: "+Mean);
	}
	
	
	public static double Median(ArrayList<Integer> obj) {
		Collections.sort(obj);
		if(obj.size()%2==1)
			return obj.get((obj.size()+1)/2-1);
		else {
			double low=obj.get((obj.size())/2-1);
			double high=obj.get((obj.size())/2);
			return (low+high)/2.0;
		}
	}
	public static void main(String[] args) {
	
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(4);
		obj.add(3);
		obj.add(2);
		obj.add(1);
		System.out.println(obj);
		Calculate(obj);
		System.out.println(Median(obj));
	}

}
