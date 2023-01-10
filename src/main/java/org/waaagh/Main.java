package org.waaagh;

import org.waaagh.cli.CommandLineInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.waaagh.model.CharList;
import org.waaagh.service.CharListServiceImp;
import org.waaagh.service.NonWebService;

@SpringBootApplication
class Main implements CommandLineRunner {
    private static final CommandLineInterface cli = new CommandLineInterface();

    @Autowired
    private NonWebService service;
    @Autowired
    private CharListServiceImp imp;


    public static void main(String[] args) {
//        new SpringApplicationBuilder(org.waaagh.Main.class)
//                .web(WebApplicationType.NONE) // .REACTIVE, .SERVLET
//                .run(args);

        // org.waaagh.cli.run();
        args = new String[]{"Hi", "There"};
        SpringApplication.run(Main.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        service.printMessage(args);
        CharList charList = new CharList();
        charList.setName("WAAAAA");
        charList.setAge(2);
        imp.addCharList(charList);
    }
}