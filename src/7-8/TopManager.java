public class TopManager implements EmployeePosition {
    private Company company;

    public TopManager(Company company) {
        this.company = company;
    }

    @Override
    public String getJobTitle() {
        return "ТопМенеджер";
    }

    @Override
    public double calcSalary(double baseSalary, double pribl) {
        if(company.getIncome() <= 10_000_000)
            return baseSalary;
        else
            return baseSalary*2.5;
    }
}
