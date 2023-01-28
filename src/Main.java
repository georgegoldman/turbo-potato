
class Main {
	public static void main(String[] args) {
		String name = "Onyedikachi Georgegoldman John";
		String country = "Nigeria";
		int age = 26;
		String company = "MUSALA";
		double gpa = 3.8;
		char percent = '%';
		boolean amItellingTheTruth = true;
		String formattedString = String.format("My name is %s.I am from %s. I am %d years old. I work at %s. My gps is %s, I have attended 60%c of my university classes. These are all %b claims", name, country, age, company, gpa, percent, amItellingTheTruth );
		
		System.out.println(formattedString);
	}
}
