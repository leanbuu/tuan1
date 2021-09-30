package lequocan.baitap;



public class Student extends Person {
    protected String id;
    protected double myGDA;
    public Student(String name, int age, String gender, String id, double myGDA){
        super(name,age,gender);
        this.id = id;
        this.myGDA = myGDA;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getMyGDA() {
        return myGDA;
    }
    public void setMyGDA(double myGDA) {
        this.myGDA = myGDA;
    }
    @Override
    public String toString() {
        return super.toString()+"id:"+this.id+",myGDA"+this.myGDA;
    }
}
