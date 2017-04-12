package le;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Phuc Hong Le
 */
public class StackProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedStack<String> s = new LinkedStack<>();
        System.out.println("Enter 5 word: ");
        Scanner scanIn = new Scanner(System.in);
        String input = "";
        int number = 0;
        while (number < 5) {
            input = scanIn.nextLine();
            s.push(input);
            number++;
        }
        number = 0;
        System.out.println("Reverse version : ");
        while (number < 5) {
            System.out.println(s.pop());
            number++;
        }
    }

}
