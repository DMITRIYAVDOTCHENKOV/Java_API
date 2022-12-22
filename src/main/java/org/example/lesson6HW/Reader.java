package org.example.lesson6HW;


import java.util.Arrays;

public class Reader {
    private String surname;
    private String firstName;
    private String patronymic;
    private int NumberOfTheLibraryCard;
    private String faculty;
    private String dateOfBirth;
    private String phone;

    public String getSurname () {
        return surname;
    }

    public void setSurname (String surname) {
        this.surname = surname;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic () {
        return patronymic;
    }

    public void setPatronymic (String patronymic) {
        this.patronymic = patronymic;
    }

    public int getNumberOfTheLibraryCard () {
        return NumberOfTheLibraryCard;
    }

    public void setNumberOfTheLibraryCard (int numberOfTheLibraryCard) {
        NumberOfTheLibraryCard = numberOfTheLibraryCard;
    }

    public String getFaculty () {
        return faculty;
    }

    public void setFaculty (String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth () {
        return dateOfBirth;
    }

    public void setDateOfBirth (String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone () {
        return phone;
    }

    public void setPhone (String phone) {
        this.phone = phone;
    }

    public Reader (String surname, String firstName, String patronymic, int numberOfTheLibraryCard, String faculty, String dateOfBirth, String phone) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
        NumberOfTheLibraryCard = numberOfTheLibraryCard;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }


    //Инициализируем кол-во вернутых книг
    public void returnBook (int book) {
        System.out.printf("%s %s. %s. Вернул в библиотеку %d книги\n", surname, firstName.charAt(0),
                patronymic.charAt(0),
                book);

    }

    //Инициализация названий книг( которые вернули)
    public void returnBook (Books... nameBoks) {
        System.out.printf("%s %s. %s. Вернул в библиотеки книги: %s\n", surname, firstName.charAt(0),
                patronymic.charAt(0),
                Arrays.toString(nameBoks));
    }

    //Имя автора и название книги
    public void returnBook (String... parameterName) {
        System.out.printf("%s %s. %s. Вернул в библиотеки книги: %s\n", surname, firstName.charAt(0),
                patronymic.charAt(0),
                Arrays.toString(parameterName));
    }

    //Инициализируем кол-во взятых книг
    public void takeBooks (int book) {
        System.out.printf("%s %s. %s. Взял в библиотеки %d книги\n", surname, firstName.charAt(0), patronymic.charAt(0),
                book);
    }

    //Инициализация названий книг( которые взяли)
    public void takeBooks (Books... nameBoks) {
        System.out.printf("%s %s. %s. Взял в библиотеки книги: %s\n", surname, firstName.charAt(0),
                patronymic.charAt(0),
                Arrays.toString(nameBoks));
    }

    //Имя автора и название книги
    public void takeBooks (String... parameterName) {
        System.out.printf("%s %s. %s. Взял в библиотеки книги: %s\n", surname, firstName.charAt(0),
                patronymic.charAt(0),
                Arrays.toString(parameterName));
    }

    @Override
    public String toString () {
        return "Карточка студента: " +
                "Имя='" + surname + '\'' +
                ", Фамелия -'" + firstName + '\'' +
                ", Отчество -'" + patronymic + '\'' +
                ", Номер билета -" + NumberOfTheLibraryCard +
                ", Факультет -'" + faculty + '\'' +
                ", Дата рождения -" + dateOfBirth +
                ", Телефон для связи -'" + phone + '\'' +
                '.';
    }
}
