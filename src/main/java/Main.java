import cli.CommandLineInterface;
import model.CharList;

class Main {
    private static final CommandLineInterface cli = new CommandLineInterface();

    public static void main(String[] args) {
       // cli.run();
        CharList Pupkeen = new CharList();
        Pupkeen.setName("Vasya Pupkeen");
        Pupkeen.setAge(16);
        Pupkeen.setSTRENGTH(6);

    }
}