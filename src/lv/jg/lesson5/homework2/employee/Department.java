package lv.jg.lesson5.homework2.employee;

import java.util.Objects;

public class Department {
    private String name;
    private Company company;

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(company, that.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\''
                + ", company=" + company + '\'' + '}';
    }
}
