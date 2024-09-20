
package users;

public class Merchant extends MerchantInformation {
    private String merchantID;

    public Merchant(String firstName, String lastName, String personalContact, char gender, String dateOfBirth, String emailAddress, Credentials credentials, CompanyInformation companyInformation, String merchantID) {
        super(firstName, lastName, personalContact, gender, dateOfBirth, emailAddress, credentials, companyInformation);
        this.merchantID = merchantID;
    }

    public String getMerchantID() {
        return merchantID;
    }

}
