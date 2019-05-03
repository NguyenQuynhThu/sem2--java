package session5;

public class TamGiacCan extends TamGiac {
    public double canh_bang_nhau;
    public double canh_con_lai;

    public boolean kiemTra(){
        if(super.kiemTra()){
            if(a == b) {
                canh_bang_nhau = a;
                canh_con_lai = c;
                return true;
            }
            if(a == c) {
                canh_bang_nhau = a;
                canh_con_lai = b;
                return true;
            }
            if (b == c) {
                canh_bang_nhau = b;
                canh_con_lai = a;
                return true;
            }
        }
        return false;
    }
}
