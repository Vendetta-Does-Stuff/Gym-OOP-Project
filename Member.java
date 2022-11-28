import java.time.LocalDate;
import java.time.Period;

public class Member {
	private String name;
	private LocalDate birthDay;
	private Membership membership;
	private double strength;
	private double speed;
	private double endurance;

	Member(String name, String birthDay) {
		this.name = name;
		this.birthDay = LocalDate.parse(birthDay);
	}

	public String getName() {
		return this.name.toString();
	}

	public String getBirthDay() {
		return this.birthDay.toString();
	}

	public int getAge() {
		int age = Period.between(this.birthDay, LocalDate.now()).getYears();

		return age;
	}

	public String getMembership() {
		return membership.getType();
	}

	public int getMembershipCost() {
		return membership.getCost();
	}

	public String getMembershipBenefits() {
		return membership.getBenefits();
	}

	public double getStrength() {
		return this.strength;
	}

	public Double getSpeed() {
		return this.speed;
	}

	public Double getEndurance() {
		return this.endurance;
	}

	public void workOut(WorkOut workOut, int reps) {
		if (this.membership != null) {
			if (workOut.getType().contains("Premium") && this.membership.getType() != "Premium") {
				System.out.printf("%s was escorted out of the premium gym, because they don't have the Premium membership.\n", this.getName());
			} else {
				this.strength += workOut.getStrengthInc() * reps;
				this.speed += workOut.getSpeedInc() * reps;
				this.endurance += workOut.getEnduranceInc() * reps;
				System.out.printf("%s worked out with the %s for %d repetitions.\n", this.getName(), workOut.getType(), reps);
			}
		} else {
			System.out.printf("%s was escorted out of the gym, because they did not purchase a membership.\n", this.getName());
		}
	}

	public void getInfo() {
		System.out.printf("%s was born in %s and is %d years old.\n", this.getName(), this.getBirthDay(), this.getAge());
		if (membership != null) {
			System.out.printf("%s has purchased the %s membership for %d dollars a month and has received the following benefit(s): %s.\n", this.getName(), this.getMembership(), this.getMembershipCost(), this.getMembershipBenefits());
			System.out.printf("%s scores a %f in strength, %f in speed, and %f in endurance.\n", this.getName(), this.getStrength(), this.getSpeed(), this.getEndurance());
		} else {
			System.out.printf("%s is not a member.\n", this.getName());
		}
	}

	public void getStats() {
		if (membership != null) {
			System.out.printf("%s scores a %f in strength, %f in speed, and %f in endurance.\n", this.getName(), this.getStrength(), this.getSpeed(), this.getEndurance());
		} else {
			System.out.printf("%s is not a member.\n", this.getName());
		}
	}

	public void purchaseMembership(Membership membership) {
		this.membership = membership;
	}

}