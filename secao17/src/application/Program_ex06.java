package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product_ex06;

public class Program_ex06 {

	public static void main(String[] args) {

		Set<Product_ex06> set = new TreeSet<>();

		set.add(new Product_ex06("TV", 900.0));
		set.add(new Product_ex06("Notebook", 1200.0));
		set.add(new Product_ex06("Tablet", 400.0));

		for (Product_ex06 p : set) {
			System.out.println(p);
		}
	}
}