import java.util.Scanner;

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

        Scanner input = new Scanner(System.in);

        System.out.print("Welcome to the gym! Please register a member.\n Name: ");
        String name = input.nextLine();
        System.out.print("Please specify your DOB (yyyy-mm-dd): ");
        String dob = input.nextLine();

        Member member = new Member(name, dob);

        loop: while (true) {
            System.out.printf("\nWelcome, %s! What would you like to do? (Type \"help\" for a list of commands): ", member.getName());
            switch (input.nextLine()) {
                case "help":
                    System.out.println("\npurchase - purchase a membership");
                    System.out.println("info - get your account info");
                    System.out.println("stats - get your stats for strength, speed, and endurance");
                    System.out.println("workout - exercise with different equipment in the gym");
                    System.out.println("leave - leave the gym and unregister");
                    break;

                case "purchase":
                    System.out.println("\nregular - $15 a month; regular gym access");
                    System.out.println("premium - $17 a month; premium gym access");

                    System.out.print("\nPlease select a membership to purchase (or type \"cancel\" to cancel): ");
                    String membership = input.nextLine();

                    if (membership.equals("cancel")) {
                        System.out.println("\nCancelling...");
                    } else if (membership.equals("regular")) {
                        member.purchaseMembership(regular);
                        System.out.println("\nPurchased the Regular membership.");
                    } else if (membership.equals("premium")) {
                        member.purchaseMembership(premium);
                        System.out.println("\nPurchased the Premium membership.");
                    } else {
                        System.out.println("\nThat's not a valid membership!");
                        System.out.println("\nCancelling...");
                    }
                    break;

                case "info":
                    System.out.println();
                    member.printInfo();
                    break;

                case "stats":
                    System.out.println();
                    member.printStats();
                    break;

                case "workout":
                    System.out.println("\ndumbells - +0.1 strength");
                    System.out.println("bench-press - +0.2 strength");
                    System.out.println("dead-lift - +0.3 strength");
                    System.out.println("treadmill - +0.1 speed, +0.1 endurance");
                    System.out.println("leg-press - +0.1 strength, +0.1 speed, +0.1 endurance");
                    System.out.println("swimming-pool - +0.15 strength, +0.15 endurance\n");
                    
                    System.out.printf("Please select a location to work out (type \"cancel\" to cancel): ");
                    String workOut = input.nextLine();

                    switch(workOut) {
                        case "dumbells":
                            System.out.print("repetitions: ");
                            int reps1 = Integer.parseInt(input.nextLine());
                            System.out.print("regular or premium? (premium workouts give a 20% stat bonus): ");
                            String membershipType1 = input.nextLine();

                            if (membershipType1.equals("regular")) {
                                System.out.println();
                                member.workOut(dumbells, reps1);
                            } else if (membershipType1.equals("premium")) {
                                System.out.println();
                                member.workOut(premiumDumbells, reps1);
                            }
                            break;

                        case "bench-press":
                            System.out.print("repetitions: ");
                            int reps2 = Integer.parseInt(input.nextLine());
                            System.out.print("regular or premium? (premium workouts give a 20% stat bonus): ");
                            String membershipType2 = input.nextLine();

                            if (membershipType2.equals("regular")) {
                                System.out.println();
                                member.workOut(benchPress, reps2);
                            } else if (membershipType2.equals("premium")) {
                                System.out.println();
                                member.workOut(premiumBenchPress, reps2);
                            }
                            break;

                        case "dead-lift":
                            System.out.print("repetitions: ");
                            int reps3 = Integer.parseInt(input.nextLine());
                            System.out.print("regular or premium? (premium workouts give a 20% stat bonus): ");
                            String membershipType3 = input.nextLine();

                            if (membershipType3.equals("regular")) {
                                System.out.println();
                                member.workOut(deadLift, reps3);
                            } else if (membershipType3.equals("premium")) {
                                System.out.println();
                                member.workOut(premiumDeadLift, reps3);
                            }
                            break;
                            
                        case "treadmill":
                            System.out.print("repetitions: ");
                            int reps4 = Integer.parseInt(input.nextLine());
                            System.out.print("regular or premium? (premium workouts give a 20% stat bonus): ");
                            String membershipType4 = input.nextLine();

                            if (membershipType4.equals("regular")) {
                                System.out.println();
                                member.workOut(treadmill, reps4);
                            } else if (membershipType4.equals("premium")) {
                                System.out.println();
                                member.workOut(premiumTreadmill, reps4);
                            }
                            break;
                            
                        case "leg-press":
                            System.out.print("repetitions: ");
                            int reps5 = Integer.parseInt(input.nextLine());
                            System.out.print("regular or premium? (premium workouts give a 20% stat bonus): ");
                            String membershipType5 = input.nextLine();

                            if (membershipType5.equals("regular")) {
                                System.out.println();
                                member.workOut(legPress, reps5);
                            } else if (membershipType5.equals("premium")) {
                                System.out.println();
                                member.workOut(premiumLegPress, reps5);
                            }
                            break;
                            
                        case "swimming-pool":
                            System.out.print("repetitions: ");
                            int reps6 = Integer.parseInt(input.nextLine());
                            System.out.print("regular or premium? (premium workouts give a 20% stat bonus): ");
                            String membershipType6 = input.nextLine();

                            if (membershipType6.equals("regular")) {
                                System.out.println();
                                member.workOut(swimmingPool, reps6);
                            } else if (membershipType6.equals("premium")) {
                                System.out.println();
                                member.workOut(premiumSwimmingPool, reps6);
                            }
                            break;
                            
                    }
                    break;

                case "leave":
                    System.out.println("\nGoodbye.");
                    input.close();
                    break loop;
            }        
	}
    }
}
