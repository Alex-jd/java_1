package Alexeenko.Alexandr.Lesson_4_homework.AnimalWorld;

import Alexeenko.Alexandr.Lesson_4_homework.Base_interface;

/**
 * Created by Alex_JD on 14.11.2015.
 */
public class ZombieHuman extends Humans implements Base_interface {

    public boolean couldBeNormal;
    public String imageZombie;

    ZombieHuman (String name, boolean bad_good, String typeOfOrganism,
                 String propertyImage, String baseSmart, boolean blackOrWhite, boolean couldBeNormal) {
        super(name, bad_good, typeOfOrganism, propertyImage, baseSmart, blackOrWhite);
        this.couldBeNormal = couldBeNormal;

    }

    public void becomesToNormal (boolean couldBeNormal) {
        System.out.print("Процесс превращения зомби в нормального");
    }

    public void propertySkill () {
        System.out.print("Особые навыки зомби");
    }

    private void funcImage (String propertyImage, String imageZombie) {
        System.out.print("Отрисовываем персонаж зомби");
    }

    @Override
    public void jump () {
        System.out.print("Зомби прыгает так...");
    }

}
