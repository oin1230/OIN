package Question6_2;

public class salon extends Store {

	private double technology;
	private double kindness;

	public salon(String name, String event, double technology, double kindness, double price) {

		this.technology = technology;
		this.kindness = kindness;
	}

	public double grade() {

		return (float) ((technology + kindness + price) / 3);
	}

	public double getTechnology() {
		return technology;
	}

	public double getKindness() {
		return kindness;
	}

	public void setTechnology(double technology) {
		this.technology = technology;
	}

	public void setKindness(double kindness) {
		this.kindness = kindness;
	}
	
	

}
