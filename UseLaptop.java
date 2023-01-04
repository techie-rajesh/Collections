package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
 class Laptop 
{
	private String brand;
	private int price;
	private boolean isWarranty;
	private boolean isTouchScreen;
	private String color;
	private int memory;
	private float stoarge;
	private int serialNo;
	public Laptop(String brand, int price, boolean isWarranty, boolean isTouchScreen, String color, int memory,
			float stoarge,int serialNo) {
		super();
		this.brand = brand;
		this.price = price;
		this.isWarranty = isWarranty;
		this.isTouchScreen = isTouchScreen;
		this.color = color;
		this.memory = memory;
		this.stoarge = stoarge;
		this.serialNo=serialNo;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isWarranty() {
		return isWarranty;
	}
	public void setWarranty(boolean isWarranty) {
		this.isWarranty = isWarranty;
	}
	public boolean isTouchScreen() {
		return isTouchScreen;
	}
	public void setTouchScreen(boolean isTouchScreen) {
		this.isTouchScreen = isTouchScreen;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int processor) {
		this.memory = processor;
	}
	public float getStoarge() {
		return stoarge;
	}
	public void setStoarge(float stoarge) {
		this.stoarge = stoarge;
	}
	public void setSerialNo(int serialNo)
	{
		this.serialNo=serialNo;
	}
	public int getSerialNo()
	{
		return serialNo;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", isWarranty=" + isWarranty + ", isTouchScreen="
				+ isTouchScreen + ", color=" + color + ", Memory=" + memory + ", stoarge=" + stoarge + "]";
	}
}
public class UseLaptop {
	public static void main(String[] args) {
		ArrayList<Laptop> laptops=new ArrayList<>();
		laptops.add(new Laptop("Asus", 54000, true, false, "Black", 6, 1.0f,1));
		laptops.add(new Laptop("Hp", 64000, true, true, "Cilver", 8, 2.0f,2));
		laptops.add(new Laptop("Dell", 44000, false, false, "White", 6, 0.5f,3));
		laptops.add(new Laptop("Lenova", 54000, true, false, "Grey", 6, 1.0f,4));
		laptops.add(new Laptop("Acer", 30000, false, false, "White", 4, 2.0f,5));
		laptops.add(new Laptop("MSI", 74000, true, true, "Red", 12, 3.0f,6));
		laptops.add(new Laptop("Ipad", 54000, true, false, "Black", 8, 1.0f,7));
		laptops.add(new Laptop("MacBook", 98000, true,true, "Blue", 4, 3.0f,8));
		laptops.add(new Laptop("Asus", 54000, true, false, "Black", 64, 2.0f,9));
		laptops.add(new Laptop("Mi", 74000, true, true, "Blue", 12, 3.5f,10));
		
		

		System.out.println(" my \" 2nd \" day work");
		System.out.println(" my \" 2nd \" day work");
		System.out.println(" my \" 2nd \" day work");
		
		// reduce the code Rajesh
	}
}

