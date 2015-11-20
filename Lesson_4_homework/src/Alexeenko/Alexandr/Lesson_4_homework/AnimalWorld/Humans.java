package Alexeenko.Alexandr.Lesson_4_homework.AnimalWorld;

import Alexeenko.Alexandr.Lesson_4_homework.Base_persona;

/**
 * Created by Alex_JD on 14.11.2015.
 */
public class Humans extends Base_persona {
    public String baseSmart; // Начальный уровень умений
    public boolean blackOrWhite;
    public int health;

    Humans (String name, boolean bad_good, String typeOfOrganism,
            String propertyImage, String baseSmart, boolean blackOrWhite) {
        super (name, bad_good, typeOfOrganism, propertyImage);
        this.baseSmart = baseSmart;
        this.blackOrWhite = blackOrWhite;

    }

    public void armor (int health) {
        System.out.print("Создание необходимой брони");
    }


}
