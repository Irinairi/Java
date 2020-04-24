package com.company;


public class lab2 { public static void main(String[] args) {


    printmyName();
    sum();
    division();
    multiplication();
    sum2();
    multiplication3();
    division3();

     System.out.println(" Rezultatul adunarii este :"+ adunare(  2,(short)3));
     System.out.println("Rezultatul impartirii:" +impartire (2,(short)3));
     System.out.println("Rezultatul scaderii este:"+scadere(2,(short)3));
     JavaPointObject();
     System.out.println ("3");
     System.out.println(average(80,40,20));
     JavaPoint();
     System.out.println ("4");
     System.out.println ("Restul impartirii este :"+ restulImpartirii() );


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
       public static float restulImpartirii (){
       int a = 7;
       float d  = 3;
       float restul = 7 % 3;
       return restul ;

}
         /* public static int hour;
          public static int minute;
          public static int second;     nu am reusit sa rezolv!!
          public static int viteza;
          public static int metrii;

         public void setTime(int h, int m, int s){
              hour =((h>=0 && h<24) ? h:0);
              minute =((m>=0 && m<60) ? m:0);
              second =((s>=0 && s<60) ? s:0);
              viteza=((m/s)       
          }
          public String togGirl(){
              float = ("07d:%02d:34d",hour,minute,second );
              float viteza= (100)
               String.format( "02d:%02d:45d",hour,minute,second ),
              return 
          }
          public static void viteza(double ore,double minute,double secunde,double metri){
             System.out.println ("Viteza in m/s:"+ rezultat);
             rezultat+( )    */
          }














