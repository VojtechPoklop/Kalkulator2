import java.util.Scanner;

public class Kalkulator3000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner scan = new Scanner(System.in);
					System.out.println("Napis prvni cislo.");
					int cislo1 = scan.nextInt();
					System.out.println("Napis operator.");
				Scanner opscan = new Scanner(System.in);
						String operator = opscan.nextLine();
				Scanner scan2 = new Scanner(System.in);
					System.out.println("Napis druhe cislo.");
					int cislo2 = scan2.nextInt();
					
			if(cislo1 > -999999 && cislo1 < 9999999 && cislo2 > -9999999 && cislo2 < 9999999) {
				if(operator.equals("+")) {
					int vysledek = cislo1 + cislo2;
					System.out.println("Vysledek je " + vysledek);
				}
				if(operator.equals("-")) {
					int vysledek = cislo1 - cislo2;
					System.out.println("Vysledek je " + vysledek);
				}
				if(operator.equals("*")) {
					int vysledek = cislo1 * cislo2;
					System.out.println("Vysledek je " + vysledek);
				}
				if(operator.equals("/")) {
					int vysledek = cislo1 / cislo2;
					System.out.println("Vysledek je " + vysledek);
				}
				if(!operator.equals("+")&&!operator.equals("-")&&!operator.equals("*")&&!operator.equals("/")) {
					System.out.println("Zadan spatny operator.");
					System.exit(0);
				}
			}else {
				System.out.println("Zadan spatny znak, nebo moc vysoke ci nizke cislo.");
			}

				
				System.out.println("");
				System.out.println("Co chces provest s vysledkem?");
				System.out.println("Pridat dalsi cislo (zmackni 1)");
				System.out.println("Je cislo sude nebo liche? (zmackni 2)");
				System.out.println("Zmenit operator (zmackni 3)");
				
				Scanner scan3 = new Scanner(System.in);
					int rozhodnuti = scan3.nextInt();
					
				if(rozhodnuti == 1) {
					Scanner rozhodnuti12 = new Scanner(System.in);
						System.out.println("Napis operator.");
						String rozhodnutioperator = rozhodnuti12.next();
					Scanner rozhodnuti11 = new Scanner(System.in);
						System.out.println("Napis treti cislo.");
						int rozhodnuticislo = rozhodnuti11.nextInt();
					
						
			if(operator.equals("+")) {
						
					if(rozhodnutioperator.equals("+")) {
						int vysledek = (cislo1 + cislo2) + rozhodnuticislo;
						System.out.println("Vysledek je " + vysledek);
					}
					if(rozhodnutioperator.equals("-")) {
						int vysledek = (cislo1 + cislo2) - rozhodnuticislo;
						System.out.println("Vysledek je " + vysledek);
					}
					if(rozhodnutioperator.equals("*")) {
						int vysledek = (cislo1 + cislo2) * rozhodnuticislo;
						System.out.println("Vysledek je " + vysledek);
					}
					if(rozhodnutioperator.equals("/")) {
						int vysledek = (cislo1 + cislo2) / rozhodnuticislo;
						System.out.println("Vysledek je " + vysledek);
					}
					if(!rozhodnutioperator.equals("+")&&!rozhodnutioperator.equals("-")&&!rozhodnutioperator.equals("*")&&!rozhodnutioperator.equals("/")) {
						System.out.println("Zadan spatny operator.");
						System.exit(0);
					}
			}
			
			if(operator.equals("-")) {
				
				if(rozhodnutioperator.equals("+")) {
					int vysledek = (cislo1 - cislo2) + rozhodnuticislo;
					System.out.println("Vysledek je " + vysledek);
				}
				if(rozhodnutioperator.equals("-")) {
					int vysledek = (cislo1 - cislo2) - rozhodnuticislo;
					System.out.println("Vysledek je " + vysledek);
				}
				if(rozhodnutioperator.equals("*")) {
					int vysledek = (cislo1 - cislo2) * rozhodnuticislo;
					System.out.println("Vysledek je " + vysledek);
				}
				if(rozhodnutioperator.equals("/")) {
					int vysledek = (cislo1 - cislo2) / rozhodnuticislo;
					System.out.println("Vysledek je " + vysledek);
				}
				if(!rozhodnutioperator.equals("+")&&!rozhodnutioperator.equals("-")&&!rozhodnutioperator.equals("*")&&!rozhodnutioperator.equals("/")) {
					System.out.println("Zadan spatny operator.");
					System.exit(0);
				}
		}
			
			if(operator.equals("*")) {
				
				if(rozhodnutioperator.equals("+")) {
					int vysledek = (cislo1 * cislo2) + rozhodnuticislo;
					System.out.println("Vysledek je " + vysledek);
				}
				if(rozhodnutioperator.equals("-")) {
					int vysledek = (cislo1 * cislo2) - rozhodnuticislo;
					System.out.println("Vysledek je " + vysledek);
				}
				if(rozhodnutioperator.equals("*")) {
					int vysledek = (cislo1 * cislo2) * rozhodnuticislo;
					System.out.println("Vysledek je " + vysledek);
				}
				if(rozhodnutioperator.equals("/")) {
					int vysledek = (cislo1 * cislo2) / rozhodnuticislo;
					System.out.println("Vysledek je " + vysledek);
				}
				if(!rozhodnutioperator.equals("+")&&!rozhodnutioperator.equals("-")&&!rozhodnutioperator.equals("*")&&!rozhodnutioperator.equals("/")) {
					System.out.println("Zadan spatny operator.");
					System.exit(0);
				}
		}
			if(operator.equals("/")) {
				
				if(rozhodnutioperator.equals("+")) {
					int vysledek = (cislo1 / cislo2) + rozhodnuticislo;
					System.out.println("Vysledek je " + vysledek);
				}
				if(rozhodnutioperator.equals("-")) {
					int vysledek = (cislo1 / cislo2) - rozhodnuticislo;
					System.out.println("Vysledek je " + vysledek);
				}
				if(rozhodnutioperator.equals("*")) {
					int vysledek = (cislo1 / cislo2) * rozhodnuticislo;
					System.out.println("Vysledek je " + vysledek);
				}
				if(rozhodnutioperator.equals("/")) {
					int vysledek = (cislo1 / cislo2) / rozhodnuticislo;
					System.out.println("Vysledek je " + vysledek);
				}
				if(!rozhodnutioperator.equals("+")&&!rozhodnutioperator.equals("-")&&!rozhodnutioperator.equals("*")&&!rozhodnutioperator.equals("/")) {
					System.out.println("Zadan spatny operator.");
					System.exit(0);
				}
		}
			
				}
				if(rozhodnuti == 2) {
					if(operator.equals("+")) {
						if((cislo1 + cislo2) % 2 == 0) {
							System.out.println("Cislo je sude.");
						}
						if((cislo1 + cislo2) % 2 != 0) {
							System.out.println("Cislo je liche.");
							}
						}
					if(operator.equals("-")) {
						if((cislo1 - cislo2) % 2 == 0) {
							System.out.println("Cislo je sude.");
						}
						if((cislo1 - cislo2) % 2 != 0) {
							System.out.println("Cislo je liche.");
							}
						}
					if(operator.equals("*")) {
						if((cislo1 * cislo2) % 2 == 0) {
							System.out.println("Cislo je sude.");
						}
						if((cislo1 * cislo2) % 2 != 0) {
							System.out.println("Cislo je liche.");
							}
						}
					if(operator.equals("/")) {
						if((cislo1 / cislo2) % 2 == 0) {
						System.out.println("Cislo je sude.");
						}
						if((cislo1 / cislo2) % 2 != 0) {
							System.out.println("Cislo je liche.");
							}
						}
				}
				if(rozhodnuti == 3) {
					Scanner rozhodnuti3 = new Scanner(System.in);
					System.out.println("Zadejte novy operator.");
					String novyoperator = rozhodnuti3.next();
					
					if(novyoperator.equals("+")) {
						int vysledek = cislo1 + cislo2;
						System.out.println("Vysledek je " + vysledek);
					}
					if(novyoperator.equals("-")) {
						int vysledek = cislo1 - cislo2;
						System.out.println("Vysledek je " + vysledek);
					}
					if(novyoperator.equals("*")) {
						int vysledek = cislo1 * cislo2;
						System.out.println("Vysledek je " + vysledek);
					}
					if(novyoperator.equals("/")) {
						int vysledek = cislo1 / cislo2;
						System.out.println("Vysledek je " + vysledek);
					}
					if(!novyoperator.equals("+")&&!novyoperator.equals("-")&&!novyoperator.equals("*")&&!novyoperator.equals("/")) {
						System.out.println("Zadan spatny operator.");
						System.exit(0);
					}
					
				}
				
			}

		}
