package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int quantityShapes = sc.nextInt();
		
		
		for (int i=1; i<=quantityShapes; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			
			if(ch == 'r') {
				System.out.print("Color (BLACK/BLUE/RED): ");
				String color = sc.nextLine();
				
				System.out.print("Widht: ");
				double width = sc.nextDouble();
				
				System.out.print("Height: ");
				double height = sc.nextDouble();
			
				list.add(new Rectangle(Color.valueOf(color), width, height));
			}
			else {
				System.out.print("Color (BLACK/BLUE/RED): ");
				String color = sc.nextLine();
				
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
					
				list.add(new Circle(Color.valueOf(color), radius));
			}
		}
		
		System.out.println("");
		System.out.println("SHAPE AREAS: ");
		
		for(Shape item : list) {
			System.out.println(String.format("%.2f", item.area()));
		}
	}

}
