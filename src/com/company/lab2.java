package com.company;


import java.util.ArrayList;
import java.util.List;

public class lab2 {
    public static void main(String[] args) {

        printmyName();
        sum();
        division();
        multiplication();
        sum2();
        multiplication3();
        division3();
        //tem if/else
        Calculator calcul = new Calculator();
        //System.out.println(" Rezultatul adunarii este :" + adunare(2, (short) 3));
        calcul.adunare(2,3);
        calcul.adunare(2,3,4);
        calcul.adunare(2,3);
        calcul.impartire(2,(short)3);
        calcul.impartire(2,3);
        calcul.impartire(2,1,3);
        calcul.inmultirii(2,3);


        //System.out.println("Rezultatul impartirii:" + impartire(2, (short) 3));
        calcul.inmultirii(2,(short)3);
        calcul.inmultirii(2,(short)3,(short)4);
        calcul.scadere(2,(short)3);
        calcul.scadere(2,3);
        calcul.scadere(2,(short)2,(short)3);


        //System.out.println("Rezultatul scaderii este:" + scadere(2, (short) 3));

        JavaPointObject();
        System.out.println("3");
        System.out.println(average(80, 40, 20));
        JavaPoint();
        System.out.println("4");
        System.out.println("Restul impartirii este :" + restulImpartirii());

        // part cu exercitii
        LogicalOp oper = new LogicalOp();

        int x = 8;
        int y = 4;
        int h = 5;
        int a = 5;
        int bigger = oper.getCheckBiggerNumber(x, y);
        System.out.println("The bigger number is:" + bigger);
        String text = oper.CheckTextFastTrack("FastTrackIT");
        System.out.println(oper.CheckTextFastTrack(text));
        String textNumber = oper.getTextAndNumber("FastTrack", 5);
        System.out.println(oper.getTextAndNumber(" ", 5));
        oper.isNumberEven(5);
        System.out.println(oper.isNumberEven(5));

        oper.LargestNumber(88,77,44);
        System.out.println(oper.LargestNumber(88,77,44));

        oper.printNumber(5);
        oper.isEligibleToVote(18);
        oper.Count(1);

         oper.CountNumber(1);
        oper.BetweenNumber(2,78);
        oper.TheNumberLarg( 9,100);
        oper.TheEvenNumber(1,100);
        oper.printOddNumber(1,100);
        oper.printNumarul(""+5);
        oper.printAverage(""+2);
        oper.printNumerele(100);
        //oper.printRezultat(-1);
        oper.printNumbe(2,99);
        oper.printWhileNumber(100,4);
        oper.printNumerePare( );
        oper.printEven();
        oper.printSumAverage( );
        //oper.printMediaDivi( );
        //oper.printAfisareNumere(  );
        int []myArray =oper.getArrayHundred();
        oper.printArray(myArray);
        int []myArrayEven =oper.getArrayEven();
       System.out.println(oper.getAverageFromArray(myArray));
       System.out.print(oper.StrigArray(new String []{"lapte","carne","oua"},"lapte"));
       System.out.println("number position is:"+oper.ReturnNumber(new int[]{1,2,3,4,5,6},4));

        List<Integer> myList =new ArrayList();


        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(7);
        oper.printList(myList);

        oper.printmyList(myList,2);

        oper.addToList(myList,12);
        oper.addList(myList,-1);


     List<String>myString =new ArrayList();
     myString.add("first");
     myString.add("second");
     myString.add("third");

     oper.AddToStrindList(myString,2,"a");

        oper.addTheList(20,myList);
        oper.printVallueAndList(myList,0);


    }



    public static void printmyName() {
        System.out.println("Hello/n Irina");
    }

    public static void sum() {
        int sum = 1450 + 123;
        System.out.println(sum);
    }

    public static void division() {
        long division = 2225 / 111;
        System.out.println(division);
    }

    public static void multiplication() {
        double multiplication = 6 * 8;
        System.out.println(multiplication);
        System.out.println(multiplication + (-5));
    }

    public static void sum2() {
        short sum2 = 55 + 9;
        int division = sum2 % 9;
        System.out.println(sum2);
        System.out.println(division);

    }

    public static void multiplication3() {
        float multiplication3 = (-3 * 5);
        float division2 = (multiplication3 / 8);
        float sum3 = (division2 + 20);
        System.out.println(multiplication3);
        System.out.println(division2);
        System.out.println(sum3);
    }

    public static void division3() {
        int division3 = 15 / 3;
        int variableLocale = 2;
        float multiplication4 = (division3 * variableLocale);
        System.out.println(division3);
        System.out.println(multiplication4);

    }

    public static int adunare(int primulNumarl, short alDoileaNumar) {
        int rezultat = 60 + 30;
        return rezultat;
    }

    public static float impartire(int primulNumarl, short alDoileaNumar) {
        int rezultat1 = 60 / 30;
        return rezultat1;

    }

    public static int scadere(int primulNumarl, short alDoileaNumar) {
        int rezultat2 = 60 - 30;
        return rezultat2;
    }

    public static void JavaPointObject() {


        System.out.println("          J          A             V           V              A             ");
        System.out.println("          J        A   A            V         V             A   A           ");
        System.out.println("          J       A  A  A             V      V             A  A  A          ");
        System.out.println("      J   J      A       A             V    V             A       A         ");
        System.out.println("       JJ       A         A               V              A         A        ");

    }

    public static void JavaPoint() {

        System.out.println("      + ''  ''  ''  ''  ''   +    ");
        System.out.println("      |                      |    ");
        System.out.println("    [ |       o     o        | ]  ");
        System.out.println("      |          ^           |    ");
        System.out.println("      |        ' _ '         |    ");
        System.out.println("      |                      |    ");
        System.out.println("      +_ _ _ _ _ _ _ _ _ _ _ +    ");

    }

    public static int average(int... numbers) {
        int total = 0;
        for (int x : numbers)
            total += x;
        return total / numbers.length;

    }

    public static float restulImpartirii() {
        int a = 7;
        float d = 3;
        float restul = 7 % 3;
        return restul;

    }



     }





















