public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Default name", 100d, "test@email.com");
        System.out.println("Empty Constructor");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "test@email.com");
        System.out.println("Constructor with one default");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        System.out.println("Full constructor");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmail() {
        return email;
    }
}
