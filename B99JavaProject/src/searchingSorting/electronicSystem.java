package searchingSorting;

import java.util.Scanner;

public class electronicSystem {
	
	static Scanner sc=new Scanner(System.in);
	
	static item[] I;
	
	public electronicSystem(){
		I=new item[5];
		
		I[0]=new item("TV", 700000.00, 20);
		I[1]=new item("phone", 500000.00, 10);
		I[2]=new item("microwave", 200000.00, 7);
		I[3]=new item("iron", 10000.00, 12);
		I[4]=new item("oven", 300000.00, 8);
		
		
	}
	
	public void WelcomePage() {
		System.out.println("Welcome electronic system");
		System.out.println("1. view sell item list");
		System.out.println("2. search item list by item name");
		System.out.println("Choose option: ");
		int option=sc.nextInt();
		
		switch (option) {
		case 1: {
			viewSellItem();
		}break;
		case 2: {
			searchItem();
		}break;
		default:
			System.out.println("Wrong Input");
			WelcomePage();
		}
	}
	
	public void viewSellItem() {
		for (item i:I) {
			System.out.println(i.getItemName()+" "+i.getPrice()+" "+i.getQuantity());
		}
	}
	
	public void searchItem() {
		sc.nextLine();
		System.out.println("Enter search key item name: ");
		
		String name=sc.nextLine();
		int i;
		for ( i = 0; i < I.length; i++) {
			if (name.equalsIgnoreCase(I[i].getItemName())) {
				System.out.println(I[i].getItemName()+"  "+I[i].getPrice()+"  "+I[i].getQuantity());
				break;
			}
		}
		if (i==I.length) {
			System.out.println(name+" is not found");
		}
	}



}
