public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(56789, 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999, 100.55, customerName, email, phoneNumber);
    }

    public BankAccount(int number, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with parameters called");
        this.accountNumber = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalamce(double balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addToBalance(double deposit) {
        this.balance += deposit;
        System.out.println("Added " + deposit + " to balance. Balance is now " + this.balance);
    }
    public void takeFromBalance(double withdraw) {
        if(this.balance < withdraw) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= withdraw;
            System.out.println("Took " + withdraw + " form balance. Balance is now " + this.balance);
        }
    }

}
