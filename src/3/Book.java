package 3;

public class Book {
    private String name;
    private int year;
    private String writer;
    private int pages;
    private int price;

    public Book(String name, int year,  String writer, int pages, int price){
        this.name = name;
        this.year = year;
        this.writer = writer;
        this.pages = pages;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String author) {
        this.writer = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book" + "name = " + name + "year = " + year + "writer = " + writer + "pages = " + pages + "price = " + price;
    }
}
