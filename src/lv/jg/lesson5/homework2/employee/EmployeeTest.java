package lv.jg.lesson5.homework2.employee;

public class EmployeeTest {
    public static void main(String[] args) {

        Company company = new Company();
        Company differentCompany = new Company();
        company.setName("SIA Nirvana");
        company.setRegistrationNumber("1111-2222-3333");

        Department department = new Department();
        Department otherDepartment = new Department();
        department.setName("HR");
        department.setCompany(company);

        Employee employee = new Employee();
        Employee anotherEmployee = new Employee();

        employee.setContractNumber("+321 29123456");
        employee.setSalary(420);
        employee.setDepartment(department);

        if (employee.equals(employee)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (employee.equals(anotherEmployee)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (department.equals(department)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (department.equals(otherDepartment)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (company.equals(company)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (company.equals(differentCompany)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(employee);

    }
}
