public class Membership {
	private String type;
	private int cost;
	private String benefits;

	Membership(String type, int cost, String benefits) {
		this.type = type;
		this.cost = cost;
		this.benefits = benefits;
	}

	public String getType() {
		return this.type;
	}

	public int getCost() {
		return this.cost;
	}

	public String getBenefits() {
		return this.benefits.toString();
	}
}