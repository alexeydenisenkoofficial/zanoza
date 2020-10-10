import java.util.*;


public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        EmployeePosition ТопМенеджер = new TopManager(company);
        EmployeePosition Оператор = new Operator(company);
        EmployeePosition Менеджер = new Manager(company);

        ArrayList<Employee> List = new ArrayList<>();
        for (int i = 0; i < 180; i++) {
            List.add(new Employee("Иванов ", "Оператор " + (i + 1) +"-ый", 15_000+i*110, Оператор));
        }

        for (int i = 0; i < 80; i++) {
            List.add(new Employee("Пупкин ", "Менеджер " + (i + 1) +"-ый", 50_000+i*220, Менеджер));
        }

        for (int i = 0; i < 10; i++) {
            List.add(new Employee("Распутин ", "ТопМенеджер " + (i + 1) + "-ый", 80_000+i*330, ТопМенеджер));
        }

        company.hireAll(List);
        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.println("10 самых высокооплачиваемых сотрудников:");
        List<Employee> list = new ArrayList<>(company.getTopSalaryStaff(10)) ;
        for (int i = 0; i<list.size();i++)
            System.out.println(i+1+": " + list.get(i));
        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.println("30 самых низких зарплат:");
        list = company.getLowestSalaryStaff(30);
        for (int i = 0; i<list.size();i++)
            System.out.println(i+1+": " + list.get(i));

        Random r = new Random();
        int sizeafter=company.getList().size()/2;
        for (int i = 0; i < sizeafter; i++) {
            int index;
            if (sizeafter != 1)
                index = r.nextInt(sizeafter - 1);
            else
                index = 0;
            company.fire(company.getList().get(index));
        }

        System.out.println("После увольнения 50% штата");
        System.out.println("10 самых высокооплачиваемых сотрудников:");
        list = new ArrayList<>(company.getTopSalaryStaff(11)) ;
        for (int i = 0; i<list.size();i++)
            System.out.println(i+1+": " + list.get(i));
        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.println("30 самых низких зарплат:");
        list = company.getLowestSalaryStaff(30);
        for (int i = 0; i<list.size();i++)
            System.out.println(i+1+": " + list.get(i));
    }
}
