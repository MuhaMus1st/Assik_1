
interface Product {
    double getDiscount();
}

class FoodProduct implements Product {
    public double price;

    public FoodProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.1;  // 10% discount for food products
    }
}

class ElectronicsProduct implements Product {
    public double price;

    public ElectronicsProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.05;  // 5% discount for electronics
    }
}

class DiscountCalculator {
    public double calculateDiscount(Product product) {
        return product.getDiscount();
    }
}


class ClothingProduct implements Product {
    public double price;

    public ClothingProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.15;  // 15% discount for clothing products
    }
}


public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        FoodProduct apple = new FoodProduct(100);
        ElectronicsProduct tv = new ElectronicsProduct(1000);
        ClothingProduct shirt = new ClothingProduct(500);

        System.out.println("Food Discount: $" + calculator.calculateDiscount(apple));
        System.out.println("Electronics Discount: $" + calculator.calculateDiscount(tv));
        System.out.println("Clothing Discount: $" + calculator.calculateDiscount(shirt));
    }
}
