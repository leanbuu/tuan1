    package test;

import java.util.Scanner;

public class Cirle extends Shape{
        static Scanner nhap = new Scanner(System.in);
        protected double radius;
        public Cirle(String name,double radius){
            super(name);
            this.radius = radius;
        }

        
        @Override
        protected double getArea() {
            System.out.println("Moi nhap R");
            radius = nhap.nextDouble();
            double dt = 2*radius*3.14*radius;
            return dt;
        }
        @Override
        protected double getPrimiter() {
            System.out.println("Moi nhap R");
            radius = nhap.nextDouble();
            double cv = 2*radius*3.14;
            return cv;
        }

    void xuat(){
        super.xuat();
        System.out.println(getArea());
        System.out.println(getPrimiter());
    }


    }