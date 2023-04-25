import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a paragraph in present continuous tense: ");
    String presentContinuous = scanner.nextLine();
    
    // Convert present continuous to past continuous
    String[] words = presentContinuous.split(" ");
    String pastContinuous = "";
    for (int i = 0; i < words.length; i++) {
      if (words[i].endsWith("ing")) {
        words[i] = words[i].substring(0, words[i].length()-3) + "ing";
        pastContinuous += "was " + words[i] + " ";
      } else {
        pastContinuous += words[i] + " ";
      }
    }
    
    System.out.println("In past continuous tense: " + pastContinuous);
  }
}