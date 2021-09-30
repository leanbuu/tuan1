package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main{
    static Scanner nhap= new Scanner(System.in); 
    public static void main(String[] args) {
        List<Shape> hinh = new ArrayList<>();
        Shape shape;
        int a = 0;
        Shape hinh1 = new Triangle("Tam Giac", 5, 5, 9);
        System.out.println(hinh1.getArea());
        try{
            while(a<5){
                System.out.println("CHON HINH: 1/TRON 2/TAM GIAC");
                if(nhap.nextLine().equals("1")){
                    double radius;
                    System.out.println("NHAP DUONG KINH");
                    radius = nhap.nextDouble();
                    shape = new Cirle("tron", radius);
                    hinh.add(shape);
                }
                else
                {
                    double c1,c2,c3;
                    System.out.println("NHAP CANH C1:");
                    c1 = nhap.nextDouble();
                    System.out.println("NHAP CANH C2:");
                    c2 = nhap.nextDouble();
                    System.out.println("NHAP CANH C3:");
                    c3 = nhap.nextDouble();
                    shape = new Triangle("tam giac", c1, c2, c3);
                    hinh.add(shape);                    
                }
                nhap.nextLine();
                a++;
            }
        }catch(Exception e){
            e.getMessage();
        }
        for(Shape hi : hinh){
            hi.xuat();
        }
    }
}