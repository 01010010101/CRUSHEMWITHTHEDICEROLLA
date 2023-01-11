package org.waaagh;

import org.waaagh.cli.CommandLineInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.waaagh.model.CharList;
import org.waaagh.model.Skill;
import org.waaagh.service.CharListServiceImp;
import org.waaagh.service.NonWebService;
import org.waaagh.service.SkillServiceImp;

import static org.waaagh.num.SkillType.LINEAR;

@SpringBootApplication
class Main implements CommandLineRunner {
    private static final CommandLineInterface cli = new CommandLineInterface();

    @Autowired
    private NonWebService service;
    @Autowired
    private CharListServiceImp imp;
    @Autowired
    private SkillServiceImp skillImp;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, "Hi", "There");
    }

    @Override
    public void run(String... args) throws Exception {
        service.printMessage(args);
        CharList charList = new CharList();
        charList.setName("WAAAAAGH");
        charList.setAge(2);

        Skill skill = new Skill();
        skill.setName("Tough_Physique");
        skill.setSkillType(LINEAR);
        skill.setSkillText("Персонаж обладает на удивление крепким телосложением" +
                " и способен выдержать на 3 травмы больше за каждый пункт навыка");
        skill.setSkillSTATDependency("ENDURANCE");
        skill.setSkillActionCost(null);
        skill.setSkillCost(0);
        skill.setSkillCooldown(0);
        skill.setSkillEffect("");
//        skillImp.addSkill(skill);

        System.out.println(skill.getSkillText());

//        skill = skillImp.getSkillByName("Tough_Physique");
        System.out.println(skill.getName());
        System.out.println(skill.getSkillText());

        charList.addSkill(skill);

        imp.addCharList(charList);
        System.out.println("Done");
    }
}