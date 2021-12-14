package Replit_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q06 {

	public static void main(String[] args) {

		/*
		 * Write a program to find the common elements between two String Arrays
		 * (without case sensitivity)
		 * 
		 * Input1 : {John,Brad,Ange,Sofia,Emily}
		 * 
		 * Input2 : {sofia,brad,grace,emily,hazel}
		 * 
		 * Output : [sofia,brad,emily]
		 */
		
		List<String> list1 = new ArrayList<String>(Arrays.asList("John","Brad","Ange","Sofia","Emily"));
		
		List<String> list2 = new ArrayList<String>(Arrays.asList("sofia","brad","grace","emily","hazel"));
		
		List<String> bosList = new ArrayList<String>();
		
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if(list1.get(i).equalsIgnoreCase(list2.get(j))) {
					bosList.add(list2.get(j));
				}
			}
		}
		
		System.out.println(bosList);


	}

}
