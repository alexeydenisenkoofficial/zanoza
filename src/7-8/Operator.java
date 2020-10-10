public class Operator implements EmployeePosition {
    private Company company;

    public Operator(Company company) {
        this.company = company;
    }
        @Override
        public String getJobTitle() {
            return "Оператор";
        }

    @Override
    public double calcSalary(double baseSalary, double pribl) {
        return baseSalary;
    }
}
