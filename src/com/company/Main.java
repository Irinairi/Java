package com.company;

import javax.print.DocFlavor;

public class Main {

    public  void main(String[] args) {


        System.out.println("Hello");
        System.out.println("Irina");
        int myInt = 1450;
        byte myByte = 123;
        int resultat = myInt + myByte;
        System.out.println(resultat);

        short myShort = 111;
        long myLong = 2225;
        long resultat2 = myLong / myShort;
        System.out.println(resultat2);


        char myChar = 6;
        double myDouble = 8;

        double resultat3 = myChar * myDouble;
        System.out.println(resultat3);


        float myfloat = -5;
        System.out.println(resultat3 + myfloat);

        byte h = 55;
        short f = 9;
        float resultat4 = h + f;
        System.out.println(resultat4);

        int g = 9;
        float resultat5 = resultat4 % 9;
        System.out.println(resultat5);

        float c = -3;
        short v = 5;
        float resultat6 = c * v;
        System.out.println(resultat6);
        int b = 8;
        float resultat7 = (resultat6 / b);
        System.out.println(resultat7);

        byte s = 20;
        float resultat8 = resultat7 + s;

        System.out.println(resultat8);

        byte m = 15;
        short y = 3;
        float resulatat9 = (m / y);
        System.out.println(resulatat9);
        short x = 2;
        float resultatz = resulatat9 * x;
        System.out.println(resultatz);
        short w = 8;
        float z = 3;
        float resultata = w % z;
        System.out.println(resultata);
        float resultat11 = (resultatz - resultata);

        System.out.println(resultat11);

        int q = 5;
        float resultate = (resultat11 + q);
        System.out.println(resultate);
        System.out.println(" ");
        System.out.println(" *lab2*");
        System.out.println(" ");

}

    public static void printmyName(){
        System.out.println ("Hello/n Irina");
    }

    public static void sum() {
        int sum = 1450 + 123;
        System.out.println(sum);
    }
    public static void division(){
        long division = 2225/111 ;
        System.out.println(division);
    }
    public static void multiplication() {
        double multiplication = 6 * 8;
        System.out.println(multiplication);
        System.out.println(multiplication + (-5));
    }
    public static void sum2() {
        short sum2 =55+9;
        int  division = sum2 %9  ;
        System.out.println(sum2  );
        System.out.println( division);
    }
    public static void multiplication3(){
        float multiplication3 = (-3* 5);
        float division2 = (multiplication3 / 8 );
        float sum3 =(division2 +20);
        System.out.println(multiplication3);
        System.out.println(division2);
        System.out.println(sum3);
    }

    public static void division3() {
        int division3 = 15 / 3;
        int variableLocale = 2;
        float multiplication4 =(division3 * variableLocale );
        System.out.println(division3);
        System.out.println(multiplication4 );

    }
    public static int adunare (int primulNumarl,short alDoileaNumar) {
        int rezultat= 60+30;
        return rezultat;
    }
    public static float impartire (int primulNumarl,short alDoileaNumar) {
        int rezultat1 = 60/30;
        return rezultat1;

    }
    public static int scadere(int primulNumarl,short alDoileaNumar){
        int rezultat2 = 60- 30;
        return rezultat2;
    }

    public static void JavaPointObject(){


        System.out.println("          J          A             V           V              A             ");
        System.out.println("          J        A   A            V         V             A   A           ");
        System.out.println("          J       A  A  A             V      V             A  A  A          ");
        System.out.println("      J   J      A       A             V    V             A       A         ");
        System.out.println("       JJ       A         A               V              A         A        ");

    }

    public static void JavaPoint(){

        System.out.println("      + ''  ''  ''  ''  ''   +    ");
        System.out.println("      |                      |    ");
        System.out.println("    [ |       o     o        | ]  ");
        System.out.println("      |          ^           |    ");
        System.out.println("      |        ' _ '         |    ");
        System.out.println("      |                      |    ");
        System.out.println("      +_ _ _ _ _ _ _ _ _ _ _ +    ");

    }

    public static int average(int...numbers){
        int total=0;
        for (int x :numbers)
            total+=x;
        return total/numbers.length;

    }
    public static float restulImpartirii () {
        int a = 7;
        float d = 3;
        float restul = 7 % 3;
        return restul;

    }
}





