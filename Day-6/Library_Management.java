import java.util.*;
class Book{
	ArrayList<Integer> bookId = new ArrayList<>();
	ArrayList<String> title = new ArrayList<>();
	ArrayList<String> author = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
//	public Book(int bookId,String title,String author){
//		this.bookId = bookId;
//		this.title = title;
//		this.author = author;
//	}
	void setBookDetails(){
		System.out.println("Enter Availabel Book Details");
		System.out.println("------Admin Module---------");
		System.out.println("Enter the number of books you want to put in your library");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++){
			System.out.println("Enter Book Id : ");
			bookId.add(sc.nextInt());
			System.out.println("Enter Author name : ");
			author.add(sc.nextLine());
			System.out.println("Enter Title : ");
			title.add(sc.nextLine());
		}
		
		
		
	}
	void isAvailable(){
		System.out.println("Available Books Are : ");
		for(int i=0;i<bookId.size();i++){
			System.out.println("Book Id : "+bookId.get(i));
			System.out.println("Title : "+title.get(i));
			System.out.println("Author Name : "+author.get(i));
		}
	}
	
	public static void main(String[]args){
		
	}
}
class Users extends Book{
	int userId;
	String name;
	Map map = new HashMap();
	Scanner sc = new Scanner(System.in);
	void bookBorrowed(){
		System.out.println("Enter Your Id : ");
		userId = sc.nextInt();
		System.out.println("Enter the bookId you want to borrow : ");
		int book_id = sc.nextInt();
		for(int i=0;i<bookId.size();i++){
			if(bookId.get(i)==book_id){
				System.out.println("Book borrowed Successfully");	
				map.put(bookId.get(i),userId);
				break;
			}
		}
		if(map.size()==0)
			System.out.println("Book is not Available..Please enter available book id");
	}
	void getBorrowedBooks(){
		System.out.println("The books borrower List : ");
		Set set=map.entrySet();  
    		Iterator itr=set.iterator();  
    		while(itr.hasNext()){  
        		Map.Entry entry=(Map.Entry)itr.next();  
        		System.out.println("Book Id : "+entry.getKey()+"\nUser Id : "+entry.getValue());  
    		}  
	}
	void returnBook(){
		System.out.println("-----------Return Book Module--------------");
		System.out.println("Enter your User id : ");
		int u1 = sc.nextInt();
		Set set=map.entrySet();  
    		Iterator itr=set.iterator();  
    		while(itr.hasNext()){  
        		Map.Entry entry=(Map.Entry)itr.next();
			int a1 = (Integer)entry.getValue();
			if(a1 == u1){
				System.out.println("The Book Id under your name is : "+entry.getKey());
				System.out.println("you want to return this book ? (Yes/No)");
				Scanner sc = new Scanner(System.in);
				String que = sc.nextLine();
				if(que.equals("Yes")){
					System.out.println("Book Returned Successfully.....");
					map.remove(entry.getKey());
					break;
				}
			}
    		}  
		
		
	}
	public static void main(String[]args){
		Users one = new Users();
		one.setBookDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Virtual Library Management System! ");
		System.out.println("1. Borrow a Book");
		System.out.println("2. Return a Book");
		System.out.println("3. Display Available Books");
		System.out.println("4. Borrowed Books");
		System.out.println("5. Exit");
		System.out.println("Enter Your Choice : ");
		int choice = sc.nextInt();
		while(choice != 5){
			switch(choice){
				case 1: 
					one.bookBorrowed();
					System.out.println("Enter Your Choice : ");
					choice = sc.nextInt();
					break;
				case 2:
					one.returnBook();
					System.out.println("Enter Your Choice : ");
					choice = sc.nextInt();
					break;
				case 3:
					one.isAvailable();
					System.out.println("Enter Your Choice : ");
					choice = sc.nextInt();
					break;
				case 4:
					one.getBorrowedBooks();
					System.out.println("Enter Your Choice : ");
					choice = sc.nextInt();	
					break;	
			}
		}
		System.out.println("Exiting Virtual Library Management System. Thank you!");
	}
	
}









