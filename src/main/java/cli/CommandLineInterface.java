package cli;

import java.util.Scanner;

public class CommandLineInterface {
    public void run() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        while(true)  {
            String line1 = scanner.nextLine().trim().toLowerCase();
            if(line1.equals("exit")) {
                break;
            }
            else if(line1.equals("create charlist")) {
                System.out.println("Да добавлю я, просто потом");
            }
            else {
                System.out.println("Пользователь инвалид, пиши нормально");
            }

        }
        System.out.println("Пошёл отсюда, кина не будет");
    }
}
