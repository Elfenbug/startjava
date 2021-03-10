package com.startjava.lesson_02.robot;

public class JaegerTest {
    public static void main(String args[]) {
        Jaeger gipsyDanger = new Jaeger();
        Jaeger chernoAlpha = new Jaeger();

        gipsyDanger.setModelName("Gipsy Dander");
        gipsyDanger.setMark("Mark-3");
        gipsyDanger.setOrigin("USA");
        gipsyDanger.setHeight(79.25f);
        gipsyDanger.setWeight(1.98f);
        gipsyDanger.setSpeed(7);
        gipsyDanger.setStrength(8);
        gipsyDanger.setArmor(6);
        gipsyDanger.setOpSystem("Blue Spark 4.1");

        chernoAlpha.setModelName("Cherno Alpha");
        chernoAlpha.setMark("Mark-1");
        chernoAlpha.setOrigin("Russia");
        chernoAlpha.setHeight(85.34f);
        chernoAlpha.setWeight(2.412f);
        chernoAlpha.setSpeed(3);
        chernoAlpha.setStrength(10);
        chernoAlpha.setArmor(10);
        chernoAlpha.setOpSystem("Unknown");

        System.out.println(gipsyDanger.getOpSystem());
        System.out.println(chernoAlpha.getHeight());

        gipsyDanger.move();
        chernoAlpha.useWeapon();

    }
}