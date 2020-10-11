public class Main {
    public static void main(String[] args) {

        Company company = new Company();

        Employee employee1 = new Employee("Иванов", "Илья","Rostov", "89205476878", 60_000);
        Employee employee2 = new Employee("Петров", "Матвей","Moscow", "89995476872", 120_000);
        Employee employee3 = new Employee("Сидоров", "Владимир","Moscow", "89816471786", 115_000);
        Employee employee4 = new Employee("Митин", "Владимир","Moscow", "89565475311", 120_000);
        Employee employee5 = new Employee("Фёдоров", "Владимир","Novosibirsk", "89505466311", 180_000);
        Employee employee6 = new Employee("Беглов", "Степан","Novosibirsk", "89605466311", 380_000);

        company.hire(employee1);//наняли 4 сотудников в компанию
        company.hire(employee2);
        company.hire(employee3);
        company.hire(employee4);
        company.hire(employee5);
        company.hire(employee6);
        company.fire(employee4); //уволили одного сотрудника
        System.out.println(company.toString());//выведем список наших сотрудников

        System.out.println();
        System.out.println("Сотрудники из Новосибирска:");
        String city = "Novosibirsk"; //выедем всех сотрудников из Новосибирска
        company.Handle_Employs(new EmployeeSelector() {
                                   @Override
                                   public boolean simple(Employee employee) {
                                       return employee.getAddress() == city;
                                   }

                               },
                new HandleEmp() {
                    @Override
                    public void HandleEmployees(Employee employee, int counter) {
                        System.out.println(employee);
                    }
                }
        );

        System.out.println();
        System.out.println("Сотрудники с зп от 70к до 230к (Moscow):");
        company.Handle_Employs(new Selector(70_000,230_000),
                ((employee, count) -> System.out.println(employee))); //выедем всех сотрудников с зп от 70_000 до 230_000 из Москвы

}
}
