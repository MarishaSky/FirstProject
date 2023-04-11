public class Worker_13_1 extends Employee_13_1{

//Необходимо создать класс Worker
// где метод getSalary будет возвращать базовую ставку и
// должен быть финальным.
    public Worker_13_1(String name, int baseSalary) {
    super(name, baseSalary);
}
   public final double getSalary() {
        return getBaseSalary();
    }
}
