import java.util.Scanner;

public class ATM {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the amount to withdraw: ");
    int amount = sc.nextInt();

    int[] notes = {2000, 500, 200, 100};
    int[] noteCounter = new int[4];

    if (amount >= 100 && amount <= 20000 && amount % 100 == 0) {
      for (int i = 0; i < 4; i++) {
        if (amount >= notes[i]) {
          noteCounter[i] = amount / notes[i];
          amount = amount - noteCounter[i] * notes[i];
        }
      }
      System.out.println("Dispensing...");
      System.out.println("Rs. 2000 x " + noteCounter[0]);
      System.out.println("Rs. 500 x " + noteCounter[1]);
      System.out.println("Rs. 200 x " + noteCounter[2]);
      System.out.println("Rs. 100 x " + noteCounter[3]);
    } else {
      System.out.println("Invalid amount entered. Please enter a multiple of 100 between 100 and 20000.");
    }
  }
}
