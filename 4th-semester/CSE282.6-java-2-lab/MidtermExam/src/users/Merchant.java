package users;

import products.Products;

public class Merchant extends BasicInformation {
    protected Products[] products;

    public Merchant(String firstName, String lastName, String personalContact, char gender, String dateOfBirth, String emailAddress, Credentials credentials, CompanyInformation companyInformation) {
        super(firstName, lastName, personalContact, gender, dateOfBirth, emailAddress);
        this.credentials = credentials;
        // Additional setup for companyInformation if needed
        products = new Products[10];
    }
}
