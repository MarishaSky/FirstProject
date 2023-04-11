public final class Manager_13_1 extends Employee_13_1{
    // Необходимо создать класс Manager в который нужно добавить следующие методы:
    //getNumberOfSubordinates - получить количество подчиненных
    //setNumberOfSubordinates
    //  в классе, метод getSalary будет возвращать значение по формуле -
    //  <базовая ставка> * (<количество подчиненных> / 100 * 3).
    //  Если количество подчиненных 0, то результат как у обычного рабочего.

    // Коэффициенты для расчета ЗП у Manager и Director должны быть константами
    // (коэффициенты из формулы расчета ЗП)
    // Классы Manager и Director должны быть финальными

    private int numberOfSubordinates;
    public static final int COEFFICIENT = 3;

    public Manager_13_1(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
    void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
   public double getSalary() {
        double salary = getBaseSalary() + (getBaseSalary() * ((double)numberOfSubordinates / 100 * COEFFICIENT));
        return salary;
    }
}
