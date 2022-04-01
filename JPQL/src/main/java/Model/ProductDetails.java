package Model;

//Sayfayı Açtığımızda ilk karşımıza cıkan bilgiler.

public class ProductDetails {

    private String productName;

    private double unitPrice;

    private String brandName;

    private String categoryName;

    private ProductDetails() {

    }

    public ProductDetails(String productName, double unitPrice, String brandName, String categoryName) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.brandName = brandName;
        this.categoryName = categoryName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                "productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", brandName='" + brandName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
