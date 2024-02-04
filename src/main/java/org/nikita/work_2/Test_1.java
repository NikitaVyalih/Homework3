package org.nikita.work_2;

public class Test_1 {

    final static double pi = 3.14;

    public void S(double r){
        System.out.println("Площадь = " + (pi * r * r));
    }

    public static void O(double r){
        System.out.println("Длина окружности = " + (2 * pi * r));
    }

    public void printInfo(double r){
        System.out.println("Радиус = " + r);
        System.out.println("Площадь = " + (pi * r * r));
        System.out.println("Длина окружности = " + (2 * pi * r));
    }
}

class TestReal_1{

    public static void main(String[] args) {

        Test_1 test1 = new Test_1();
        test1.S(2.0);
        System.out.println();

        Test_1.O(3.0);
        System.out.println();

        test1.printInfo(4.0);

    }



}
