class Product_info{
	private static int productCounter = 1;
	private String id;
	private String name; 
	private int quantity;
	private float price;
	private String category;

	Product_info(String id, String name, int quantity, float price, String category){
		this.id =""+String.format("%03d",productCounter++);
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.category = category;
		
}

	public void setID(String i){
		id = i;
}
	public String getID(){
		return id; 
}
	public void setName(String n){
		name = n;
}
	public String getName(){
		return name; 
}
	public void setQuantity(int q){
		quantity = q;
}
	public int getQuantity(){
		return quantity; 
}
	public void setPrice(float p){
		price = p;
}
	public float getPrice(){
		return price; 
}
	public void setCate(String c){
		category = c;
}
	public String getCate(){
		return category; 
}

}