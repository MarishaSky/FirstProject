public final class Month_13_2_1 {
    //Задача №1
    //
    //Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
    // Создать класс MonthUtils который бы хранил
    // подготовленные месяцы или их массивы для использования (объекты класса Month).
    //Класс Month сделать неизменяемым (immutable).
    //Статические поля с объектами месяцев должны быть финальными
    //Создать статические методы возвращающие кварталы (массивы по 3 месяца соответственно), полугодия и год.

    private String nameMonth;
    private int day;
    private int countWorkDay;

    public Month_13_2_1(String nameMonth, int day, int countWorkDay) {
        this.nameMonth = nameMonth;
        this.day = day;
        this.countWorkDay = countWorkDay;
    }


}
