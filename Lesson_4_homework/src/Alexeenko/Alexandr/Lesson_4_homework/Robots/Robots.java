package Alexeenko.Alexandr.Lesson_4_homework.Robots;

import Alexeenko.Alexandr.Lesson_4_homework.Base_persona;

/**
 * Created by Alex_JD on 13.11.2015.
 */
public class Robots extends Base_persona {
    public String typeOfRobots;
    public String typeOfEnergy;

    Robots (String name, boolean bad_good, String typeOfOrganism,
            String propertyImage, String typeOfEnergy, String typeOfRobots) {
        super( name, bad_good, typeOfOrganism, propertyImage);
        this.typeOfEnergy = typeOfEnergy;
        this.typeOfRobots = typeOfRobots;

    }

    public void baseEnergySpend (String typeOfEnergy) {
        System.out.print("Базовый расход энергии");
    }

    public void runEnergySpend () {
        System.out.print("Расход энергии во время бега");

    }

}
