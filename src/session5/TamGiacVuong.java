package session5;

public class TamGiacVuong extends TamGiac {
    public double canh_huyen;

    public boolean kiemTra(){
        if(super.kiemTra()){
            if(a * a == b * b + c * c){
                canh_huyen = a;
                return true;
            }
            if(b * b == a * a + c * c){
                canh_huyen = b;
                return true;
            }
            if(c * c == b * b + a * a){
                canh_huyen = c;
                return true;
            }
        } return false;
    }
}
