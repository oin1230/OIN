package Question6_2;

public abstract class Store {

	protected String name;
	protected String event;
	protected double price;

	public abstract double grade();

	public String getName() {
		return name;
	}

	public String getEvent() {
		return event;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
