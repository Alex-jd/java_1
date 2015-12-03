package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            String str = null;
            //str.contains("a");

            int[] mass = {1,2,3};
            int tmp = mass[1];
            int temp = mass[3];
        }
        /*catch (NullPointerException e) {
            System.out.println("Exception NullPointer");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Exception ArrayBounds");
        }*/
        catch (Exception e) {
            System.out.println("dsdff");
        }
        finally {
            System.out.println("pre Exit");
        }
        System.out.print("Exit");

    }
}
