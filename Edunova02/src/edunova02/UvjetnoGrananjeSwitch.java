package edunova02;

public class UvjetnoGrananjeSwitch {
	
	public static void main(String[] args) {
		//raad s int,
		int i=2;
		switch(i) {
		case 1:
			System.out.println("Nedovoljan");
			break;
		case 2:
		System.out.println("Nedovoljan");
		break;
		default:
			System.out.println("Ostalo");
		}
		
		char z='a';
		
		switch(z) {
		case 'a':
		case 'b':
			System.out.println("slova");
			break;
		case '1':
			System.out.println("brojevi");
		}
		
		String s="Osijek";
		switch (s) {
		case "Osijek":
			System.out.println("OK");
			break;
			
			default:
				System.out.println("Svi ostali");
				break;
		}
		/*
		switch(i) {
		case 1 -> System.out.println("nedovoljan");
		case 2 -> System.out.println("Dovoljan");
		default -> System.out.println("Ostalo");
		}
		*/
	}

}
