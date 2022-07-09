public class main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic Hambuger", "Beef", 5d, "White");
        double price = hamburger.itemizeHamburger();
        System.out.println(price);
        hamburger.addHamburgerAddition1("Onions", 1d);
        hamburger.addHamburgerAddition2("Cheese", 1d);
        hamburger.addHamburgerAddition3("Egg", 2d);
        hamburger.addHamburgerAddition4("Extra Beef", 2.5d);
        price = hamburger.itemizeHamburger();
        System.out.println(price);

        HealthyBurger healthyBurger = new HealthyBurger("Veggi Beaf", 6d);
        healthyBurger.addHamburgerAddition1("Onion", 1.22d);
        healthyBurger.addHealthAddition1("Eggs", 1.46d);
        price = healthyBurger.itemizeHamburger();
        System.out.println(price);

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Something", 2.99d);
        price = deluxeBurger.itemizeHamburger();
        System.out.println(price);
    }
}
