public abstract class Employee_13_1 {

    //Задача №1
    // Необходимо создать класс Employee со следующими методами:
    //getBaseSalary - получить базовую ставку
    //setBaseSalary
    //getName - получить имя
    //setName
    //getSalary - получить зарплату (должен быть абстрактный)

    private String name;
    private int baseSalary;

    public Employee_13_1(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    int getBaseSalary() {
        return baseSalary;
    }
    void setBaseSalary (int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double getSalary();

}
