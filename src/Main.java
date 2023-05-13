public class Main {
    public static void main(String[] args) {

        User Filip = new User("Filip","Markowski","filip@gmail.com","111");

        User Jan = new User("mail@gmail.com");

        User Krzysiek = new User("krzychu@interia.pl");

        Krzysiek.getRegister("Krzysiek","Psikuta","222");


        Product product1 = new Product("iPhone", 4299.99,843442,4);
        System.out.println(product1.toString());

        Product product2 = new Product("Audi",97000.99,832120);

        product2.setPrice(98000.99);
        product2.setQuantity(5);


        Category electronics = new Category("Elektornika");
        electronics.addProduct(product1);

        Category cars = new Category("Samochody");
        cars.addProduct(product2);


    }
}