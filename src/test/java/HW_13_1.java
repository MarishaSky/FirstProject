public class HW_13_1 {
    public static void main(String[] args) {
        Employee_13_1 employee = new Employee_13_1("Mark", 1000) {
            @Override
            public double getSalary() {
                return 0;
            }
        };

            Worker_13_1 worker = new Worker_13_1("Karl", 1000);

            Manager_13_1 manager = new Manager_13_1("Anna", 1000, 5);

            Director_13_1 director = new Director_13_1("John", 1000,10);

        System.out.println("ЗП Работника: " + worker.getSalary());
        System.out.println("ЗП Менеджера: " + manager.getSalary());
        System.out.println("ЗП Директора: " + director.getSalary());
        }


    }

