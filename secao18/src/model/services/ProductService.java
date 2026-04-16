package model.services;

import java.util.List;
import java.util.function.Predicate;
import model.entities.Product_ex08;

public class ProductService {

	public double filteredSum(List<Product_ex08> list, Predicate<Product_ex08> criteria) {
		double sum = 0.0;
		for (Product_ex08 p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}