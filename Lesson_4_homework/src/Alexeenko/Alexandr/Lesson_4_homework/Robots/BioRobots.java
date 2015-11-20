package Alexeenko.Alexandr.Lesson_4_homework.Robots;

import Alexeenko.Alexandr.Lesson_4_homework.Base_interface;

/**
 * Created by Alex_JD on 13.11.2015.
 */
public class BioRobots extends Robots implements Base_interface {

    public String baseAnimal; //Какое животное взято за основу


    BioRobots (String name, boolean bad_good, String typeOfOrganism,
               String propertyImage, String typeOfEnergy, String typeOfRobots,String baseAnimal) {
        super( name, bad_good, typeOfOrganism, propertyImage, typeOfEnergy, typeOfRobots);
        this.baseAnimal = baseAnimal;
    }


    public void propertySkill () {
        System.out.print("Особое умение биоробота");
    }

    private void funcImage (String propertyImage, String baseAnimal) {
        System.out.print("Отрисовываем персонаж биоробота");
    }

    @Override
    public void jump () {
        System.out.print("Биоробот прыгает так...");
    }


}
