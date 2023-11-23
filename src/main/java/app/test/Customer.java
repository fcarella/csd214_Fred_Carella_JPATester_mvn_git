package app.test;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Customer extends Person {

    @ManyToOne
    private Employee primaryContact;
    @OneToMany
    private Collection<ProductOrder> productOrders;

    public Employee getPrimaryContact() {
        return primaryContact;
    }

    public void setPrimaryContact(Employee primaryContact) {
        this.primaryContact = primaryContact;
    }

    public Collection<ProductOrder> getProductOrders() {
        return productOrders;
    }

    public void setProductOrders(Collection<ProductOrder> productOrders) {
        this.productOrders = productOrders;
    }

}