package lv.jg.lesson5.homework2.employee;

import java.util.Objects;

//Ok
public class Employee {

    private String contractNumber;
    private double salary;
    private Department department;

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(salary, employee.salary) &&
                Objects.equals(contractNumber, employee.contractNumber) &&
                Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contractNumber, salary, department);
    }

    @Override
    public String toString() {
        return "Employee{"
                + "contractNumber='" + contractNumber + '\''
                + ", salary='" + salary + '\''
                + ", department=" + department + '\'' + '}';
    }
}
