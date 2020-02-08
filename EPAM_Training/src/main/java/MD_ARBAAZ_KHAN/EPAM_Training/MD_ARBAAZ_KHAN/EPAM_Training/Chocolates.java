package MD_ARBAAZ_KHAN.EPAM_Training.MD_ARBAAZ_KHAN.EPAM_Training;

import java.util.ArrayList;
import java.util.Scanner;

public class Chocolates {
	
	Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> chocowt = new ArrayList<Integer>();
	static ArrayList<Integer> chocoprice = new ArrayList<Integer>();
	
    void chocolate()
    {
	
	
	   System.out.println("Enter the Weight of Chocolates :");
	   int cwt = sc.nextInt();
	   
	   chocowt.add(cwt);
	   
	   
	   System.out.println("Enter the Price of Chocolates :");
	   int cpr = sc.nextInt();
	   
	   chocowt.add(cpr);
    }   

}