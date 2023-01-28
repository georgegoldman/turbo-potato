import java.util.Scanner;

class Main {
	public static void main(String[] args) {
//		String country = new String("abc");
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("what is your name?");
//		String name = scanner.nextLine();
//		System.out.println("Hello %s how old are you?".formatted(name));
				
//		int age = Integer.parseInt(scanner.nextLine());
//		double gpa = Double.parseDouble(scanner.nextLine());
		
//		System.out.printf("%d is an excellent age to start programming, what programming language would you prefare? ", age);
//		String language = scanner.nextLine();
//		System.out.printf("%s is a very fast programming language", language);
		
		System.out.println("enter the first number");
		
		double number1 = scanner.nextDouble();
		
		System.out.println("enter the second number");
		double number2 = scanner.nextDouble();
		
		System.out.printf("first number => %f, second number => %f", number1, number2);
		scanner.close();
	}
}
