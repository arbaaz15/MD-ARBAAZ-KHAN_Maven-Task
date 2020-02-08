package MD_ARBAAZ_KHAN.EPAM_Training.MD_ARBAAZ_KHAN.EPAM_Training;

import java.util.ArrayList;
import java.util.Scanner;

public class Candies {

	Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> candywt = new ArrayList<Integer>();
	static ArrayList<Integer> candyprice = new ArrayList<Integer>();
	
    void candy()
    {
	
	
	   System.out.println("Enter the Weight of Candies :");
	   int cwt = sc.nextInt();
	   
	   candywt.add(cwt);
	   
	   
	   System.out.println("Enter the Price of Candies :");
	   int cpr = sc.nextInt();
	   
	   candyprice.add(cpr);
	   
    }  
	
	
	
	
	
	
}
