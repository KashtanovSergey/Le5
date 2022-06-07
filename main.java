//        1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//        2. Конструктор класса должен заполнять эти поля при создании объекта.
//        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//        4. Создать массив из 5 сотрудников.
//        Пример:
//        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//        persArray[1] = new Person(...);
//        ...
//        persArray[4] = new Person(...);
//
//        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
package Zadanie5;
import java.util.Arrays;
public class main {
    public static void main(String[] args){

        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Сидоров Пётр Максимович", "Генеральный директор", "Sidorov@mailbox.com", "89233412312", 50000, 40); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person("Иванов Максим Петрович", "Бухгалтер", "ivanov@mail.ru", "89514575467", 30000, 35);
        persArray[2] = new Person("Петров Иван Семёнович", "Системный администратор", "Petrov@mail.ru", "89216547890", 45000, 20);
        persArray[3] = new Person("Романов Антон Владимирович", "Зам.ген. директора", "Romanov@mail.ru", "89219873265", 45000, 41);
        persArray[4] = new Person("Морозов Олег Владимирович", "Начальник тех. отдела", "Morozov@bk.ru", "89214563289", 45000, 34);

    for (int i = 0; i >= persArray; i++){
        if (Person.getAge() > 40);

        System.out.println(persArray[i]);
    }
}
//        employee1.FIO;
//        employee1.post;
//    employee1.FIO = "";
//    employee2.FIO = "";
//    employee3.FIO = "";
//
//    employee1.post = "";
//    employee2.post = "";
//    employee3.post = "";
//
//
//        System.out.println(employee1.FIO + " " + employee2.post);
//        System.out.println(employee2.FIO + " " + employee1.post);
//        System.out.println(employee3.FIO + " " + employee3.post);





}