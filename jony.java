public class jony{
    public static void main(String[] args){
        System.out.println(getUpperCase("This is a String"));
    }

    public static String getUpperCase(String text){
        String upperCase = "";
        upperCase = text.toUpperCase();
        return upperCase;
    }
}
