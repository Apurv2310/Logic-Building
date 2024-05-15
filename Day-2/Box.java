class Box{
	float height;
	float width;
	float breadth;
	Box(float height,float width,float breadth){
		this.height = height;
		this.width = width;
		this.breadth = breadth;	
	}
	
	float getVolume(){
		float vol = height*width*breadth;
		return vol;
	}
	float getArea(){
		float area = 2*(height*width) + 2*(height*breadth) + 2*(breadth*width);
		return area;
	}
	public static void main(String[]args){
		Box box1 = new Box(23.2f,432.2f,41.f);
		Box box2 = new Box(43.1f,54.f,6.f);
		System.out.println("----------------------------BOX1--------------------------------");
		System.out.println("Volume of box1 is : " +	box1.getVolume());
		System.out.println("Area of box1 is : "+box1.getArea());
		System.out.println("----------------------------BOX2--------------------------------");
		System.out.println("Volume of box2 is : "+box2.getVolume());
		System.out.println("Area of box2 is : "+box2.getArea());
			
	}
}