import java.util.Scanner;

public class Buffer {
    public void buff() {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.print("Press 0 to continue... ");
            int option = myObj.nextInt();
        }
    } 
}
