package assignment8;

import com.sun.org.apache.bcel.internal.generic.FLOAD;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class KHNN implements HoaDonTienDien {

    public int maKH;
    public String hoten;
    public String quoctich;
    public String ngayraHD;
    public int soluong;

    public int dinhmuc = 2000;

    public ArrayList<KHNN> KHNNList = new ArrayList();

    public KHNN(int maKH, String hoten, String quoctich, String ngayraHD, int soluong) {
        this.maKH = maKH;
        this.hoten = hoten;
        this.quoctich = quoctich;
        this.ngayraHD = ngayraHD;
        this.soluong = soluong;
    }

    public KHNN() {

    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public String getNgayraHD() {
        return ngayraHD;
    }

    public void setNgayraHD(String ngayraHD) {
        this.ngayraHD = ngayraHD;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int thanhtien() {
        int thanhtien = soluong * 2000;
        return thanhtien;
    }

    @Override
    public void nhapKH() {

        System.out.println("Vui long nhap thong tin khach hang.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ma khach hang: ");
        maKH = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ho ten: ");
        hoten = scanner.nextLine();
        System.out.println("Quoc tich: ");
        quoctich = scanner.nextLine();
        System.out.println("Ngay ra hoa don: ");
        ngayraHD = scanner.next();
        System.out.println("Luong dien tieu thu: ");
        soluong = scanner.nextInt();
        System.out.println("----------------------------");

        KHNN khnn = new KHNN();
        khnn.setMaKH(maKH);
        khnn.setHoten(hoten);
        khnn.setQuoctich(quoctich);
        khnn.setNgayraHD(ngayraHD);
        khnn.setSoluong(soluong);
        KHNNList.add(khnn);


    }

    @Override
    public void xuatHD() {
        for(KHNN khnn : KHNNList) {
            System.out.println("Thong tin hoa don cua ban nhu sau:");
            System.out.println("Ma khach hang: " +maKH);
            System.out.println("Ho ten: " +hoten);
            System.out.println("Quoc tich: " +quoctich);
            System.out.println("Luong dien tieu thu: " +soluong);
            System.out.println("Thanh tien: " +thanhtien());
            System.out.println("----------------------------");
        }

    }

    @Override
    public void soluongKH() {

        System.out.println("So luong khach hang Viet Nam la: " + KHNNList.size());
    }

    @Override
    public void trungbinhthanhtien() {
        float tongcong;
        float tbtt;
        for (KHNN khnn : KHNNList){
            tbtt = (tongcong =+ thanhtien())/KHNNList.size();
        }

    }

    @Override
    public void xuatHD012019() {

        LocalDate ldxuatHD = LocalDate.parse(ngayraHD);
        for (KHNN khnn: KHNNList) {
            if (ldxuatHD.getYear() == 2019 && ldxuatHD.getMonthValue() == 1){
                xuatHD();
            }
        }

    }
}
