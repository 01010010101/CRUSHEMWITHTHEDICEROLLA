import java.util.Scanner;

class Main {
    public static void main(String[] args) {
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
//        System.out.println("Enter username");
//
//        String userName = scanner.nextLine();  // Read user input
//        System.out.println("Username is: " + userName);  // Output user input
    }
    public void SetCharlist() {

    }

}