import java.time.LocalDate;
import java.util.*;

public class Employee {
    protected String surname;
    protected String name;
    protected LocalDate date;
    protected String address;
    protected String number;
    protected int income;
    int randyear= (int)(Math.random()*30+1970);
    int randmonth= (int)(Math.random()*10+1);
    int randday= (int)(Math.random()*27+1);

    public Employee(String surname, String name, String address, String number, int income) {
        this.surname = surname;
        this.name = name;
        this.date = LocalDate.of(randyear, randmonth,randday);
        this.address = address;
        this.number = number;
        this.income = income;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", income=" + income + '}';
    }
}
