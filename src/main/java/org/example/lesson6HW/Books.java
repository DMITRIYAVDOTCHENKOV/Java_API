package org.example.lesson6HW;

public class Books {
    private String nameBook;
    private String aftorBook;

    public String getNameBook () {
        return nameBook;
    }

    public void setNameBook (String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAftorBook () {
        return aftorBook;
    }

    public void setAftorBook (String aftorBook) {
        this.aftorBook = aftorBook;
    }

    public Books (String nameBook, String aftorBook) {
        this.nameBook = nameBook;
        this.aftorBook = aftorBook;
    }

    @Override
    public String toString () {
        return "Книга{" +
                "'" + nameBook + '\'' +
                ", автор-'" + aftorBook + '\'' +
                '}';
    }
}

