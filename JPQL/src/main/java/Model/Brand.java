package Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Brand implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int brandId;

    private String name;

    // Bir markanın birden fazla ürünü olabilir ama bir ürünün birden fazla markası olamaz .
    @OneToMany(mappedBy = "brand")
    private List<Product> products; //Birden fazla ürünün listesini bulundurabilir.

    public Brand() {
    }

    public Brand(String name) {
        this.name = name;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandId=" + brandId +
                ", name='" + name + '\'' +
                '}';
    }
}
