package users;

public class Address {
    protected String houseNumber;
    protected String roadNumber;
    protected String blockNumber;
    protected String address;

    protected boolean isItShopAddress;
    protected boolean sameAsBillingAddress;

    public Address() {
        this.isItShopAddress = false;
        this.sameAsBillingAddress = true;
    }


    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setRoadNumber(String roadNumber) {
        this.roadNumber = roadNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setIsItShopAddress(boolean isItShopAddress) {
        this.isItShopAddress = isItShopAddress;
    }

    public void setSameAsBillingAddress(boolean sameAsBillingAddress) {
        this.sameAsBillingAddress = sameAsBillingAddress;
    }
}
