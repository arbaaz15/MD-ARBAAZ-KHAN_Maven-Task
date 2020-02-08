package MD_ARBAAZ_KHAN.EPAM_Training.MD_ARBAAZ_KHAN.EPAM_Training;

import java.util.ArrayList;
import java.util.Scanner;

public class Sweets {

	
	
	Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> sweetwt = new ArrayList<Integer>();
	static ArrayList<Integer> sweetprice = new ArrayList<Integer>();
	
    void candy()
    {
	
	
	   System.out.println("Enter the Weight of Sweets :");
	   int swt = sc.nextInt();
	   
	   sweetwt.add(swt);
	   
	   
	   System.out.println("Enter the Price of Sweets :");
	   int spr = sc.nextInt();
	   
	   sweetprice.add(spr);
	   
    }  
	
}
