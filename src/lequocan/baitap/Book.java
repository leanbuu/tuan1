package lequocan.baitap;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInstock;

    public Book(String name, Author author, double price, int qtyInstock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInstock = qtyInstock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInstock() {
        return qtyInstock;
    }

    public void setQtyInstock(int qtyInstock) {
        this.qtyInstock = qtyInstock;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}