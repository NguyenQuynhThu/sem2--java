package session6;

public class PhoneNumber {
    String name;
    String phone;

    public PhoneNumber(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
//      Khai bao nested class
//    public class Telephone {
//        public void call(){
//            System.out.println("Calling.");
//        }
//    }
//
//    public static class Cost {
//        public void bill(){
//            System.out.println("Billing");
//        }
//    }
}
