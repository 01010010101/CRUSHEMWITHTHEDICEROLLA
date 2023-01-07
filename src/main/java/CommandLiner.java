import model.CharList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import service.CharListServiceImp;

@Component
public class CommandLiner implements CommandLineRunner {

    @Autowired
    static CharListServiceImp imp;

    @Override
    public void run(String... args) throws Exception {
        // Put your logic here
        CharList Pupkeen = new CharList();
        Pupkeen.setName("Vasya Pupkeen");
        Pupkeen.setAge(16);
        Pupkeen.setSTRENGTH(6);
        imp.addCharList(Pupkeen);
    }

}