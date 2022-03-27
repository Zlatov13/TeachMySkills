public class Book {
    private int id;
    private long number;
    private String name;
    private String author;
    private int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", count=" + count +
                '}';
    }
}

