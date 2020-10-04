import java.util.Scanner;
/**
 * Asks for postive integer and tells you it in written form
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for a positive integer
    System.out.println("Please enter a positive integer:");
    int positiveInteger = input.nextInt();

    switch(positiveInteger){
      case 1:
      System.out.println("one");
      break;
      case 2:
      System.out.println("two");
      break;
      case 3:
      System.out.println("three");
      break;
      case 4:
      System.out.println("four");
      break;
      case 5:
      System.out.println("five");
      break;
      case 6:
      System.out.println("six");
      break;
      case 7:
      System.out.println("seven");
      break;
      case 8:
      System.out.println("eight");
      break;
      case 9:
      System.out.println("nine");
      break;
      case 10:
      System.out.println("ten");
      break;
      default:
      System.out.println("not in the range");
    }

    


   

    }
    
  }

