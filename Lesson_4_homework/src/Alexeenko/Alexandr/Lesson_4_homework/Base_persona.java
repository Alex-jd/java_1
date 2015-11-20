package Alexeenko.Alexandr.Lesson_4_homework;

/**
 * Created by Alex_JD on 13.11.2015.
 */
public abstract class Base_persona {
    private String name;
    private boolean bad_good;
    private String typeOfOrganism;
    private String propertyImage;// Внешний вид персонажа

    public Base_persona(String name, boolean bad_good, String typeOfOrganism, String propertyImage) {
        this.name = name;
        this.bad_good = bad_good;
        this.typeOfOrganism = typeOfOrganism;
        this.propertyImage = propertyImage;

    }

    public void base_motion () {
        System.out.print("Простое движение");
    }

    public void run () {
        System.out.print("Умение бегать");
    }

    public void jump () {

    }

}
