package lequocan.baitap;

public class testBook {
    public static void main(String[] args) {

        Author anAuthor = new Author("Quốc An", "a@gmail.con", 'm');
        Book aBook = new Book("JAVA vui", anAuthor, 20, 1000);
        Book anotherBook = new Book("JAVA", new Author("ANN", "ann@gamil.com", 'm'), 30, 500);
        System.out.println(aBook);

        System.out.println("Thông tin Sách: " + anotherBook.toString());
    }
}