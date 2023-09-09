//Name: Michael Pollock
//Time: 7 hours
//References: Learned about an escape key, helpful for drawing a martini glass https://www.youtube.com/watch?v=LsvVdx2IE4c&t=202s
//General comments: If I were to redo this, I would try to do it without every loop being nested into the original. That made it difficult
//					to get to the fight section without failing one of the checks. I had to add other loops to bypass statements that didn't
//					apply to the scenario being run.

public class Club {
	public static void main(String[] args) {
		//Print dance club name
		ConsoleIO.printLine("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
		ConsoleIO.printLine("| | |W|E|L|C|O|M|E| |T|O| | |");
		ConsoleIO.printLine("| | | | | |C|L|U|B| | | | | |");
		ConsoleIO.printLine("| M | I | C | H | A | E | L |");
		ConsoleIO.printLine("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
		ConsoleIO.printLine("");

		//Initialize terms
		String terms = "y";
		String leave = "";
		String fight = "n";

		//Ask for age (catch exceptions)
		ConsoleIO.print("Name: ");
		String name = ConsoleIO.readLine();
		ConsoleIO.print("How old are you? ");
		int age = ConsoleIO.readInt();
		int count = 0;
		int choice = 0;
		if (age <= 0) {
			ConsoleIO.print("Though I am but a humble bouncer, I find this improbable. Please enter your real age. Dont make me count to 3. ");
			age = ConsoleIO.readInt();
			while (age <= 0 & count < 3) {
				count++;
				ConsoleIO.print(count+", what is your true age? ");
				age = ConsoleIO.readInt();
			}
		}
		//Mini game
		if (age <=0) {
			ConsoleIO.printLine("");
			ConsoleIO.printLine("!ALERT! The authorities have been called !ALERT!");
			ConsoleIO.printLine("");
			ConsoleIO.printLine("1) Try to sneak past the bouncer.");
			ConsoleIO.printLine("2) Mean-mug the bouncer.");
			ConsoleIO.printLine("3) Do nothing.");
			ConsoleIO.printLine("4) Get back into the time machine and leave.");
			ConsoleIO.print("Which do you do next? ");
			choice = ConsoleIO.readInt();
			ConsoleIO.printLine("");
			while (choice < 1 || choice > 4) {
				ConsoleIO.print("Please make a valid choice. ");
				choice = ConsoleIO.readInt();
			} if (choice == 1) {
				if (Math.random() < .2) {
					ConsoleIO.printLine("*You have been caught by the bouncer and he has thrown you into jail.");
					ConsoleIO.printLine("| | | | | | |");
					ConsoleIO.printLine("| | | | | | |");
					ConsoleIO.printLine("| |  :(   | |");
					ConsoleIO.printLine("| | (you) | |");
					ConsoleIO.printLine("| | | | | | |");
					ConsoleIO.printLine("| | | | | | |");
					return;
				} else {
					age = 18+(int)(Math.random()*94);
					ConsoleIO.printLine("You managed to sneak past the bouncer. A feat impossible for anyone underage. You are admitted, despite being dishonest about how old you really must be. You shall henceforth be "+age+".");
				}
			} else if (choice == 2) {
				if (Math.random() < .2) {
					ConsoleIO.printLine("*You did not intimidate our very tough bouncer and he has thrown you into jail.");
					ConsoleIO.printLine("| | | | | | |");
					ConsoleIO.printLine("| | | | | | |");
					ConsoleIO.printLine("| |  :(   | |");
					ConsoleIO.printLine("| | (you) | |");
					ConsoleIO.printLine("| | | | | | |");
					ConsoleIO.printLine("| | | | | | |");
					return;
				} else {
					age = 18+(int)(Math.random()*94);
					ConsoleIO.printLine("Amazing! Terrifying! You have intimidated the bouncer. You must eat nails for breakfast, with no milk of course. Nobody of an unreal age could possibly be so tough. You are now "+age+".");
				}
			} else if (choice == 3) {
				ConsoleIO.printLine("*The bouncer has folded you into a paper airplane and thrown you home.*");
				return;
			} else {
				ConsoleIO.printLine("You return to the future, where you came from. In this future lying is forbidden, and since you had travelled to a time before you were born, your age was negative. ");
			}
		}

		//Ask for coolness factor (re-ask if above 10)
		ConsoleIO.print("Alright... scale of 1-10, how cool are you? ");
		int cool = ConsoleIO.readInt();
		while (cool < 0 || cool > 10) {
			while (cool < -2) {
				ConsoleIO.print("No no no. You are cool! It's not only improbable to be less than 1 cool, but it's also impossible! Please, how cool are you from 1-10? ");
				cool = ConsoleIO.readInt();
			}
			while (cool >= -2 && cool < 1) {
				cool = cool + 3;
				ConsoleIO.printLine("Improbable! You made it here, that's pretty cool! I'm adding 3 to your choice, chin up, kid. You are now "+cool+" cool.");
			}
			while (cool > 10 && cool <= 12) {
				cool = cool - 7;
				ConsoleIO.printLine("No one is slightly more cool than 10. I am docking you 7 cool points. Be humble. You are now "+cool+" cool.");
			}
			while (cool > 12) {
				ConsoleIO.print("You are in no way more cool than possible. It is only possible to be 10 cool! Get real! How cool are you? ");
				cool = ConsoleIO.readInt();
			}
		}
		//Tell them whether or not they are welcome (18+ age, 5+ cool)
		ConsoleIO.printLine("");
		ConsoleIO.print("Before you get your results. Would you like to challenge the bouncer? (y/n) ");
		fight = ConsoleIO.readLine();
		while (!fight.equals("y") && !fight.equals("n")) {
			ConsoleIO.print("Please make a valid choice. ");
			fight = ConsoleIO.readLine();
			}
			ConsoleIO.printLine("");
		if (age >= 21 && cool >=5 && fight.equals("n")) {
			ConsoleIO.printLine("Welcome, Mean Mike has a real Mean Ale that you'll love. The first one is on the house!");
			ConsoleIO.printLine("");
			ConsoleIO.printLine(" \\~~/");
			ConsoleIO.printLine("  \\/");
			ConsoleIO.printLine("  ||");
			ConsoleIO.printLine("  ||");
			ConsoleIO.printLine(" ----");
			ConsoleIO.printLine("");
		} else if (age >=18 && cool >=5 && fight.equals("n")) {
			ConsoleIO.print("Come on in! You are not allowed to drink because that would be illegal! Are you ok with these terms? (y/n) ");
			terms = ConsoleIO.readLine();
			while (!terms.equals("y") && !terms.equals("n")) {
				ConsoleIO.print("Please enter a valid choice. ");
				terms = ConsoleIO.readLine();
			}
		} else if(age < 18 || cool < 5 || !terms.equals("y") || fight.equals("y")) {
			if (fight.equals("y")) {
				leave = "No.";
			} else {
				ConsoleIO.print("Sorry, you don't meet the requirements. You've got to leave, and you had better not say 'No.' ");
				leave = ConsoleIO.readLine();
			}
			if (leave.equals("No.") || leave.equals("no.") || leave.equals("No") || leave.equals("no")){
				ConsoleIO.printLine("");
				ConsoleIO.printLine("1) Try to sneak past the bouncer.");
				ConsoleIO.printLine("2) Mean-mug the bouncer.");
				ConsoleIO.printLine("3) Do nothing.");
				ConsoleIO.printLine("4) Challenge the bouncer to a martial arts fight.");
				ConsoleIO.printLine("");
				ConsoleIO.print("Which do you do next? ");
				choice = ConsoleIO.readInt();
				ConsoleIO.printLine("");
				while (choice < 1 || choice > 4) {
					ConsoleIO.print("Please make a valid choice. ");
					choice = ConsoleIO.readInt();
				}
				if (choice == 1) {
					if (Math.random() < .01) {
						ConsoleIO.printLine("*You have been caught by the bouncer and he has thrown you into jail.");
						ConsoleIO.printLine("| | | | | | |");
						ConsoleIO.printLine("| | | | | | |");
						ConsoleIO.printLine("| |  :(   | |");
						ConsoleIO.printLine("| | (you) | |");
						ConsoleIO.printLine("| | | | | | |");
						ConsoleIO.printLine("| | | | | | |");
						return;
					} else {
						age = 18+(int)(Math.random()*94);
						cool = 5+(int)(Math.random()*6);
						ConsoleIO.printLine("You managed to sneak past the bouncer. A feat impossible for anyone underage OR undercool. You are admitted, despite being dishonest about how old and cool you really must be. You shall henceforth be "+age+" years old and "+cool+" cool! Wait a minute. This place is empty, this can't be right, can it? ");
					}
				} else if (choice == 2) {
					if (Math.random() < .75) {
						ConsoleIO.printLine("*You did not intimidate our very tough bouncer and he has thrown you into jail.");
						ConsoleIO.printLine("| | | | | | |");
						ConsoleIO.printLine("| | | | | | |");
						ConsoleIO.printLine("| |  :(   | |");
						ConsoleIO.printLine("| | (you) | |");
						ConsoleIO.printLine("| | | | | | |");
						ConsoleIO.printLine("| | | | | | |");
						return;
					} else {
						age = 18+(int)(Math.random()*94);
						cool = 5+(int)(Math.random()*6);
						ConsoleIO.printLine("Amazing! Terrifying! You have intimidated the bouncer. You must eat nails for breakfast, with no milk of course. Nobody of an unreal age could possibly be so tough. You are now "+age+" years old and "+cool+" cool. But wait! What's up with this place? It's full of young and uncool looking people. This can't be right. ");
					}
				} else if (choice == 3 ) {
					ConsoleIO.printLine("*The bouncer has called your parents and they are disappointed.*");
					return;
				} else {
					ConsoleIO.print("You dare challenge ME? Mean Mike Himself?! You had better be pretty tough. How tough are ya, anyway? Lets say, scale of 1-19? ");
					int tough = ConsoleIO.readInt();
					if (tough < 1) {
						ConsoleIO.printLine("*Mean Mike scowled at you and you fainted*");
					} else if (tough >= 20) {
						ConsoleIO.printLine("");
						ConsoleIO.printLine("Wow that's tough! Let me see your ID.");
						ConsoleIO.printLine("");
						age = 18+(int)(Math.random()*94);
						cool = 5+(int)(Math.random()*12);
						ConsoleIO.printLine("===========================");
						ConsoleIO.printLine("|              ");
						ConsoleIO.printLine("|     Name: "+name+" ");
						ConsoleIO.printLine("|     AGE: "+age+"  ");
						ConsoleIO.printLine("|     COOL: "+cool+" ");
						ConsoleIO.printLine("|     TOUGH: "+tough+" ");
						ConsoleIO.printLine("|    (made by fake ID inc.)      ");
						ConsoleIO.printLine("|              ");
						ConsoleIO.printLine("===========================");
						ConsoleIO.printLine("");
						ConsoleIO.printLine("Oh my mistake, looks here like you're definitely allowed in! *You enter* Wait, this can't be right can it? There's nothing in here but people who are un-cool, un-old, and definitely un > 19 tough. ");

					} else {
						ConsoleIO.printLine("");
						ConsoleIO.printLine("Very well then, why don't you make the first move. ");
						ConsoleIO.printLine("");
						ConsoleIO.printLine("1) Karate chop");
						ConsoleIO.printLine("2) That one move from Karate Kid with the flying kick");
						ConsoleIO.printLine("3) Custom");
						ConsoleIO.printLine("");
						ConsoleIO.print("Which action do you take? " );
						int action = ConsoleIO.readInt();
						while (action < 1 || action > 3){
							ConsoleIO.print("Please make a valid selection. ");
							action = ConsoleIO.readInt();
						}
						ConsoleIO.printLine("");

						//Fight Mean Mike. Initialize health and special move, damage, and round count
						int mmHealth = 150;
						int userHealth = 100+tough;
						int damage = 0;
						int round = 0;
						String custom = "";
						String reuse = "n";
						int toggleReuse = 0;

						while (mmHealth > 0 && userHealth > 0 && fight.equals("y") || fight.equals("n")) {
							round++;
							ConsoleIO.printLine("Round #"+round);
							if (action == 1) {
								damage = 15+(int)(Math.random()*10);
								ConsoleIO.printLine("You have karate-chopped Mean Mike for "+damage+" damage.");
								mmHealth = mmHealth - damage;
								if (mmHealth <= 0) {
									ConsoleIO.printLine("Your karate chop has defeated Mean Mike, but you also kind of hurt your hand. ");
									damage = (int)(Math.random()*10);
									ConsoleIO.printLine("Mean Mike's body has caused your hand "+damage+" damage.");
									userHealth = userHealth - damage;
									ConsoleIO.printLine("Mean Mike's Health: "+mmHealth);
									ConsoleIO.printLine(name+"'s Health: "+userHealth);
									ConsoleIO.printLine("");
									ConsoleIO.printLine("You have karate chopped your way to gaining respect from Mean Mike! He has shared with you the REAL location of CLUB MICHAEL, which is through the second door inside.");
									return;
								} else {
									damage = (int)(Math.random()*30);
									ConsoleIO.printLine("Mean Mike has pulled out his person counter. He clicks it up one. This causes you "+damage+" damage.");
									userHealth = userHealth - damage;
									ConsoleIO.printLine("Mean Mike's Health: "+mmHealth);
									ConsoleIO.printLine(name+"'s Health: "+userHealth);
									if (userHealth <= 0) {
										ConsoleIO.printLine("Mean Mike has defeated you. Go on now. Git.");
										return;
									}
									ConsoleIO.print("What is your next attack? ");
									action = ConsoleIO.readInt();
									while (action < 1 || action > 3){
										ConsoleIO.print("Please make a valid selection. ");
										action = ConsoleIO.readInt();
									}
								}
								ConsoleIO.printLine("");
							} else if (action == 2) {
								damage = 30+(int)(Math.random()*30);
								ConsoleIO.printLine("You have have done that cool flying kick for "+damage+" damage.");
								mmHealth = mmHealth - damage;
								if (mmHealth <= 0) {
									ConsoleIO.printLine("Your kick defeated Mean Mike but also kind of hurt your foot. ");
									damage = (int)(Math.random()*10);
									ConsoleIO.printLine("Mean Mike's body has caused your foot "+damage+" damage.");
									userHealth = userHealth - damage;
									ConsoleIO.printLine("Mean Mike's Health: "+mmHealth);
									ConsoleIO.printLine(name+"'s Health: "+userHealth);
									ConsoleIO.printLine("");
									ConsoleIO.printLine("Your flying kick has landed you the respect of Mean Mike! He has decided to share with you true location of CLUB MICHAEL! It's through the second door inside.");
									return;
								} else {
									damage = (int)(Math.random()*(userHealth - userHealth/75));
									ConsoleIO.printLine("Mean Mike has survived your kick and let three people in line behind you go in. This causes you "+damage+" damage.");
									userHealth = userHealth - damage;
									ConsoleIO.printLine("Mean Mike's Health: "+mmHealth);
									ConsoleIO.printLine(name+"'s Health: "+userHealth);
									if (userHealth <= 0) {
										ConsoleIO.printLine("Mean Mike has defeated you. Go on now. Git.");
										return;
									}
									ConsoleIO.print("What is your next attack? ");
									action = ConsoleIO.readInt();
									while (action < 1 || action > 3){
										ConsoleIO.print("Please make a valid selection. ");
										action = ConsoleIO.readInt();
									}
									ConsoleIO.printLine("");
								}
							} else {
								//Don't run first time user chooses 3, run 2nd and up
								if (toggleReuse != 0){
									ConsoleIO.print("Would you like to reuse "+custom+"? (y/n) ");
									reuse = ConsoleIO.readLine();
								}
								if (!reuse.equals("y")) {
									toggleReuse = 1;
									ConsoleIO.print("What is the name your move? ");
									custom = ConsoleIO.readLine();
									if (Math.random() < .1) {
										damage = (int)(Math.random()*200);
									} else {
										damage = (int)(Math.random()*50);
									}
								}
								ConsoleIO.printLine("You have used "+custom+" on Mean Mike and caused "+damage+" damage!");
								mmHealth = mmHealth - damage;
								if (mmHealth <= 0) {
									ConsoleIO.printLine("Mean Mike has never seen anything like that! You have defeated him! ");
									ConsoleIO.printLine("Mean Mike's Health: "+mmHealth);
									ConsoleIO.printLine(name+"'s Health: "+userHealth);
									ConsoleIO.printLine("Mean Mike has bestowed upon you his respect. He has also shared the TRUE location of CLUB MICHAEL: It's through the second door inside.");
									ConsoleIO.printLine("");
									return;
								} else {
									damage = (int)(Math.random()*(60));
									ConsoleIO.printLine("Mean Mike has used his own special attack: he took a phone call instead of finishing his interaction with you! Ouch! Waiting is hard! "+damage+" damage.");
									userHealth = userHealth - damage;
									ConsoleIO.printLine("Mean Mike's Health: "+mmHealth);
									ConsoleIO.printLine(name+"'s Health: "+userHealth);
									if (userHealth <= 0) {
										ConsoleIO.printLine("Mean Mike has defeated you. Go on now. Git.");
										return;
									}
									ConsoleIO.print("What is your next attack? ");
									action = ConsoleIO.readInt();
									while (action < 1 || action > 3){
										ConsoleIO.print("Please make a valid selection. ");
										action = ConsoleIO.readInt();
										ConsoleIO.printLine("");
									}
									ConsoleIO.printLine("");
								}
							}
						}
						if (mmHealth <= 0) {
							ConsoleIO.printLine("Mean Mike shared with you the real location of CLUB MICHAEL, which through the second door inside.");
							return;
						} else if (mmHealth <= 0 && userHealth <=0){
							ConsoleIO.printLine("You have defeated Mean Mike, but at the cost of your own life. Mean Mike attended your funeral and shared with you the TRUE location of CLUB MICHAEL: it was through the second door he was standing in front of. ");
							return;
						} else if (mmHealth <= 0 && userHealth >0){
							ConsoleIO.printLine("You were no match for Mean Mike in martial arts. He stuffed you into a mail envelope and USPS safely delivered you home.");
							return;
						}
					}
				}
			}
		}
		if (leave.length() >= 1 && !leave.equals("y") && !leave.equals("No.") && !leave.equals("no.") && !leave.equals("No") && !leave.equals("no")){
			ConsoleIO.printLine("Nice try, but you're not getting in today. ");
		}
		ConsoleIO.printLine("Go on now, git. ");
	}
}