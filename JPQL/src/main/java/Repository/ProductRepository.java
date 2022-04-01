package Repository;

import Model.Brand;
import Model.Category;
import Model.Product;
import Model.ProductDetails;

import java.util.List;

public interface ProductRepository {

    Product saveProduct(Product product);

    Brand saveBrand(Brand brand);

    Category saveCategory(Category category);

    //Bütün ürünleri veritabanından çekmek için kullanılır .
    List<Product> findProducts();

    // Veritabanından verileri çek mesela 10 la 20 arasındaki verileri çek
    List<Product> findProductsEntities(int firstResult, int maxResult);

    // ID ile ürünü bul .
    Product findProductById(int productId);

    //Ön yüzde çıkacak bilgileri bir araya getitir .
    List<ProductDetails>findProductDetails();

    ProductDetails findProductDetailsById(int productId);

    //Sadece veritabanında bulunan ürünlerin isimlerini getir
    List<String>findProductNames();

    List<Object[]>findProductNameAndPrice();

    // Parametreden büyük olan ürünlerin listesini getir
    List<Product> findGreatPrice(double unitPrice);

    List<Product> findGreatAndLessPrice(double minUnitPrice , double maxUnitPrice);

    List<Product> findBetweenPrice(double minUnitPrice , double maxUnitPrice);

    List<Product> findLikeProductName(String productName);

    List<Product> findCategoryName(String category1 , String category2);

    // Verilen category de ki fiyat değerinden yüksek olanı getir
    List<Product> findAllProduct(int category);

    List<Object[]>findFunctionsPrice();

    List<Object[]>findGroupByCategory();

    List<Object[]> findGroupByHavingCategory(double unitPrice);

    //Ürünleri sırala
    List<Product> findOrderByPrice();

}

