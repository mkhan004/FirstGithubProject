 public class NewWorld{

    public static void main(String[] args) {
      
        String text ="This is a new String  And That is a method .";
   System.out.println(getWordCount(text, "is"));	
}
public static int getWordCount(String text, String word) {

		int count = 0;
		String[] wordArray = text.split(" ");

		for (int i = 0; i < wordArray.length; i++) {
			if (wordArray[i].equalsIgnoreCase(word)) {

				count ++;

			}
		}

		return count;

	}}










