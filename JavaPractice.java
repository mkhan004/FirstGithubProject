public class JavaPractice {
    public static void main(String []args){


       String  text = "This is my MacBook Pro";
    


     }
     public static String getAllWord( String   text ){
      
         String   newText = " ";
         String[]   wordArray = text.split (" ");
         for( int i = 0; i <wordArray.length; i ++){
         newText = newText+wordArray[i];

       
        }
         return  newText;
  
     }

}
