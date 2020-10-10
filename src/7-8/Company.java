import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Company {

    private List<Employee> list = new ArrayList<>();

    public Company(){

    }

    public List<Employee> getList() {
        return list;
    }

    public void hire(Employee employee){
        list.add(employee);
    }

    public void hireAll(List<Employee> employees){
        list.addAll(employees);
    }

    public void fire(Employee employee){
        list.remove(employee);
    }

    public long getIncome(){
        long dohod = 0;
        for (Employee employee : list) {
            if (employee.position.getJobTitle().equals("Менеджер")) {
                dohod += employee.pribl;
            }
        }
           return dohod;
    }


    public List<Employee> getTopSalaryStaff(int count) {

        List<Employee> nList = new ArrayList<>(list);
        nList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getZp() - o1.getZp();
            }
        });
        return nList.subList(0, count);
    }


    public List<Employee> getLowestSalaryStaff(int count) {
        List<Employee> nList = new ArrayList<>(list);
        nList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getZp() - o2.getZp();
            }
        });
        return nList.subList(0, count);
    }
    
}
