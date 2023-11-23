package app.test;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Employee extends Person {

    @ManyToOne
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}