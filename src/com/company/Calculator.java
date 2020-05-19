package com.company;

public class Calculator {


    public int adunare(int primulNumar, short alDoileaNumar) {
        int rezultat = primulNumar + alDoileaNumar;
        return rezultat;
    }

    public float adunare(int primulNumar, int alDoileaNumar,int alTreilea) {
      float rezultat = primulNumar + alDoileaNumar+alTreilea;
      return rezultat;
    }
    public float adunare (int primulNumar, int alDoileaNumar) {
        float rezultat = primulNumar + alDoileaNumar;
        return rezultat;
    }

    public int impartire(int primulNumar, short alDoileaNumar) {
        int rezultat1 = primulNumar / alDoileaNumar;
        return rezultat1;
    }

    public long impartire(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar / alDoileaNumar;
        return rezultat;
    }

    public float impartire(int primulNumar,int alDoileaNumar,int alTreilea) {
        int rezultat1 = primulNumar / alDoileaNumar/alTreilea;
        return rezultat1;
    }
    public int inmultirii(int primulNumar, short alDoileaNumar) {
        int rezultat2 = primulNumar * alDoileaNumar;
        return rezultat2;
    }

    public int inmultirii(int primulNumar, short alDoileaNumar,short alTreilea) {
        int rezultat2 = primulNumar * alDoileaNumar*alTreilea;
        return rezultat2;

    }
    public float inmultirii(int primulNumar, int alDoileaNumar) {
        int rezultat2 = primulNumar * alDoileaNumar;
        return rezultat2;
    }
    public int scadere(int primulNumar, short alDoileaNumar) {
        int rezultat3 = primulNumar - alDoileaNumar;
        return rezultat3;
    }

    public int scadere(int primulNumar, int alDoileaNumar) {
        int rezultat3 = primulNumar - alDoileaNumar;
        return rezultat3;
    }
    public float scadere(int primulNumar, short alDoileaNumar,short alTreilea) {
        int rezultat3 = primulNumar - alDoileaNumar-alTreilea;
        return rezultat3;
    }



    //1. In proiectul de Calculator, in clasa Calculator, supraincarcati toate metodele //
    // conform principiului polimorfismului.//
    // Creati cel putin cate doua metode polimorfe pentru fiecare metoda pe care o aveti in clasa.
    //
    //Spre exemplu, pentru metoda de adunare, faceti ca aceasta sa lucreze o data cu 2 int-uri, o data cu 2 float-uri//
    // , cu 3 float-uri, cu 4 int-uri, etc. Atentie ce returnati la final!
}