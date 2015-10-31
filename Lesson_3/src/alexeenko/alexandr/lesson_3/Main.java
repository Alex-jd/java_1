package alexeenko.alexandr.lesson_3;

public class Main {


    public static void main(String[] args) {
        Example examp = new Example();
	// write your code here
        boolean condition = true;
        boolean condition2 = false;
        boolean condition3 = true;
        int condition4 = 4;
        String condition5 = "Cond";
        String condition6 = "C";
        condition6 = "C" + "ond";

        Example examp = new Example(condition,condition2);
        Example examp2 = new Example();


        int param = examp.methodIf(condition, condition2, condition3, condition4,
                condition5, condition6);
        examp.ternar(param, condition4);

        Example.methodCycleSimple();//Ќапр€мую можно обращатьс€ к методу класса.





        examp.methodCycleIput(condition);
        examp.methodMatrix();






    }

}
