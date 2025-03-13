public class Product {
    String name;
    int productCode;
    double price;
    int quantity;
    String expireDate;

    public Product (String name, int productCode, double price, int quantity, String expireDate) {
        this.name = name;
        this.productCode = productCode;
        this.price = price;
        this.quantity = quantity;
        this.expireDate = expireDate;
    }

    public void sellProduct(int quantity) {
        System.out.println("---------------");
            if (quantity >= this.quantity) {
                System.out.println("Not enough products to sell");
            }
            else {
                this.quantity -= quantity;
                System.out.println("Sold " + quantity + " " + this.name);
            }
        System.out.println("---------------");
    }

    public void addProduct(int quantity) {
        this.quantity += quantity;
        System.out.println("---------------");
            System.out.println("Added " + quantity + " " + this.name);
        System.out.println("---------------");
    }

    public void showInfo() {
        System.out.println("---------------");
            System.out.println(this.name + " Information:");
                System.out.println("Name: " + this.name);
                System.out.println("Product Code: " + this.productCode);
                System.out.println("Price: " + this.price);
                System.out.println("Quantity: " + this.quantity);
                System.out.println("Expire Date: " + this.expireDate);
        System.out.println("---------------");
    }
    public void checkExpireDate(String dateDDMMYYYY) {
        System.out.println("---------------");
        //2025
        // && dateDDMMYYYY.charAt(8) >= this.expireDate.charAt(8) && dateDDMMYYYY.charAt(7) >= this.expireDate.charAt(7) && dateDDMMYYYY.charAt(6) >= this.expireDate.charAt(6)
        if(dateDDMMYYYY.charAt(9) >= this.expireDate.charAt(9)) {
            if(dateDDMMYYYY.charAt(8) >= this.expireDate.charAt(8)) {
                if(dateDDMMYYYY.charAt(7) >= this.expireDate.charAt(7)) {
                    if(dateDDMMYYYY.charAt(6) >= this.expireDate.charAt(6)) {

                    }
                }
            }

        }
        else {

        }


        //if (dateDDMMYYYY.compareTo(this.expireDate) < 0) {
        //    System.out.println("Product is not expired");
        //} else {
        //    System.out.println("Product is expired");
        //}
        System.out.println("---------------");
    }
}
