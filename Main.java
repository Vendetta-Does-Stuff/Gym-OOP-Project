class Main {
	public static void main(String[] args) {
		Membership regular = new Membership("Regular", 15, "regular gym access");
		Membership premium = new Membership("Premium", 17, "premium gym access and previous benefits");

		WorkOut dumbells = new WorkOut("Dumbells", .1, 0, 0);
		WorkOut benchPress = new WorkOut("Bench Press", .2, 0, 0);
		WorkOut deadLift = new WorkOut("Dead Lift", .3, 0, 0);
		WorkOut treadmill = new WorkOut("Treadmill", 0, .1, .1);
		WorkOut legPress = new WorkOut("Leg Press", .1, .1, .1);
		WorkOut swimmingPool = new WorkOut("Swimming Pool", .15, 0, .15);

		PremiumWorkOut premiumDumbells = new PremiumWorkOut("Premium Dumbells", .1, 0, 0);
		PremiumWorkOut premiumBenchPress = new PremiumWorkOut("Premium Bench Press", .2, 0, 0);
		PremiumWorkOut premiumDeadLift = new PremiumWorkOut("Premium Dead Lift", .3, 0, 0);
		PremiumWorkOut premiumTreadmill = new PremiumWorkOut("Premium Treadmill", 0, .1, .1);
		PremiumWorkOut premiumLegPress = new PremiumWorkOut("Premium Leg Press", .1, .1, .1);
		PremiumWorkOut premiumSwimmingPool = new PremiumWorkOut("Premium Swimming Pool", .15, 0, .15);

		Member member = new Member("John Doe", "1970-01-01");

		member.purchaseMembership(premium);

		member.workOut(premiumDumbells, 5);
		member.workOut(premiumBenchPress, 5);
		member.workOut(premiumDeadLift, 5);
		member.workOut(premiumTreadmill, 5);
		member.workOut(premiumLegPress, 5);
		member.workOut(premiumSwimmingPool, 5);

		System.out.println();

		member.getInfo();
	}
}