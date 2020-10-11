import java.util.ArrayList;

    public class Company {

        private ArrayList<Employee> list;

        public Company() {
            list = new ArrayList<>();
        }

        public ArrayList<Employee> getList() {
            return list;
        }

        public void hire(Employee employee){
            list.add(employee);
        }

        public void hireAll(ArrayList<Employee> employees){
            list.addAll(employees);
        }

        public void fire(Employee employee){
            list.remove(employee);
        }

        public void Handle_Employs(EmployeeSelector selector,HandleEmp handler) {
            int counter = 0;
            for (Employee employee: list){
                if(selector.simple(employee)){
                    handler.HandleEmployees(employee,counter);
                    counter++;
                }
            }
            System.out.println("Количество:" +counter);
        }

        @Override
        public String toString() {
            return "Company{" +
                    "list=" + list +
                    '}';
        }
    }
