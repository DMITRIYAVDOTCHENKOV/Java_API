package org.example.lesson6HW;
//Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
//
//        1. ФИО,
//        2. номер читательского билета,
//        3. факультет,
//        4. дата рождения,
//        5. телефон.
//        6. Методы (экземпляра, без слова static)  takeBook(), returnBook().
//        7. Разработать программу, в которой создается массив объектов данного класса.
//        8. Перегрузить методы takeBook(), returnBook():
//        - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял
//        3 книги".
//        - takeBook, который будет принимать переменное количество названий книг.
//        Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".

//        - takeBook, который будет принимать переменное количество (Тип... parameterName)
//        объектов класса Book (создать новый класс, содержащий имя и автора книги).
//        Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".

import java.util.Arrays;

//        9. Аналогичным образом перегрузить метод returnBook().
//        Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В.
//        вернул 3 книги".
public class Main {
    public static void main (String[] args) {
        Books books1 = new Books("Война и Мир", "Лев Толстой");
        Books books2 = new Books("Философия Java", "Эккель Б");
        Books books3 = new Books("Легкий способ выучить Java", "Пэйн Брайсон");
        Books books4 = new Books("Алгоритмы на Java, 4-е издание", "Роберт Седжвик, Кевин Уэйн");
        Books books5 = new Books("Java. Полное руководство", "Герберт Шилдт");

        Reader student1 = new Reader("Дмитрий", "Петров", "Петрович", 123,
                "Програмирования", "21.10.1989", "988776557\n");
        Reader student2 = new Reader("Василий", "Васичкин", "Пупкин", 66,
                "Истории", "7.05.1999", "34567890\n");
        Reader student3 = new Reader("Николай", "Николаевич", "Саныч", 1980,
                "Програмирования", "19.09.185", "456789899876\n");
        Reader student4 = new Reader("Иван", "Иванов", "Иванович", 4567,
                "Програмирования", "25.01.2000", "456789876\n");

        Reader[] students = new Reader[] {student1, student2, student3, student4};
        Books[] books = new Books[] {books1, books2, books3, books4, books5};


//        System.out.println(Arrays.toString(students));
//        System.out.println(Arrays.toString(books));
        student1.takeBooks(books1, books2);
        student2.takeBooks(books3.getNameBook(), books4.getNameBook());
        student4.takeBooks(books4.getAftorBook());
        student3.takeBooks(books);


        student3.returnBook(books4, books5);
        student4.returnBook(books3, books2);

        student4.takeBooks(19);
        student1.takeBooks(15);
        student3.returnBook(10);

    }
}
