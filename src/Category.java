import java.util.ArrayList;
import java.util.List;

class Category {
    private String name;
    private List<Product> products;

    public Category(String name){
        this.name = name;
        this.products = new ArrayList<Product>();
    }

    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    //Methods

    //Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //List
    public List<Product> getProducts() {
        return this.products;
    }

    //Add product
    public void addProduct(Product product) {
        this.products.add(product);
    }

    //Remove product
    public void removeProduct(Product product){
        this.products.remove(product);
    }
}