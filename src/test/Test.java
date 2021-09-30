package test;

public class Test{
    public static void main(String[] args) {
        Person an = new Person("AN",19,"men");
        System.out.println(an.toString());
        Student tuan = new Student("Tuan", 1, "nu", "baba", 3.5);
        System.out.println(tuan.toString());
        Teacher thay = new Teacher("haha", 50, "m", "toan", 3000);
        System.out.println(thay.toString());
        CollegeStudent haha = new CollegeStudent("HAHA", 20, "m", "sdas", 3, 3, "enlish");
        System.out.println(haha.toString());
    }
}