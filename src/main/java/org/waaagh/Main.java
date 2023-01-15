package org.waaagh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.waaagh.cli.CommandLineInterface;
import org.waaagh.model.CharList;
import org.waaagh.model.Skill;
import org.waaagh.repositories.SkillsRepository;
import org.waaagh.service.CharListServiceImp;
import org.waaagh.service.NonWebService;
import org.waaagh.service.SkillServiceImp;

import java.util.Set;

import static javax.security.sasl.Sasl.STRENGTH;
import static org.waaagh.num.Actions.FULL_ACTION;
import static org.waaagh.num.Culture.MERCENARY;
import static org.waaagh.num.Race.ELF;
import static org.waaagh.num.SkillType.*;
import static org.waaagh.num.Stats.DEXTERITY;
import static org.waaagh.num.Stats.PERCEPTION;

@SpringBootApplication
class Main implements CommandLineRunner {
    private static final CommandLineInterface cli = new CommandLineInterface();

    @Autowired
    private NonWebService service;
    @Autowired
    private CharListServiceImp imp;
    @Autowired
    private SkillServiceImp skillImp;
    @Autowired
    private SkillsRepository skillsRepository;

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
        charList.setRace(ELF);
        charList.setCulture(MERCENARY);
        Skill elf = new Skill();
        elf.setName("Elf_Winter");
        elf.setSkillType(RACIAL);
        elf.setSkillText("Персонаж - эльф, имеет эльфийскую физиологию, расовые навыки и культуру, в человеческом обществе считается нелюдью");
        skillImp.addSkill(elf);
        charList.addSkill(elf);
        Skill elvenDuskVision = new Skill();
        elvenDuskVision.setName("Improved_DuskVision");
        elvenDuskVision.setSkillType(RACIAL);
        elvenDuskVision.setSkillText("Чистокровные эльфы имеют сумеречное зрение и не получают штрафа -2 Восприятия утром");
        skillImp.addSkill(elvenDuskVision);
        charList.addSkill(elvenDuskVision);
        Skill elvenBleed = new Skill();
        elvenBleed.setName("Bleed_Vulnerability");
        elvenBleed.setSkillType(RACIAL);
        elvenBleed.setSkillText("У эльфов степень полученного кровотечения растет на 1, кроме того его эффекты наступают на 1 раунд быстрее(в случае Сильного и Критического кровотечения полные эффекты работают в начале раунда и дополнительно наносят 1 в конце)");
        skillImp.addSkill(elvenBleed);
        charList.addSkill(elvenBleed);
        Skill industrial_Allergy = new Skill();
        industrial_Allergy.setName("Industrial_Allergy");
        industrial_Allergy.setSkillType(RACIAL);
        industrial_Allergy.setSkillText("Эльфы склонны вырабатывать аллергическую реакцию на \"ненатуральные\" вещества, такие как порох, металлы, алхимическая резина и т.д.");
        skillImp.addSkill(industrial_Allergy);
        charList.addSkill(industrial_Allergy);
        Skill easy_Walk = new Skill();
        easy_Walk.setName("Easy_Walk");
        easy_Walk.setSkillType(RACIAL);
        easy_Walk.setSkillText("Эльфы не тратят усталость на длительные переходы по пересеченной местности, но только если они не перегружены.");
        skillImp.addSkill(easy_Walk);
        charList.addSkill(easy_Walk);
        Skill nature_Wisdom = new Skill();
        nature_Wisdom.setName("Nature's_Wisdom");
        nature_Wisdom.setSkillType(RACIAL);
        nature_Wisdom.setSkillText("Эльфы могут получать доступ к расовой магии Эльфийских Мудрецов.");
        skillImp.addSkill(nature_Wisdom);
        charList.addSkill(nature_Wisdom);
        Skill magick_Resistance_Elf = new Skill();
        magick_Resistance_Elf.setName("Elven_Magick_Resistance");
        magick_Resistance_Elf.setSkillType(RACIAL);
        magick_Resistance_Elf.setSkillText("Резист к Магии, естественная сопротивляемость организма к попытке воздействовать на него магией изнутри/напрямую. Игнорируется Целителями.(Конечность 13+М.Р/2, Корпус 23+М.Р.)");
        skillImp.addSkill(magick_Resistance_Elf);
        charList.addSkill(magick_Resistance_Elf);
        Skill inhuman_Dodge = new Skill();
        inhuman_Dodge.setName("Inhuman_Dodge");
        inhuman_Dodge.setSkillType(RACIAL);
        inhuman_Dodge.setSkillText("Чистокровные эльфы получают +1 к роллу уклонения, при равном броске защиты уклонением против атаки противника, эльф, по умолчанию выигрывает, однако если у противника есть навык на точность атаки, либо на атаку без промаха, используется правило парадокса(соревновательные броски удачи). Особенность игнорируется если у противника есть навык Боевая подготовка(эльфы).");
        skillImp.addSkill(inhuman_Dodge);
        charList.addSkill(inhuman_Dodge);
        Skill heighned_Perception = new Skill();
        heighned_Perception.setName("Heighned_Perception");
        heighned_Perception.setSkillType(RACIAL);
        heighned_Perception.setSkillText("эльфы слышат больше звуков чем другие расы, вдобавок различая больше запахов, что снижает сложность соответствующих бросков на ситуативные 2-4-6, однако получаемый звуковой урон повышается на 1.");
        skillImp.addSkill(heighned_Perception);
        charList.addSkill(heighned_Perception);
        Skill combat_training = new Skill();
        combat_training.setName("Combat_Training");
        combat_training.setSkillType(LINEAR);
        combat_training.setSkillSTATDependency(String.valueOf(STRENGTH));
        combat_training.setSkillSTATDependency(String.valueOf(DEXTERITY));
        combat_training.setSkillSTATDependency(String.valueOf(PERCEPTION));
        combat_training.setSkillText("Боевая подготовка отображает навык персонажа в обращении с оружием, ее удвоенное значение добавляется к броскам атаки, пробоя, запаса сил, определению финта, усиленному блоку и многим другим боевым навыкам, высокий уровень боевой подготовки позволяет открывать спецприемы и скиллы.");
        combat_training.setSkillLevel(2);
        skillImp.addSkill(combat_training);
        charList.addSkill(combat_training);
        Skill marksman = new Skill();
        marksman.setName("Marksman");
        marksman.setSkillType(LINEAR);
        marksman.setSkillSTATDependency(String.valueOf(STRENGTH));
        marksman.setSkillSTATDependency(String.valueOf(DEXTERITY));
        marksman.setSkillSTATDependency(String.valueOf(PERCEPTION));
        marksman.setSkillText("Навык Стрелок отображает умение персонажа обращаться с дальнобойным оружием, заменяет собой навык Боевой Подготовки, в случае если навык Стрелок выше");
        marksman.setSkillLevel(3);
        skillImp.addSkill(marksman);
        charList.addSkill(combat_training);
        Skill sniper_Shot = new Skill();
        sniper_Shot.setName("Sniper's_Shot");
        sniper_Shot.setSkillType(ACTIVE);
        sniper_Shot.setSkillSTATDependency(String.valueOf(PERCEPTION));
        sniper_Shot.setSkillText("Навык позволяющий персонажу гарантированно поразить цель на расстоянии до Восприятие х20 метров");
        sniper_Shot.setSkillFlashText("Снайперский выстрел!");
        sniper_Shot.setSkillCooldown(5);
        sniper_Shot.setSkillStaminaCost(5);
        sniper_Shot.setSkillActionCost(FULL_ACTION);
        skillImp.addSkill(sniper_Shot);
        charList.addSkill(sniper_Shot);

//        Skill skill = new Skill();
//        skill.setName("Tough_Physique");
//        skill.setSkillType(LINEAR);
//        skill.setSkillText("Персонаж обладает на удивление крепким телосложением" +
//                " и способен выдержать на 3 травмы больше за каждый пункт навыка");
//        skill.setSkillSTATDependency("ENDURANCE");
//        skill.setSkillActionCost(null);
//        skill.setSkillCost(0);
//        skill.setSkillCooldown(0);
//        skill.setSkillEffect("");
//        skillImp.addSkill(skill);
//
//        System.out.println(skill.getSkillText());
//
////        skill = skillImp.getSkillByName("Tough_Physique");
//        System.out.println(skill.getName());
//        System.out.println(skill.getSkillText());
//
//        charList.addSkill(skill);

        imp.addCharList(charList);
        System.out.println("Done with adding skill and charlist");
        System.out.println("Let try to take this shit back");

        charList = imp.getCharListById(1L);

        System.out.println(charList.getName());
        System.out.println(charList.getAge());

        Skill getSkill;

//        System.out.println("Get skill from a charlist");
//        Set<Skill> skillsHash = charList.getSkills();
//        newSkill = skillsHash.stream().iterator().next();
//        System.out.println(newSkill.getName());
//        System.out.println(newSkill.getSkillText());

        System.out.println("Get skill from skill table");
        getSkill = skillImp.getSkillByName("Elf_Winter");
        System.out.println(getSkill.getName());
        System.out.println(getSkill.getSkillText());
    }
}