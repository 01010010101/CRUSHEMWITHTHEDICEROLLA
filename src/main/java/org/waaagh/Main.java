package org.waaagh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.waaagh.cli.CommandLineInterface;
import org.waaagh.model.CharList;
import org.waaagh.model.Skill;
import org.waaagh.service.CharListServiceImp;
import org.waaagh.service.NonWebService;
import org.waaagh.service.SkillServiceImp;

import java.util.Set;

import static org.waaagh.num.Culture.ELF_WINTER;
import static org.waaagh.num.SkillType.LINEAR;
import static org.waaagh.num.SkillType.RACIAL;

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
        charList.setName("Silent");
        charList.setAge(65);
        charList.setSTRENGTH(4);
        charList.setDEXTERITY(11);
        charList.setENDURANCE(6);
        charList.setMAGICK(3);
        charList.setINTUITION(5);
        charList.setPERCEPTION(10);
        charList.setKNOWLEGE(9);
        charList.setCHARISMA(4);
        charList.setHeight(170);
        charList.setWeight(60);
        charList.setCulture(ELF_WINTER);
        Skill elf = new Skill();
        elf.setName("Elf_Winter");
        elf.setSkillType(RACIAL);
        elf.setSkillText("Персонаж - эльф, имеет эльфийскую физиологию, расовые навыки и культуру, в человеческом обществе считается нелюдью");
        skillImp.addSkill(elf);
        Skill elvenDuskVision = new Skill();
        elvenDuskVision.setName("Improved_DuskVision");
        elvenDuskVision.setSkillType(RACIAL);
        elvenDuskVision.setSkillText("Чистокровные эльфы имеют сумеречное зрение и не получают штрафа -2 Восприятия утром");
        skillImp.addSkill(elvenDuskVision);
        Skill elvenBleed = new Skill();
        elvenBleed.setName("Bleed_Vulnerability");
        elvenBleed.setSkillType(RACIAL);
        elvenBleed.setSkillText("У эльфов степень полученного кровотечения растет на 1, кроме того его эффекты наступают на 1 раунд быстрее(в случае Сильного и Критического кровотечения полные эффекты работают в начале раунда и дополнительно наносят 1 в конце)");
        skillImp.addSkill(elvenBleed);
        Skill industrial_Allergy = new Skill();
        industrial_Allergy.setName("Industrial_Allergy");
        industrial_Allergy.setSkillType(RACIAL);
        industrial_Allergy.setSkillText("Эльфы склонны вырабатывать аллергическую реакцию на \"ненатуральные\" вещества, такие как порох, металлы, алхимическая резина и т.д.");
        skillImp.addSkill(industrial_Allergy);
        Skill easy_Walk = new Skill();
        easy_Walk.setName("Easy_Walk");
        easy_Walk.setSkillType(RACIAL);
        easy_Walk.setSkillText("Эльфы не тратят усталость на длительные переходы по пересеченной местности, но только если они не перегружены.");
        skillImp.addSkill(easy_Walk);
        Skill


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
        skillImp.addSkill(skill);

        System.out.println(skill.getSkillText());

//        skill = skillImp.getSkillByName("Tough_Physique");
        System.out.println(skill.getName());
        System.out.println(skill.getSkillText());

        charList.addSkill(skill);

        imp.addCharList(charList);
        System.out.println("Done with adding skill and charlist");
        System.out.println("Let try to take this shit back");

        charList = imp.getCharListById(1L);

        System.out.println(charList.getName());
        System.out.println(charList.getAge());

        System.out.println("Get skill from a charlist");
        Set<Skill> skillsHash = charList.getSkills();
        Skill newSkill = skillsHash.stream().iterator().next();
        System.out.println(newSkill.getName());
        System.out.println(newSkill.getSkillText());

        System.out.println("Get skill from skill table");
        newSkill = skillImp.getSkillByName("Tough_Physique");
        System.out.println(newSkill.getName());
        System.out.println(newSkill.getSkillText());
    }
}