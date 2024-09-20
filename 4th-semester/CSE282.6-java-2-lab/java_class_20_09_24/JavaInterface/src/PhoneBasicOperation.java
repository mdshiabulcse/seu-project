public interface PhoneBasicOperation {
    void sendSms(String toNumber, String message);
    void call(String toNumber);
}