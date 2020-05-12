package com.company;

public class LogicalOp {


    public int getCheckBiggerNumber(int first, int second) {
        if (first > second) {
            return first;

        } else {
            return second;
        }
    }

    public String CheckTextFastTrack(String text) {
        if (text.equals("FastTrackIT")) {
            return ("Learning text comparison");
        } else {
            return ("Got try to some more");
        }

    }

    public String getTextAndNumber(String text, int a) {
        if ((text.equals("FastTrackIT") && (a <= 3))) {
            return (text + a);
        }
        if ((!text.equals("FastTrackIT")) && (a <= 3)) {

        } else {
            return a + text;
        }
        return text;
    }

    public boolean isNumberEven(int number) {

        if (number % 2 == 0) {

            return true;
        } else {
            return false;
        }

    }


    public int LargestNumber(int first1, int second1, int third1) {
        if (first1 > second1 && first1 > third1) {
            return first1;
        } else if (second1 > first1 && second1 > third1) {
            return second1;
        } else if (third1 > second1 && third1 > first1) {
            return third1;
        } else return first1;
    }

    public void printNumber(int caseNumber) {

        switch (caseNumber) {

            case 1:
                System.out.println("The number is: 1 ");
                break;
            case 2:
                System.out.println("The number is: 2");
                break;
            case 3:
                System.out.println("The number is: 3");
                break;
            case 4:
                System.out.println("The number is: 4");
                break;
            case 5:
                System.out.println("The number is: 5");
                break;


        }
    }

    public boolean isEligibleToVote(int varsta) {
        if (varsta > 18)
            return true;
        else
            return false;
    }

    //Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.//
// Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100, //
// pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    public static void Count(int number) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("the value of i is:" + i);
        }
    }

    //Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.//
// Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.//
// Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    public static void CountNumber(int num) {
        for (int m = num; m >= -100; m--) {

            System.out.println("" + m);
        }
    }


    //Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda sa afiseze o numaratoare intre cele doua numere primite, //
// pornind de la primul parametru primit, pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
    public static void BetweenNumber(int primul, int aldoilea) {

        for (int v = primul; v <= aldoilea; v++) {
            System.out.println("betwenNumbers of v,g is" + v);
        }
    }

//Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda trebuie sa verifice care dintre cele doua numere este mai mare, //
// si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.//
// (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).

    public static void TheNumberLarg(int first, int second) {
        for (int x = first, y = second; x < second && y > first; x++) {

            System.out.println("TheNumberCreasing of first ,second is:" + x);
        }


    }

    //Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public static void TheEvenNumber(int primu, int aldoilea) {
        for (int x = primu; x <= aldoilea; x++) {
            if (x % 2 == 0) {
                System.out.println(x + "  ");
            }
        }
    }

    //Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public static void printOddNumber(int first, int second) {
        for (int i = first; i <= second; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "oddNumber");
            }
        }
    }

//Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100, //
// pornind de la numarul primit ca si parametru, iar la final sa returneze rezultatul.//
// Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public static void printNumarul(String args) {
        int num = 5, count, total = 0;
        for (int i = 5; i <= 100; i++) {
            total = total + i;
        }
        System.out.println("Sum of first 5 natural number is:" + total);
    }
    //Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100, //
    // pornind de la numarul primit ca si parametru, si sa calculeze media numerelor. La final, metoda sa returneze media. //
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public static void printAverage(String arg) {
        int numi = 1, count, sum = 0;
        for (int i = numi; i <= 100; i++) {

            sum = sum + i % 100;

        }
        System.out.println("average ");
    }


    //Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.//
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru. //
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public static void printNumerele(int i) {

        while (i > 1) {
            System.out.println(i);
            i--;
        }
    }

//Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit, //
// si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru. //
// Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    // public static void printRezultat(int number){
    //   int i=-100;
    // while (i<-1){
    //   System.out.println(i);
    //  i--;

    // }

    // }

    //. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. //
    // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit, //
    // pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.

    public static void printNumbe(int i, int c) {

        while (i < c) {
            System.out.println(i);
            i++;

        }
    }

    //Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. //
// Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.//
// (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
    public static void printWhileNumber(int x, int y) {
        while (x > y) {
            System.out.println(y);
            y++;
        }
    }

    // Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public static void printNumerePare() {
        int x = 1;
        while (x <= 100) {
            if (x % 2 == 0)
                System.out.println(x + "");
            x++;

        }
    }
    //Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public static void printEven() {
        int x = 1;
        while (x <= 100) {
            if (x % 2 == 1)
                System.out.println(x + "");
            x++;
        }
    }

    //Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.//
    // Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval. //
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public static void printSumAverage() {
        int i = 111;
        float sum = 0;
        while (i <= 8899) {
            sum = sum + i;
            i++;
        }
        float average = sum / 8788;

        System.out.println(sum);
        System.out.println(average);
    }


    // Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7, din acel interval. //
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
   // public static void printMediaDivi() {
      //  int i = 1, cout = 0, sum = 0;

    // while ( i <= 100; i++)
           // if (i % 7 == 0)

    //}
}

        //Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.
        //public static void printAfisareNumere ( int i){
           // int i = 1, i1 = 1, i2;
           // while (i < 18) i++;
           // {
              //  i2 = i1 + i;
               // i = i1;
               // i1 = i2;

               // System.out.println(i + " " + i1 + " ");
            //}


//}