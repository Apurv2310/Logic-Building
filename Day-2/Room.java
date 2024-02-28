class Room{
	double height = 12.2;
	double width = 3;
	double breadth = 8.73;
	void volume(){
		double vol = height * width * breadth;
		System.out.println("Volume of room is : "+vol);
	}
	public static void main(String[]args){
		Room r1 = new Room();
		r1.volume();
	}
}