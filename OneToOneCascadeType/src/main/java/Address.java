import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;

    private String street;

    private String city;

    private int postCode;

    /*
     * @OneToOne
     *private Address address;
     */


    @OneToOne(mappedBy = "address") //İlişkinin sahibi customer oluyor ve adres tablosunda customerId bulunmuyor
    private Customer customer;

    public Address() {
    }

    public Address(String street, String city, int postCode) {
        this.street = street;
        this.city = city;
        this.postCode = postCode;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postCode=" + postCode +
                '}';
    }
}
