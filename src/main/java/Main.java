import cli.CommandLineInterface;
import model.CharList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import repositories.CharListRepository;
import service.CharListService;
import service.CharListServiceImp;

@SpringBootApplication
@ComponentScan
class Main {
    private static final CommandLineInterface cli = new CommandLineInterface();


    public static void main(String[] args) {
        new SpringApplicationBuilder(Main.class)
                .web(WebApplicationType.NONE) // .REACTIVE, .SERVLET
                .run(args);

        // cli.run();

    }
}