class Product {
    private String name;
    private double price;
    private int code;
    private int quantity;



    public Product(String name, double price, int code){
        this.name = name;
        this.price = price;
        this.code = code;
        this.quantity = 0;
    }

    public Product(String name, double price, int code, int quantity) {
        this.name = name;
        this.price = price;
        this.code = code;
        this.quantity = quantity;
    }
    //Methods

    //Name
    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name==null || name ==""){
            throw new IllegalArgumentException("Name is incorrect");
        }
        this.name = name;
    }

    //Price
    public double getPrice(){
        return price;
    }

    //Change Price
    public void setPrice(double newPrice){
        if(price == Double.NaN){
            throw new IllegalArgumentException("Price is incorrect");
        }
        this.price = newPrice;
    }

    //Code
    public int getCode(){
        return code;
    }


    //Quantity
    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int newQuantity) {
        if (newQuantity >= 0) {
            this.quantity = newQuantity;
        }
    }

    public String toString() {
        return "Name: " + this.name + "\nPrice: " + this.price + "\nCode: " + this.code + "\nQuantity: " + this.quantity;
    }

}
