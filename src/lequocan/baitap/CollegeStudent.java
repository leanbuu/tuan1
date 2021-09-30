package lequocan.baitap;

public class CollegeStudent extends Student{
    protected String major;
    protected int year;

    public CollegeStudent(String name, int age, String gender,String id, double myGDA, int year, String major){
        super(name,age,gender,id,myGDA);
        this.major = major;
        this.year = year;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
      
        return super.toString()+"year:"+this.year+",maojor:"+major;
    }
}