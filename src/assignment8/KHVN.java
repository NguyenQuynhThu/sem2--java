package assignment8;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class KHVN implements HoaDonTienDien {

    public int maKH;
    public String hoten;
    public String doituong;
    public String ngayraHD;
    public int soluong;

    int[] dinhmuc = {1000, 1200, 1500, 2000};

    public ArrayList<KHVN> KHVNList = new ArrayList();

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

    public String getDoituong() {
        return doituong;
    }

    public void setDoituong(String doituong) {
        this.doituong = doituong;
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

    public KHVN(int maKH, String hoten, String doituong, String ngayraHD, int soluong) {
        this.maKH = maKH;
        this.hoten = hoten;
        this.doituong = doituong;
        this.ngayraHD = ngayraHD;
        this.soluong = soluong;
    }

    public KHVN() {

    }

    public int thanhtien() {
        int thanhtien;
        if(soluong <= 50) {
            thanhtien = soluong*dinhmuc[0];
        } else if(soluong <= 100) {
            thanhtien = 50*dinhmuc[0]+(soluong-50)*dinhmuc[1];
        } else if(soluong <= 200){
            thanhtien = 50*dinhmuc[0]+(soluong-50)*dinhmuc[1]+(soluong-100)*dinhmuc[2];
        } else {
            thanhtien = 50*dinhmuc[0]+(soluong-50)*dinhmuc[1]+(soluong-100)*dinhmuc[2]+(soluong - 200)*dinhmuc[3];
        }
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
        System.out.println("Doi tuong: ");
        doituong = scanner.nextLine();
        System.out.println("Ngay ra hoa don: ");
        ngayraHD = scanner.next();
        System.out.println("Luong dien tieu thu: ");
        soluong = scanner.nextInt();
        System.out.println("----------------------------");

        KHVN khvn = new KHVN();
        khvn.setMaKH(maKH);
        khvn.setHoten(hoten);
        khvn.setDoituong(doituong);
        khvn.setNgayraHD(ngayraHD);
        khvn.setSoluong(soluong);
        KHVNList.add(khvn);

    }

    @Override
    public void xuatHD() {

        for(KHVN khvn : KHVNList) {
            System.out.println("Thong tin hoa don cua ban nhu sau:");
            System.out.println("Ma khach hang: " +maKH);
            System.out.println("Ho ten: " +hoten);
            System.out.println("Doi tuong: " +doituong);
            System.out.println("Luong dien tieu thu: " +soluong);
            if (soluong <= 50){
                System.out.println("Luong dien don gia 1000: " +soluong);
            } else if (soluong <=100) {
                System.out.println("Luong dien don gia 1000: " + 50);
                System.out.println("Luong dien don gia 1200: " + (soluong - 50));
            } else if (soluong <=200){
                System.out.println("Luong dien don gia 1000: " + 50);
                System.out.println("Luong dien don gia 1200: " + 50);
                System.out.println("Luong dien don gia 1500: " + (soluong - 100));

            } else {
                System.out.println("Luong dien don gia 1000: " + 50);
                System.out.println("Luong dien don gia 1200: " + 50);
                System.out.println("Luong dien don gia 1500: " + 100);
                System.out.println("Luong dien don gia 2000: " + (soluong - 100));

            }
            System.out.println("Thanh tien: " +thanhtien());
            System.out.println("----------------------------");
        }

    }

    @Override
    public void soluongKH() {

        System.out.println("So luong khach hang Viet Nam la: " + KHVNList.size());
    }

    @Override
    public void trungbinhthanhtien() {

    }

    @Override
    public void xuatHD012019() {
        LocalDate ldxuatHD = LocalDate.parse(ngayraHD);
        for (KHVN khvn: KHVNList) {
            if (ldxuatHD.getYear() == 2019 && ldxuatHD.getMonthValue() == 1){
                xuatHD();
            }
        }

    }
}
