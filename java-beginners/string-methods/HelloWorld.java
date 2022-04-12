public class HelloWorld{

  public static void main(String []args){
     int integer = 6;
     double number = 4.5;
     boolean bool = false;
     String word = "any word";
     System.out.println("Hello World");
     System.out.print(word);
     int count = 0;
     while (count<20) {
         int random = (int)(Math.random()*10)+1;
         System.out.println(random);
         count++;
     }
     System.out.println(Math.PI);
     if (number > 5) {
         System.out.println("Hey");
     }
     else if (number<3) {
         System.out.println("Hey again");
     }
     else {
         System.out.println("Wow!!!");
     }
     System.out.println(word.indexOf("w"));
     String word2 = "hello";
     //It returns the first letter inside
     System.out.println(word2.indexOf("l"));
     // IF there is not the letter then it returns -1
     System.out.println(word2.indexOf("r"));
     String upper = word.toUpperCase();
     String lower = word.toLowerCase();
     System.out.println(upper + lower);
     String sub = word.substring(0, 4);
     System.out.println(sub);
     if(word.equals("any word")) {
         System.out.println("Same");
     }
     System.out.println(word.length());
     System.out.println(word.lastIndexOf("a"));
     System.out.println(word.charAt(6));
  }
}