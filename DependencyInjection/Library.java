package DependencyInjection;

public class Library {
	private String loc;
	private int volume;
	private Book book;
	public Library(String loc, int volume, Book book) {
		super();
		this.loc = loc;
		this.volume = volume;
		this.book = book;
	}
	@Override
	public String toString() {
		return "Library [loc=" + loc + ", volume=" + volume + ", book=" + book + "]";
	}
	
	
}
