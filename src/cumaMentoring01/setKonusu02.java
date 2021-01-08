package cumaMentoring01;

import java.util.HashSet;

public class setKonusu02 {
    public static void main(String[] args) {
        /*main method altinda bos bir hashset olusturunuz.
    parametresi Integer set ve integer array ve adi elementEkle
    olan bir method yaziniz (return tipi olmayacak)
    yine set icindekileri yazdiracak ayrica bir metod daha yaziniz.*/

        HashSet<Integer> set = new HashSet<>();

//        int[] arr = {10, 27, 3, 40, 57, 6, 7, 8, 9, 10};
//
//        elementEkle(set,arr);

        elementEkle(set, new int[]{10, 27, 3, 40, 57, 6, 7, 8, 9, 10});
        print(set);

    }

    public static void elementEkle(HashSet<Integer> set, int[] elements) {

        for (int element : elements) {

            set.add(element);

        }

    }

    public static void print(HashSet<Integer> set) {
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}