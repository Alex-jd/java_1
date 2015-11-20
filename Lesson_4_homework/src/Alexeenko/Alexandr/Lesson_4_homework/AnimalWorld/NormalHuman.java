package Alexeenko.Alexandr.Lesson_4_homework.AnimalWorld;

import Alexeenko.Alexandr.Lesson_4_homework.Base_interface;

/**
 * Created by Alex_JD on 14.11.2015.
 */
public class NormalHuman extends Humans implements Base_interface {

    public String imageActor;

    NormalHuman (String name, boolean bad_good, String typeOfOrganism,
                 String propertyImage, String baseSmart, boolean blackOrWhite, String imageActor) {
        super(name, bad_good, typeOfOrganism, propertyImage, baseSmart, blackOrWhite);
        this.imageActor = imageActor;
    }

    public void propertySkill () {
        System.out.print("Особые навыки нормального человека");
    }

    private void funcImage (String propertyImage, String imageActor) {
        System.out.print("Отрисовываем персонаж нормального человека");
    }

    @Override
    public void jump () {
        System.out.print("Нормальный человек прыгает так...");
    }


}
