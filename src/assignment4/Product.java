package assignment4;

public class Product {
    public int id;
    public String productName;
    public int qty;
    public int price;

    public Product(){
    }

    public Product(int id, String productName, int qty, int price){
        this.id = id;
        this.productName = productName;
        this.qty = qty;
        this.price = price;
    }

    //- Kiểm tra số lượng: nếu qty > 0 báo còn hàng ngược lại hết hàng
    public void checkQty(){
        if(qty > 0){
            System.out.println("Stocking.");
        } else {
            System.out.println("Out of Stock.");
        }
    }
}

