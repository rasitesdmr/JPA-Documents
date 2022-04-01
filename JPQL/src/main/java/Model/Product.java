package Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    private String name;

    private double unitPrice;

    private int available;

    private Date addDate;

    private Date updateDate;
    @ManyToOne
    private Brand brand;
    @ManyToOne
    private Category category;

    public Product() {
    }

    public Product(int productId, String name, double unitPrice, int available, Date addDate, Brand brand, Category category) {
        this.productId = productId;
        this.name = name;
        this.unitPrice = unitPrice;
        this.available = available;
        this.addDate = addDate;
        this.brand = brand;
        this.category = category;
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

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", available=" + available +
                ", addDate=" + addDate +
                ", updateDate=" + updateDate +
                ", brand=" + brand +
                ", category=" + category +
                '}';
    }
}
