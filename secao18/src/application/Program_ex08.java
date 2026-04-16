package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import model.entities.Product_ex08;
import model.services.ProductService;

public class Program_ex08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product_ex08> list = new ArrayList<>();

		list.add(new Product_ex08("Tv", 900.00));
		list.add(new Product_ex08("Mouse", 50.00));
		list.add(new Product_ex08("Tablet", 350.50));
		list.add(new Product_ex08("HD Case", 80.90));

		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getPrice() < 100.0);
 
		System.out.println("Sum = " + String.format("%.2f", sum));
	}
}
