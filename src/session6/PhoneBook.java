package session6;

import java.util.*;

public class PhoneBook extends Phone {

    public ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

    //Demo hoat dong cua Nested Class
//    public static void main(String args[]){
//        PhoneNumber phoneNumber = new PhoneNumber("aa","0112");
//
//        PhoneNumber.Telephone telephone = new PhoneNumber("aaa","1213").new Telephone();
//        PhoneNumber.Telephone telephone1 = phoneNumber.new Telephone();
//
//        telephone.call();
//
//        phoneNumber.new Telephone().call();
//
//        //phoneNumber.new Cost().bill(); --> Khong the khoi tao truc tiep voi static class
//        PhoneNumber.Cost cost = new PhoneNumber.Cost();
//        cost.bill();
//
//
//    }

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber pN : PhoneList){
            if (pN.getName().equals(name)){
                if (pN.getPhone().equals(phone)){
                    System.out.println("So dien thoai da ton tai.");
                } else {
                    pN.setPhone(pN.getName() + ":" + phone);
                    //String x = pN.getPhone();
                    //x += ":" + phone;
                    //pN.setPhone(x);
                    System.out.println("Da them vao so cu.");
                }
                return;
            }
        }
        PhoneNumber px = new PhoneNumber(name, phone);
        PhoneList.add(px);
    }

    @Override
    public void removePhone(String name) {
        //remove theo đối tượng
        for (PhoneNumber pN : PhoneList){
            if (pN.getName().equals(name)){
                PhoneList.remove(pN);
                return;
            }
        }
        //remove theo chỉ số
        for (int i=0; i<PhoneList.size();i++){
            if (PhoneList.get(i).getName().equals(name)){
                PhoneList.remove(i);
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (PhoneNumber pN : PhoneList){
            if(pN.getName().equals(name)){
                pN.setPhone(newphone);
                System.out.println("So dien thoai da duoc update.");
            }
        }

    }

    @Override
    public void searchPhone(String name) {
        for(PhoneNumber pN : PhoneList){
            if(pN.getName().equals(name)){
                System.out.println("So dien thoai cua "+pN.getName() + "la: " + pN.getPhone());
            }
        }

    }

    @Override
    public void sort() {
        Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

}
