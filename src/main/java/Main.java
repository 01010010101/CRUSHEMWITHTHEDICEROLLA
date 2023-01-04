import cli.CommandLineInterface;
import model.CharList;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import repositories.CharListRepository;

class Main {
    private static final CommandLineInterface cli = new CommandLineInterface();
    private static final CharListRepository repo;

    public static void main(String[] args) {

        // cli.run();
        CharList Pupkeen = new CharList();
        Pupkeen.setName("Vasya Pupkeen");
        Pupkeen.setAge(16);
        Pupkeen.setSTRENGTH(6);

    }
}