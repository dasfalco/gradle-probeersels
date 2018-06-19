package vdab;

public class Main extends Breuk  {
    public static void main(String[] args) {


    Breuk a = new Breuk(1,2);
    Breuk b = new Breuk(3,4);
    Breuk output = new Breuk();

    output = a.plus(b);
        System.out.println(output);

}
 }