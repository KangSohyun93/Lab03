package Aims;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20; 
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED]; 
    private int qtyOrdered = 0; 

    // Phương thức thêm một DVD vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered] = dvd; 
            qtyOrdered++; 
            System.out.println("The disc has been added: " + dvd.getTitle());
        } else {
            System.out.println("The cart is full.");
        }
    }

    // Phương thức thêm nhiều DVD vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
        // Kiểm tra xem có DVD nào không
        if (dvds.length == 0) {
            System.out.println("No discs provided to add.");
            return;
        }

        // Thêm các DVD vào giỏ hàng
        for (DigitalVideoDisc dvd : dvds) {
            if (qtyOrdered < MAX_NUMBER_ORDERED) {
                itemsOrdered[qtyOrdered] = dvd;
                qtyOrdered++;
                System.out.println("The disc has been added: " + dvd.getTitle());
            } else {
                System.out.println("The cart is full. Cannot add more discs.");
                break;
            }
        }
    }

    // Phương thức xóa DVD khỏi giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) { 
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1]; 
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--; 
                System.out.println("The disc has been removed.");
                return; 
            }
        }
        System.out.println("The disc is not found in the cart.");
    }

    // Phương thức tính tổng chi phí giỏ hàng
    public float totalCost() {
        float total = 0; 
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost(); 
        }
        return total; 
    }

    // Phương thức hiển thị giỏ hàng
    public void displayCart() {
        System.out.println("Current cart contains: " + qtyOrdered + " discs.");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println("- " + itemsOrdered[i].getTitle()); 
        }
    }
}


