public class Manager implements EmployeePosition {
    private Company company;

    public Manager(Company company){
        this.company = company;
    }

    @Override
    public String getJobTitle() {
        return "Менеджер";
    }

    @Override
    public double calcSalary(double baseSalary, double pribl) {
        return (pribl*0.05+baseSalary);
    }
}
