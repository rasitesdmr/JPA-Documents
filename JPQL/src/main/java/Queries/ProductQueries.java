package Queries;

public class ProductQueries {

    /*
          SELECT * FROM Product
          SELECT p FROM Product p

          SELECT * FROM Product WHERE productId = 2
          SELECT p FROM Product p WHERE p.productId = :x;
     */

    public static final String findProducts = "SELECT p FROM Product p";

    public static final String findProductById = "SELECT p FROM Product p WHERE p.productId = :productId";

    public static final String findProductDetails = "SELECT new model.ProductDetails(p.name , p.unitPrice ,b.name ,c.name)"
            + "FROM Product p LEFT JOIN p.brand b  LEFT p.category c ";

    public static final String findProductDetailById = "SELECT new model.ProductDetails(p.name , p.unitPrice ,b.name ,c.name)"
            + "FROM Product p LEFT JOIN p.brand b  LEFT p.category c WHERE p.productId = :productId";

    public static final String findProductNames = "SELECT p.name FROM Product p";

    public static final String findProductNamePrice = "SELECT p.name ,p.unitPrice FROM Product p";

    public static final String findGreatPrice = "SELECT p FROM Product p WHERE p.unitPrice > :unitPrice";

    public static final String findGreatLessPrice = "SELECT p FROM Product p WHERE p.unitPrice > :minUnitPrice AND " +
            "p.unitPrice < : maxUnitPrice";

    // Kısa yolu

    public static final String findBetweenPrice = "SELECT p FROM Product p WHERE p.unitPrice BETWEEN :minUnitPrice AND :maxUnitPrice";

    public static final String findLikeProductName = "SELECT p FROM Product p WHERE p.name LIKE :productName";

    public static final String findInCategoryName = "SELECT p FROM Product p LEFT JOIN p.category c WHERE c.name " +
            "IN(:categoryName1 , :categoryName2)";

    public static final String findAllProduct = "SELECT p FROM Product p WHERE p.unitPrice > ALL(SELECT p2.unitPrice FROM Product p2 " +
            "WHERE p2.category.categoryId = :categoryId)";

    public static final String findFunctionsPrice = "SELECT AVG(p.unitPrice),SUM(p.unitPrice),MAX(p.unitPrice) " +
            "MIN(p.unitPrice),COUNT(p) FROM Product p";

    public static final String  findGroupByCategory = "SELECT p.category.categoryName , AVG(p.unitPrice)" +
            " FROM Product p GROUP BY p.category.categoryName";

    public static final String  findGroupByHavingCategory = "SELECT p.category.categoryName , AVG(p.unitPrice) " +
            "FROM Product p GROUP BY p.category.categoryName HAVING AVG(p.unitPrice) > :unitPrice";

    public static final String findOrderByPrice = "SELECT p FORM Product p ORDER BY p.unitPrice DESC";

}
