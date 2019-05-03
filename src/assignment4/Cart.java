package assignment4;

import assignment4.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    public int id;
    public String customer;
    public int grandTotal;
    public String city;
    public ArrayList<Product> productList;

    public Cart(){
    }

    public Cart(int id, String customer, int grandTotal, String city){
        this.id = id;
        this.customer = customer;
        this.grandTotal = grandTotal;
        this.city = city;
        this.productList = new ArrayList<>();
    }
    //- Thêm 1 sản phẩm vào giỏ hàng
    public void addItem(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ID:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Product Name:");
        String productName = scanner.nextLine();
        System.out.println("Quantity:");
        int qty = scanner.nextInt();
        System.out.println("Price:");
        int price = scanner.nextInt();

        Product product = new Product(id, productName, qty, price);
        productList.add(product);
    }

    public void removeItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ID you want to remove:");
        int id = scanner.nextInt();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).id == id) {
                productList.remove(i);
            }
        }
    }

    public int getGrandTotal(){
        if ( city == "HN" || city == "HCM"){
            grandTotal = grandTotal + (grandTotal/ 100);
        } else {
            grandTotal = grandTotal + (grandTotal * 2 /100);
        }
        return grandTotal;
    }
}
