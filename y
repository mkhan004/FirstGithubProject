
public static TaniaJaman{
public static void main(String[] args) {
			System.out.println(getText("My name is Shermin"));
		}
		public static String getText(String text){
			String reverse ="";
			for(int i=text.length()-1;i>=0;i--){
				reverse +=text.charAt(i);
			}
			
			return reverse;
		}

}
