public class WorkOut {
	private String type;
	private double strengthInc;
	private double speedInc;
	private double enduranceInc;

	WorkOut(String type, double strengthInc, double speedInc, double enduranceInc) {
		this.type = type;
		this.strengthInc = strengthInc;
		this.speedInc = speedInc;
		this.enduranceInc = enduranceInc;
	}

	public String getType() {
		return this.type;
	}

	public double getStrengthInc() {
		return this.strengthInc;
	}

	public double getSpeedInc() {
		return this.speedInc;
	}

	public double getEnduranceInc() {
		return this.enduranceInc;
	}
}