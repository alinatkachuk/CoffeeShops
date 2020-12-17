package com.alinatkachuk;

import java.util.Scanner;

public class GoToDrinkCoffee {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		MinskCoffeeShop minsk = new MinskCoffeeShop();
		VitebskCoffeeShop vitebsk = new VitebskCoffeeShop();
		GrodnoCoffeeShop grodno = new GrodnoCoffeeShop();
		MogilevCoffeeShop mogilev = new MogilevCoffeeShop();
		BrestCoffeeShop brest = new BrestCoffeeShop();
		GomelCoffeeShop gomel = new GomelCoffeeShop();
		
		int N1; 
		int N2;
		
		do {
		    do {
		    	System.out.print("What city would you like to visit a coffee shop? "
		    			+ "\n" + "    |1.Minsk 2.Vitebsk 3.Grodno 4.Mogilev 5.Brest 6.Gomel|"
		    			+ "\n" + "Please choose a number: ");
		    	N1 = scanner.nextInt();
		    } while (N1<=0);
		} while (N1>6);   
		
		System.out.println();
		
		do {
		    do {
		    	System.out.print("What kind of Coffee do you want?"
		    			+ "\n" + "    |1.Latte 2.Cappuccino 3.Americano 4.Raf|"
		    			+ "\n" + "Please choose a number: ");
		    	N2 = scanner.nextInt();
		    } while (N2<=0);
		} while (N2>4);   
		scanner.close();
		
		System.out.println();
		
		switch (N1) {
        case 1:
        	minsk.Wait();
        	switch (N2) {
        	case 1:
        		minsk.MakeLatte();
        		break;
        	case 2:
        		minsk.MakeCappuccino();
        		break;	
        	case 3:
        		minsk.MakeAmericano();
        		break;
        	case 4:
        		minsk.MakeRaf();
        		break;	
         	}
        	break;
        case 2:
        	vitebsk.Wait();
        	switch (N2) {
        	case 1:
        		vitebsk.MakeLatte();
        		break;
        	case 2:
        		vitebsk.MakeCappuccino();
        		break;	
        	case 3:
        		vitebsk.MakeAmericano();
        		break;
        	case 4:
        		vitebsk.MakeRaf();
        		break;	
         	}
            break;
        case 3:
        	grodno.Wait();
        	switch (N2) {
        	case 1:
        		grodno.MakeLatte();
        		break;
        	case 2:
        		grodno.MakeCappuccino();
        		break;	
        	case 3:
        		grodno.MakeAmericano();
        		break;
        	case 4:
        		grodno.MakeRaf();
        		break;	
         	}
            break;
        case 4:
        	mogilev.Wait();
        	switch (N2) {
        	case 1:
        		mogilev.MakeLatte();
        		break;
        	case 2:
        		mogilev.MakeCappuccino();
        		break;	
        	case 3:
        		mogilev.MakeAmericano();
        		break;
        	case 4:
        		mogilev.MakeRaf();
        		break;	
         	}
            break;
        case 5:
        	brest.Wait();
        	switch (N2) {
        	case 1:
        		brest.MakeLatte();
        		break;
        	case 2:
        		brest.MakeCappuccino();
        		break;	
        	case 3:
        		brest.MakeAmericano();
        		break;
        	case 4:
        		brest.MakeRaf();
        		break;	
         	}
            break;
        case 6:
        	gomel.Wait();
        	switch (N2) {
        	case 1:
        		gomel.MakeLatte();
        		break;
        	case 2:
        		gomel.MakeCappuccino();
        		break;	
        	case 3:
        		gomel.MakeAmericano();
        		break;
        	case 4:
        		gomel.MakeRaf();
        		break;	
         	}
            break;
		}

	}

}
