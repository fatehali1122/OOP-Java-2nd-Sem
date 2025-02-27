public class Product_Check{
	
	public static void main(String args[]){
		Product_info obj1 = new Product_info("Laptop", 5, 100, "Electronics");
		Product_info obj2 = new Product_info("Phone", 2, 50,"Device" );
		Product_info obj3 = new Product_info("Smart Watch", 4 ,30, "Watch");
		Product_info obj4 = new Product_info("Dell", 3, 300, "Laptop");
		Product_info obj5 = new Product_info("HP", 6 , 400, "Laptop");
		

		System.out.printf("%5s%20s%15s%14s%20s \n\n","ID","Name","Quantity","Price","Category");
		printData(obj1);
		printData(obj2);
		printData(obj3);
		printData(obj4);
		printData(obj5);


}
	public static void printData(Product_info p){
			System.out.printf("%5s\t%20s\t%5d\t\t%f\t%10s \n",p.getID(),p.getName(),p.getQuantity(),p.getPrice(),p.getCate());


}
}