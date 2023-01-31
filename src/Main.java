import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
//		String country = new String("abc");
		
//		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("what is your name?");
//		String name = scanner.nextLine();
//		System.out.println("Hello %s how old are you?".formatted(name));
				
//		int age = Integer.parseInt(scanner.nextLine());
//		double gpa = Double.parseDouble(scanner.nextLine());
		
//		System.out.printf("%d is an excellent age to start programming, what programming language would you prefare? ", age);
//		String language = scanner.nextLine();
//		System.out.printf("%s is a very fast programming language", language);
		
//		System.out.println("enter the first number");
		
//		double number1 = scanner.nextDouble();
		
//		System.out.println("enter the second number");
//		double number2 = scanner.nextDouble();
//		scanner.nextLine();
		
//		System.out.println("what operation do you want to perform");
//		String operation  = scanner.nextLine();
		
		
//		System.out.printf("first number => %f, second number => %f", number1, number2);
//		if (operation.equals("sum")) {
//			System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
//		} else {
//			System.out.printf("%s is not a supported operation", operation);
//		}
//		scanner.close();
		
//		char[] vowels = {'e', 'u', 'a', 'o', 'i'};
//		Arrays.sort(vowels);
//		int findItemIndex = Arrays.binarySearch(vowels, 'o');
//		Arrays.fill(vowels, 'o');
//		
//		System.out.println(Arrays.toString(vowels));
//		
//		int[] copyNumbers = Arrays.copyOf(numbers, numbers.length);
//		
//		Arrays.fill(numbers, 0);
//		
//		System.out.println(Arrays.toString(copyNumbers));
//		
//		System.out.println(Arrays.toString(numbers));
//		int[] numbers = {1, 2, 3, 4, 5};
//		int sum = 0;
//		
//		for (int number : numbers) {
//			sum += number;
//		}
//		System.out.println(sum);
		
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		
//		numbers.add(5);
//		numbers.add(3);
//		numbers.add(1);
//		numbers.add(4);
//		numbers.add(2);
//		
//		numbers.sort(Comparator.reverseOrder());
//		
//		System.out.println(numbers);
//		
//		System.out.println(numbers.size());
//		
//		System.out.println(numbers.contains(Integer.valueOf(1)));
//		numbers.forEach(number -> {
//			numbers.set(numbers.indexOf(number), number * 2);
//			
//		});
//		
//		System.out.println(numbers.toString());
//		HashMap<String, Integer> examScore = new HashMap<String, Integer>();
//		
//		examScore.put("math", 75);
//		examScore.put("stat", 85);
//		
//		examScore.putIfAbsent("cos", 100);
//		
//		examScore.forEach((key, value) -> {
//			System.out.print(key+" ");
//			System.out.println(value);
//		});
//		
//		
//		System.out.println(examScore.isEmpty());
//		
		
		User user = new User("Onyedikachi", "1997-08-03");
//		System.out.println(user.birthday.toString());
//		System.out.println(user.age());
		
		Book book = new Book("Onyedikachi", "The power in woman");
		AudioBook audioBook = new AudioBook("Dracula", "Bram Stoker", 3000);
		Ebook ebook = new Ebook("Carry on Jeeves", "P.G. wodehouse", "pdf");
		user.borrow(book);
//		System.out.println(user.getname());
		System.out.println(ebook.getAuthor());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
