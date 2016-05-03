public class Abedin{

	int[] array = {5, 10, 15, 20};
	public static void main(String[]args){
		System.out.println(30);
		Systen.out.println(40);
		Systen.out.println(50);
		System.out.println(array);
		System.out.println(60);
	}
	// How to findout maximum value from an Array.
	public static int maximumValue(int[] array){
		int maxValue = array[0];
		for (int i=0; i<array.length; i++) {
			if(array[i]>maxValue){
				maximum = array[i];
			}
			
		}
		return maxValue;
	}

	*/If age is more than 21 then print "You can buy beer."
	else "You are underage.";

	public static void printStatement(int age){
		if(age>=21){
			System.out.println("You can buy beer.")
		}else{
			System.out.println("You are underage.")
		}
	}

}
