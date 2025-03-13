import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Mleko", 1, 10.0, 20, "25-03-2025");
        Product p2 = new Product("Masło", 2, 2.5, 100, "15-05-2025");
        Product p3 = new Product("Kasza", 3, 1.5, 50, "01-01-2023");
        Product p4 = new Product("Woda", 4, 1.0, 1000, "31-12-2025");

        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        String date = ft.format(new Date());

        p1.showInfo();
        p1.addProduct(-7);
        p1.sellProduct(3);
        p1.checkExpireDate(date);
        p1.showInfo();

        p2.showInfo();
        p2.addProduct(5);
        p2.sellProduct(-20);
        p2.checkExpireDate(date);
        p2.showInfo();

        p3.showInfo();
        p3.addProduct(5);
        p3.sellProduct(300);
        p3.checkExpireDate(date);
        p3.showInfo();

        p4.showInfo();
        p4.addProduct(5);
        p4.sellProduct(34);
        p4.checkExpireDate(date);
        p4.showInfo();

    }
}