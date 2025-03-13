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
        System.out.println("\n---------------");
            if (quantity >= this.quantity || quantity <= 0) {
                System.out.println("Not enough products to sell (" + quantity + ")");
            }
            else {
                this.quantity -= quantity;
                System.out.println("Sold " + quantity + " " + this.name);
            }
        System.out.println("---------------");
    }

    public void addProduct(int quantity) {
        System.out.println("\n---------------");
        if (quantity <= 0) {
            System.out.println("Not enough products to add (" + quantity + ")");
        }
        else {
            this.quantity += quantity;
            System.out.println("Added " + quantity + " " + this.name);
        }
        System.out.println("---------------");
    }

    public void showInfo() {
        System.out.println("\n---------------");
            System.out.println(this.name + " Information:");
                System.out.println("Name: " + this.name);
                System.out.println("Product Code: " + this.productCode);
                System.out.println("Price: " + this.price);
                System.out.println("Quantity: " + this.quantity);
                System.out.println("Expire Date: " + this.expireDate);
        System.out.println("---------------");
    }

    public void checkExpireDate(String dateDDMMYYYY) {
        System.out.println("\n---------------");
        int currentYear = Integer.parseInt(dateDDMMYYYY.substring(6, 10));
        int currentMonth = Integer.parseInt(dateDDMMYYYY.substring(3, 5));
        int currentDay = Integer.parseInt(dateDDMMYYYY.substring(0, 2));

        int expireYear = Integer.parseInt(this.expireDate.substring(6, 10));
        int expireMonth = Integer.parseInt(this.expireDate.substring(3, 5));
        int expireDay = Integer.parseInt(this.expireDate.substring(0, 2));

        if (expireYear <= currentYear) {
            if (expireYear == currentYear) {
                if (expireMonth <= currentMonth) {
                    if (expireMonth == currentMonth) {
                        if (expireDay >= currentDay) {
                            System.out.println("Product is valid");
                        }
                        else {
                            System.out.println("Product is expired");
                        }
                    }
                    else {
                        System.out.println("Product is expired");
                    }
                }
                else {
                    System.out.println("Product is valid");
                }
            }
            else {
                System.out.println("Product is expired");
            }
        }
        else {
            System.out.println("Product is valid");
        }
        System.out.println("---------------");
    }
}
