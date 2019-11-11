package lv.jg.lesson5.homework2.employee;

import java.util.Objects;

//Ok
public class Company {
    private String name;
    private String registrationNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) &&
                Objects.equals(registrationNumber, company.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, registrationNumber);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\''
                + ", registrationNumber='" + registrationNumber + '\'' + '}';
    }
}
