package advanced_practice.practice04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q06_MountainAray {
    public static <list> void main(String[] args) {
        int[] arr={-999,1,2,5,7,9,22,8,3,1,-100};

        List<Integer> list=new ArrayList<>();

        for (int w:arr){
            list.add(w);
        }
        int max=list.get(0);
        for (int w:list){
            if (w>max){
                max=w;
            }
        }

        List<Integer> list1=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)!=max){
                list1.add(list.get(i));
            } else break;
        }

        System.out.println("list1 = " + list1);

        List<Integer> list2=new ArrayList<>();

        for(int i=0;i<list.size();i++){
            if (i<list.indexOf(max)){
                continue;
            }
            list2.add(list.get(i));
        }
        System.out.println("list2 = " + list2);

        //Yedekleyip sirala
        List<Integer> list1Copy= new ArrayList<>(list1);
        List<Integer> list2Copy= new ArrayList<>(list2);

        Collections.sort(list1Copy);
        Collections.sort(list2Copy);
        Collections.reverse(list2Copy);

        //Kontrol

        if (list1.equals(list1Copy)&&list2.equals(list2Copy)){
            System.out.println("Mountain Array");
        }else System.out.println("Mountain Array degil");

    }
}
