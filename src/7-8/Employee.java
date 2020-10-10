public class Employee {
    protected String surname;
    protected String name;
    protected EmployeePosition position;
    protected int zp; //зарплата фиксированнная
    public double pribl; //прибыль для компании с одного менеджера
    protected double dohod; //общий доход компании

    public Employee(String surname, String name, int zp, EmployeePosition position) {
        this.surname = surname;
        this.name = name;
        this.zp = zp;
        this.position = position;
        this.pribl = (Math.random()*35_000+115_000);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }

    public void setZp(int zp) {
        this.zp = zp;
    }

    public int getZp() {
        return zp;
    }

    @Override
    public String toString() {
        return "Фамилия = " + surname + ", имя  = " + name + ", зарплата = " + position.calcSalary(zp, dohod) + ", должность = " + position.getJobTitle();
    }
}
