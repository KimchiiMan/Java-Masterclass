public class House {
    private String city;
    private String street;

    public House(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public void theAddress() {
        System.out.println("The address is: " + this.city + ", " + this.street);
    }

    public void orderPizza() {
        System.out.println("Pizza has been ordered to " + this.city + ", " + this.street);
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
}
