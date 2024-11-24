package Aims;

public class Aims {

    public static void main(String[] args) {    
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);

        // Thêm các DVD vào giỏ hàng
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2, dvd3);  // Thêm nhiều DVD

        // Hiển thị tổng chi phí và giỏ hàng
        System.out.println("Total Cost is: " + anOrder.totalCost());
        anOrder.displayCart();

        // Xóa một DVD khỏi giỏ hàng
        anOrder.removeDigitalVideoDisc(dvd3);
        anOrder.displayCart();
    }
}

