package _4_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int size = 1000_000;
        List<Integer> array = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();
        for (int i =0 ;i<size;i++){
            array.add(i);
            linked.add(i);
        }
for (int m =0;m<10;m++){
        long start = System.currentTimeMillis();
       for (int k=0;k<10;k++) {
          //linked.add(size / 2, 22);
           array.add(size / 2, 22);
       }
        long end=System.currentTimeMillis();
        System.err.println(end-start);
    }
        System.out.println(array.size());
    }

}
