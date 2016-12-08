

public class test{
	
	public static void main(String[] args) {
		//getDateOfYear();
		getAge();
	

	}
	
	public static int getDateOfYear(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your age");
		int age= input.nextInt();
		int year= 2016 - age;
		System.out.println("you are probabily bron in" + year);
		return year;
	}
	
	public static int getAge(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("What Year you bron");
		int year= input.nextInt();
		int age= 2016 - year;
		System.out.println("your age is probabily " + age);
		return year;
	}
}