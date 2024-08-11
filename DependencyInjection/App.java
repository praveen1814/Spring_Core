package DependencyInjection;

public class App {

	public static void main(String[] args) {
		Book b=new Book();
		b.setBname("Time Travel");
		b.setPages(68);
		b.setAuthor("PR");
		b.setPrice(300);
		
		Library lb=new Library("Hyderabad",2,b);
		
		System.out.println(lb);

	}

}
