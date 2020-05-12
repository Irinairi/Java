package com.company;

public class Calculator {


    public int adunare(int primulNumar, short alDoileaNumar) {
        int rezultat = primulNumar + alDoileaNumar;
        return rezultat;
    }

    public int impartire(int primulNumar, short alDoileaNumar) {
        int rezultat1 = primulNumar / alDoileaNumar;
        return rezultat1;
    }

    public int inmultirii(int primulNumar, short alDoileaNumar) {
        int rezultat2 = primulNumar * alDoileaNumar;
        return rezultat2;
    }

    public int scadere(int primulNumar, short alDoileaNumar) {
        int rezultat3 = primulNumar - alDoileaNumar;
        return rezultat3;
    }

}