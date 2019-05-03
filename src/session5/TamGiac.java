package session5;

public class TamGiac {
    public double a;
    public double b;
    public double c;

    public TamGiac(){

    }

    public TamGiac(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void tinhChuVi(){
        double p = a + b + c;
        System.out.println("Chu vi: " +p);
    }

    public void tinhDienTich(){
        double p = (a + b + c)/2;
        double s;
        s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Dien tich: " +s);
    }

    public boolean kiemTra() {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            return true;
//            if((a == b) || (b == c) || (c == a)){
//                System.out.println("Day la tam giac deu.");
//            } else if ((a == b) || (b == c) || (c == a)){
//                System.out.println("Day la tam giac can.");
//            } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)){
//                System.out.println("Day la tam giac vuong.");
//            } else if ((a != b) || (b != c) || (c != a) ){
//                System.out.println("Day la tam giac thuong.");
//            } else {
//                System.out.println("Day khong phai la tam giac.");
//            }
        } else {
            return false;
        }
    }
}
