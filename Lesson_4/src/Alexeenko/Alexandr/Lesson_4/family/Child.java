package Alexeenko.Alexandr.Lesson_4.family;

/**
 * Created by Alex_JD on 07.11.2015.
 */
public class Child extends Parent {
    public String name;

    public void doWork () {
        String secret = this.familySecret;
        this.getSameSecret();
    }

    public String getDetail () {
        String details = super.getDetail() + "+Child";
        return details;
    }

}
