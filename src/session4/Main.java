package session4;

import session3.User;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        //Khai bao mang co dinh
        int[] arr = new int[10];
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 8;

        //Duyet theo chi so (index) -->
        // Uu diem: Ro rang, gioi han duoc so luong phan tu muon chay.
        // Nhuoc diem: Muon chay het can dem so luong arr.length
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //Duyet theo tung phan tu -->
        //Uu diem: Duyet nhanh ko can quan tam den so luong
        for (int x: arr){
            System.out.println(x);
        }

        //Khai bao mang tu 1 class
        User[] users = new User[4];
        users[0] = new User();
        users[1] = new User();

        users[0].name = "Ha";

        //Khai bao mang da chieu
        int[][] multiArr = new int[2][3];

        //Khai bao ArrayList (nhu khai bao 1 doi tuong)
        ArrayList arrayList = new ArrayList();
        //Ham them 1 doi tuong vao arraylist
        arrayList.add(5);
        arrayList.add("Hello");
        User x = new User();
        arrayList.add(x);

        //Khai bao arraylist voi kieu du lieu cu the
        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Hello");
        strArrayList.add("World");
        strArrayList.add("Hello Java");

        //Dung ham size de lay so luong, ham get de in ra
        for (int i=0;i<strArrayList.size();i++){
            System.out.println(strArrayList.get(i));
        }

        for (String i: strArrayList){
            System.out.println(i);
        }

        ArrayList<User> userArrayList = new ArrayList<>();
        User x1 = new User();
        userArrayList.add(x1);

        ArrayList allArray = new ArrayList();
        allArray.add("Everybody");
        allArray.add(x1);

        for (int i=0;i<allArray.size();i++){
            if(allArray.get(i) instanceof String){
                System.out.println(allArray.get(i));
            } else if(allArray.get(i) instanceof User){
                User abc = (User)allArray.get(i);
                abc.name = "hahaha";
            }
        }

        //ArrayList<int> intArray = new ArrayList<int>(); --> ko viet dc bang kieu du lieu nguyen thuy
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        ArrayList<Float> floatArray = new ArrayList<Float>();

    }
}
