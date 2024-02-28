class Vehicle{
	int price;
	String color;
	String model;
	Vehicle(int price,String color,String model){
		this.price = price;
		this.color = color;
		this.model = model;
	}
	void Display(){
		System.out.println("Price = "+price+"\nColor = "+color+"\nModel = "+model);
	}
	public static void main(String[]args){
		Vehicle v1 = new Vehicle(2322112,"Black","SADAK-1.0");
		v1.Display();
	}
}