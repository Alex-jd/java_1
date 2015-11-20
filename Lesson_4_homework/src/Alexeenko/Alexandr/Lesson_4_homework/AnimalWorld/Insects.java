package Alexeenko.Alexandr.Lesson_4_homework.AnimalWorld;

import Alexeenko.Alexandr.Lesson_4_homework.Base_persona;

/**
 * Created by Alex_JD on 14.11.2015.
 */
public class Insects extends Base_persona {

    public String baseInsect;
    public boolean haveWhings;

    Insects (String name, boolean bad_good, String typeOfOrganism,
             String propertyImage, String baseInsect) {
        super(name, bad_good, typeOfOrganism, propertyImage);
        this.baseInsect = baseInsect;
    }

    public void makeFly (boolean haveWhings) {
        System.out.print("Создание полета");
    }

}
