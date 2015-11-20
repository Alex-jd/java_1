package Alexeenko.Alexandr.Lesson_4.family;

/**
 * Created by Alex_JD on 07.11.2015.
 */
public class Parent {
    public String family;
    protected String familySecret;
    private String sameSecret;

    protected String getSameSecret () {
        return sameSecret;
    }

    public String getFamilySecret () {
        return familySecret;
    }

    public String getDetail () {
        return "Father";
    }
}
