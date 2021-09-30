package test;

public class Triangle extends Shape{
   protected double side1;
   protected double side2;
   protected double side3;

   public Triangle(String name, double side1, double side2, double side3){
       super(name);
       this.side1= side1;
       this.side2 = side2;
       this.side3 = side3;
}



    @Override
    protected double getArea() {
        return 0;
    }

    @Override
    protected double getPrimiter() {
       return side1+side2+side3;
    }

    void xuat(){
        super.xuat();
        System.out.println(getArea());
        System.out.println(getPrimiter());
    }
    

}