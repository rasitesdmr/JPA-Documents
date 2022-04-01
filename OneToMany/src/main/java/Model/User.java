package Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String firstName;

    private String lastName;

    @Temporal(TemporalType.TIMESTAMP)
    private Date birthOfDate;

    //Kullanıcının ekleyip satacağı ürünü başkası satamaz .
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "user_product" , joinColumns = @JoinColumn(name = "userId") ,
               inverseJoinColumns = @JoinColumn(name = "productId"))
    private List<Product> products;

    public User() {
    }

    public User(String firstName, String lastName, Date birthOfDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfDate = birthOfDate;

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(Date birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthOfDate=" + birthOfDate +
                ", products=" + products +
                '}';
    }
}

