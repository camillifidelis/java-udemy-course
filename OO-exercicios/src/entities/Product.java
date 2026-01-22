package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	// construtor padrão
	public Product() {
	}
	
	// construtor (é obrigado a fazer)
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// sobrecarga (diferença é o parametro)
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
	// Para gerar automaticamente:
	// botao direito + source + generate constructor using fields (gera construtores)
	// botao direito + source + generate getters and setters (gera metodos getters e setters)
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	} 
	
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueinStock () {
		return price * quantity;
	}
	
	public void addProducts (int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts (int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
		+ ", $ " 
		+ String.format("%.2f", price)
		+ ", " 
		+ quantity
		+ " units, Total: $ "
		+ String.format("%.2f", totalValueinStock());
	}
}
