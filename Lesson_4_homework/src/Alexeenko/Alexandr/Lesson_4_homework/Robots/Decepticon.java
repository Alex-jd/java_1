package Alexeenko.Alexandr.Lesson_4_homework.Robots;

import Alexeenko.Alexandr.Lesson_4_homework.Base_interface;

/**
 * Created by Alex_JD on 13.11.2015.
 */
public class Decepticon extends Robots implements Base_interface {
    private String typeOfCar;// Тип автомобиля

    Decepticon (String name, boolean bad_good, String typeOfOrganism,
                String propertyImage, String typeOfEnergy, String typeOfRobots, String typeOfCar) {
        super(name, bad_good, typeOfOrganism, propertyImage, typeOfEnergy, typeOfRobots);
        this.typeOfCar = typeOfCar;
    }


    public void propertySkill () {
        System.out.print("Я умею превращаться в машину");
    }

    private void funcImage (String propertyImage, String typeOfCar) {
        System.out.print("Отрисовываем персонаж");
    }

    @Override
     public void jump () {
        System.out.print("Десептикон прыгает так...");

    }

}
