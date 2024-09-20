package products;

public class ProductInformation {
    private String productName;
    private String productCategory;
    private String productSubCategory;
    private String expireDate;
    private String purchaseDate;
    private double productPrice;

    public ProductInformation(String productName, String productCategory, String productSubCategory, String expireDate, String purchaseDate, double productPrice) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productSubCategory = productSubCategory;
        this.expireDate = expireDate;
        this.purchaseDate = purchaseDate;
        this.productPrice = productPrice;
    }

    // Getter methods
    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductSubCategory() {
        return productSubCategory;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
