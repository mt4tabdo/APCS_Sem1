/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.Scanner;


class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
System.out.print("Enter a sentence");
System.out.println(" ");
   String sentence = sc.nextLine();
   
   System.out.println("Heres your sentence in Pig Latin");
   
   
    String word = "";

        for (int i = 0; i <= sentence.length(); i++) {

            if (i == sentence.length() || sentence.substring(i, i + 1).equals(" ")) {

                String first = word.substring(0, 1);
                String second = word.substring(1, 2);
                String pig = "";

                if (first.equals("a") || first.equals("e") || first.equals("i")
                    || first.equals("o") || first.equals("u")) {

                    pig = word + "-way";
                }
                else if (!(second.equals("a") || second.equals("e") || second.equals("i")
                           || second.equals("o") || second.equals("u"))) {

                    pig = word.substring(2) + "-" + first + second + "ay";
                }
                else {
                    pig = word.substring(1) + "-" + first + "ay";
                }

                System.out.print(pig + " ");
                word = "";
            }
            else {
                word = word + sentence.substring(i, i + 1);
            }
        }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	}
}
