package Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    private String name;

    private double unitPrice;

    private int available;
    @Temporal(TemporalType.TIME)
    private Date addDate;

    public Product() {
    }

    public Product(String name, double unitPrice, int available, Date addDate) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.available = available;
        this.addDate = addDate;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    @Override
    public String toString() {
        return "Model.Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", available=" + available +
                ", addDate=" + addDate +
                '}';
    }
}
