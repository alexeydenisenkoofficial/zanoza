public class Selector implements EmployeeSelector {
        private  int income1;
        private  int income2;

        public Selector(int income1, int income2) {
            this.income1 = income1;
            this.income2 = income2;
        }


        @Override
        public boolean simple(Employee employee) {
            return employee.getIncome()>income1&&employee.getIncome()<income2&&employee.getAddress()=="Moscow";
        }
    }
