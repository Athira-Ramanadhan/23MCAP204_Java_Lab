class Product {
    int pcode;
    String pname;
    double price;


    Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    public static void main(String[] args) {
        
        Product prod1 = new Product(101, "Laptop", 50000);
        Product prod2 = new Product(102, "Smartphone", 20000);
        Product prod3 = new Product(103, "Tablet", 30000);

        
        Product lowest = prod1;

        if (prod2.price < lowest.price) {
            lowest = prod2;
        }
        if (prod3.price < lowest.price) {
            lowest = prod3;
        }

        
        System.out.println("Product with the lowest price: ");
        System.out.println("Code: " + lowest.pcode);
        System.out.println("Name: " + lowest.pname);
        System.out.println("Price: " + lowest.price);
    }
}
