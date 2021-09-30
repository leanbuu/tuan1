package test;

public abstract class  Shape {
    protected String name;
    
    public Shape(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    protected abstract double getArea();
    protected abstract double getPrimiter();
    void xuat(){
        System.out.println("Ten:"+this.name);
    }
    
}
