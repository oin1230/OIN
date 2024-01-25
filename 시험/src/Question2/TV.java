package Question2;

public class TV {

	private String name;
	private int year;
	private int size;
	
	public TV(String name, int year, int size) {
		this.name = name;
		this.year = year;
		this.size = size;
	}

	public void show() {
		System.out.println(name+"에서 만든 "+ year +"년형 "+ size +"인치 TV");
		
	}

	
	public static void main(String[] args) {
		
		TV myTV = new TV("2023", 2023, 100);
		myTV.show();
	}
	
}
