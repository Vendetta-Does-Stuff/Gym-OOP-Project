public class PremiumWorkOut extends WorkOut {
	PremiumWorkOut(String type, double strengthInc, double speedInc, double enduranceInc) {
		super(type, strengthInc * 1.2, speedInc * 1.2, enduranceInc * 1.2);
	}
}