import users.Customer;
import users.Credentials;
import users.CompanyInformation;
import users.Merchant;
import products.Products;
import products.Cart;
import purchase.Payments;
import purchase.Checkout;
import purchase.Purchase;

public class ECommerce {
    public static void main(String[] args) {
        // Create Credentials for Customer
        Credentials customerCredentials = new Credentials("shiabul", "password");

        // Create CompanyInformation for Customer
        CompanyInformation customerCompanyInformation = new CompanyInformation("DOCTUCH", "TDL54312564215", "TIN123456");

        // Create Customer with CompanyInformation
        Customer customer = new Customer("Shiabul", "Islam", "01724521238", 'M', "1998-01-01", "md.shiabul.cse@gmail.com", customerCredentials, customerCompanyInformation);

        // Create Products
        Products[] products = new Products[2];
        products[0] = new Products("Laptop", "Electronics", "Computers", "2025-12-31", "2023-01-01", 1200.00);
        products[1] = new Products("Phone", "Electronics", "Mobile", "2025-12-31", "2023-01-01", 800.00);

        // Create Cart
        Cart cart = new Cart(2, 2000.00, 2000.00, 2, 2000.00, 2000.00, customer, products);

        // Create Payments
        Payments payments = new Payments("Credit Card", "2000.00");

        // Create Checkout
        Checkout checkout = new Checkout(payments);

        // Create Purchase
        Purchase purchase = new Purchase(cart, checkout);

        // Output Customer and Company Information
        System.out.println("Customer Information:");
        System.out.println("Name: " + customer.getFirstName() + " " + customer.getLastName());
        System.out.println("Contact: " + customer.getPersonalContact());
        System.out.println("Email: " + customer.getEmailAddress());
        System.out.println("Company Name: " + customer.getCompanyInformation().getCompanyName());
        System.out.println("Trade Licence Number: " + customer.getCompanyInformation().getTradeLicenceNumber());
        System.out.println("TIN Number: " + customer.getCompanyInformation().getTinNumber());

        // Output Cart Information
        System.out.println("\nCart Information:");
        System.out.println("Quantity in Cart: " + cart.getQuantity());
        System.out.println("Unit Price in Cart: " + cart.getUnitPrice());
        System.out.println("Gross Price in Cart: " + cart.getGrossPrice());
        System.out.println("Total Number of Products: " + cart.getNumberOfProducts());
        System.out.println("Total Amount: " + cart.getTotalAmount());
        System.out.println("Amount Paid: " + cart.getAmountPaid());
        System.out.println("Customer: " + cart.getCustomer().getFirstName() + " " + cart.getCustomer().getLastName());

        // Output Products in Cart
        System.out.println("\nProducts in Cart:");
        for (Products product : cart.getProducts()) {
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Product Category: " + product.getProductCategory());
            System.out.println("Product Subcategory: " + product.getProductSubCategory());
            System.out.println("Product Price: " + product.getProductPrice());
        }

        // Output Payment Details
        System.out.println("\nTotal Amount Paid: " + payments.getTotalAmount());

        // Output Total Gross Price from Cart
        System.out.println("Total Gross Price: " + cart.calculateTotalGrossPrice());

        // ---------------------------------------------------------------------------------
        // Additional Merchant Information (New Code)
        // ---------------------------------------------------------------------------------

        // Create Credentials for Merchant
        Credentials merchantCredentials = new Credentials("merchantUser", "123456");

        // Create CompanyInformation for Merchant
        CompanyInformation merchantCompanyInformation = new CompanyInformation("Gadget Store", "GSTL123456789", "TIN987654321");

        // Create Merchant with CompanyInformation
        Merchant merchant = new Merchant("Merchant", "Merchant", "0123456789", 'M', "1998-05-15", "merchant@gadgetstore.com", merchantCredentials, merchantCompanyInformation, "M987654");

        // Output Merchant Information
        System.out.println("\nMerchant Information:");
        System.out.println("Merchant ID: " + merchant.getMerchantID());
        System.out.println("Name: " + merchant.getFirstName() + " " + merchant.getLastName());
        System.out.println("Contact: " + merchant.getPersonalContact());
        System.out.println("Email: " + merchant.getEmailAddress());
        System.out.println("Company Name: " + merchant.getCompanyInformation().getCompanyName());
        System.out.println("Trade Licence Number: " + merchant.getCompanyInformation().getTradeLicenceNumber());
        System.out.println("TIN Number: " + merchant.getCompanyInformation().getTinNumber());
    }
}
