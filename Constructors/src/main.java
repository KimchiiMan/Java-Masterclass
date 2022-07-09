public class main {
    public static void main(String[] args) {
//        BankAccount myAccount = new BankAccount(1, 0d, "John Dow", "johndoe@email.com", "+49123456789");
//        BankAccount mySecondAccount = new BankAccount();
//        System.out.println(mySecondAccount.getCustomerName());
//        mySecondAccount.addToBalance(2000d);
//        mySecondAccount.takeFromBalance(4000d);
//        mySecondAccount.takeFromBalance(300d);
//
//        BankAccount myThirdAccount = new BankAccount("Tim", "tim@email.com", "12345");
//        System.out.println(myThirdAccount.getPhoneNumber() + " name " + myThirdAccount.getCustomerName());

        VipCustomer firstCustomer = new VipCustomer();
        System.out.println(firstCustomer.getName());
        System.out.println(firstCustomer.getCreditLimit());
        System.out.println(firstCustomer.getEmail());

        VipCustomer secondCustomer = new VipCustomer("John White", 4000d);
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());

        VipCustomer thirdCustomer = new VipCustomer("John Black", 10000d, "johnblack@email.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmail());
    }
}
