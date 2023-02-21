package com.github.rsoi;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	private String name;

	public Main(String name) {
		this.name = name;
	}

	ArrayList <Goods> listOfGoods = new ArrayList();



	public static void main(String[] args) {
		System.out.println("Hello, wizards!");

		Main internetShop = new Main("Wizard's Shop");

		Goods good1 = new Goods(1, "The Magic Wand", 150);

		internetShop.listOfGoods.add(good1);
		Goods good2 = new Goods(2, "The Book Hogwarts: A History", 109);
		internetShop.listOfGoods.add(good2);
		Goods good3 = new Goods(3, "The Time-Turner", 20);
		internetShop.listOfGoods.add(good3);
		Goods good4 = new Goods(4, "The Ravenclaw's Diadem", 1);
		internetShop.listOfGoods.add(good4);
		Goods good5 = new Goods(5, "The Broomstick Nimbus 2000", 167);
		internetShop.listOfGoods.add(good5);
		Goods good6 = new Goods(6, "The Golden Snitch", 170);
		internetShop.listOfGoods.add(good6);
		Goods good7 = new Goods(7, "The Invisibility cloak", 3);
		internetShop.listOfGoods.add(good7);
		Goods good8 = new Goods(8, "The Wizard Chess Set", 15);
		internetShop.listOfGoods.add(good8);

		int length = 7;

		int answer1 = 0;


		do {
			System.out.println("Do you want to do something with the list of magic goods?");
			System.out.println("Press:\n1 - yes\n2 - no");
			Scanner input = new Scanner (System.in);
			answer1 = input.nextInt();


			if (answer1 == 1) {
				System.out.println("What do you want to do?");
				System.out.println("Press:\n1 - add product;\n2 - delete product\n3 - show the ranged list of magic goods\n4 - show ё magic goods");
				int answer2;

				Scanner in = new Scanner(System.in);
				answer2 = in.nextInt();


				switch (answer2) {
					case 1:
						Scanner added1 = new Scanner(System.in);
						System.out.println ("Input the ID od added product:");
						int IDAdded = added1.nextInt();
						Scanner added2 = new Scanner(System.in);
						System.out.println ("Input the name of the added product:");
						String nameAdded = added2.nextLine();
						System.out.println ("Input the amount of orders:");
						int amountAdded = added1.nextInt();

                    Goods newGoods = new Goods(IDAdded, nameAdded, amountAdded);
					internetShop.listOfGoods.add(newGoods);
                    length++;
						break;
					case 2:
						System.out.println("Please, input an ID of deleted product:");
						Scanner inputID = new Scanner(System.in);
						int IDofDeleted = inputID.nextInt();
						internetShop.listOfGoods.remove(IDofDeleted - 1);
						length--;
						break;
					case 3:
						Collections.sort(internetShop.listOfGoods, Comparator.comparing(Goods::getAvgMrk));
						Collections.reverse(internetShop.listOfGoods);
						for (int i = 0; i <= length; i++) {
							System.out.println("The goods number " + (i + 1) + ": ID is " + internetShop.listOfGoods.get(i).getIDProduct() + "; the name is " + internetShop.listOfGoods.get(i).getNameProduct() + "; the amount of orders is " + internetShop.listOfGoods.get(i).getAmountOfOrders() + "; the average mark is " + internetShop.listOfGoods.get(i).getAvgMrk());
						}
						break;
					case 4:
						for (int i = 0; i <= length; i++) {
							System.out.println("The goods number " + (i + 1) + ": ID is " + internetShop.listOfGoods.get(i).getIDProduct() + "; the name is " + internetShop.listOfGoods.get(i).getNameProduct() + "; the amount of orders is " + internetShop.listOfGoods.get(i).getAmountOfOrders() + "; the average mark is " + internetShop.listOfGoods.get(i).getAvgMrk());
						}

						break;

				}
				if (answer1 == 2)
					System.out.println("Bye!");

			}
		} while (answer1 == 1);
	}

}


