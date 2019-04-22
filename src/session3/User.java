package session3;

public class User {
    public int id;
    public String name;
    public String email;
    public String password;

    public User(){
    }
    //hàm khởi tạo: Tên giống class, tự động chạy không cần thực thi, có thể có tham số hoặc không

    public User(int id, String name, String email, String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public static void main(String args[]){
        User u1 = new User();
        User u2 = new User(1, "Le Van A" , "a@gmai.com", "123456");

    }
}


