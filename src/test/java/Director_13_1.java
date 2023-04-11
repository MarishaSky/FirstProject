public final class  Director_13_1 extends Employee_13_1{

//Необходимо создать класс Director с теми же методами,
// что и Manager, но метод getSalary должен возвращать результат по формуле -
// <базовая ставка> * (<количество подчиненных> / 100 * 9).
// Если количество подчиненных 0, то результат как у обычного рабочего.
// Коэффициенты для расчета ЗП у Manager и Director должны быть константами (коэффициенты из формулы расчета ЗП)
// Классы Manager и Director должны быть финальными

    private int numberOfSubordinates;
    public static final int COEFFICIENT = 9;

    public Director_13_1(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary () {
        double salary = getBaseSalary() + (getBaseSalary() * ((double)numberOfSubordinates / 100 * COEFFICIENT));
        return salary;
    }
}
