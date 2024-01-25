package Question6_2;

public class Restaurant extends Store {

	private double service;
	private double flavor;
	private double clean;

	public Restaurant(String name, String event, double price, double service, double flavor, double clean) {

		this.service = service;
		this.flavor = flavor;
		this.clean = clean;
	}

	public double grade() {

		return (float) (service + flavor + clean + price) / 4;
	}

	public double getService() {
		return service;
	}

	public double getFlavor() {
		return flavor;
	}

	public double getClean() {
		return clean;
	}

	public void setService(double service) {
		this.service = service;
	}

	public void setFlavor(double flavor) {
		this.flavor = flavor;
	}

	public void setClean(double clean) {
		this.clean = clean;
	}
	
	

}
