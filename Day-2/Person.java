class Person {
	int age;
	float height;
	float weight;
	Person(int age,float height,float weight){
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	Person(int age,float weight){
		this.age = age;
		this.weight = weight;
	}
	Person(int age){
		this.age = age;
	}
	void display(){
		if(height==0.0 && weight != 0.0){
			System.out.println("Age = "+age+"\nWeight = "+weight);
		}
		else if(height==0.0 && weight == 0.0){
			System.out.println("Age = "+age);
		}
		else{
			System.out.println("Age = "+age+"\nHeight = "+height+"\nWeight = "+weight);
		}
	}
	public static void main(String[]args){
		Person p1 = new Person(23,5.3f,78.4f);
		Person p2 = new Person(45,98.4f);
		Person p3 = new Person(101);
		System.out.println("-----------------Details of Person p1------------------");
		p1.display();
		System.out.println("-----------------Details of Person p2-------------------");
		p2.display();
		System.out.println("-----------------Details of Person p3--------------------");
		p3.display();
	}
}