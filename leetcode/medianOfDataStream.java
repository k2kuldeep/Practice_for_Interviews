package leet_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class medianOfDataStream {
    public static void main(String[] args) {
        MedianOfStream obj = new MedianOfStream();
        obj.addNum(1);
        obj.addNum(2);
        System.out.println(obj.findMedian());//1.5
        obj.addNum(3);
        System.out.println(obj.findMedian());//2.0
    }
}
class MedianOfStream{
    List<Integer> list;
    MedianOfStream(){
        list = new ArrayList<>();
    }
    public void addNum(int num){
        list.add(num);
        Collections.sort(list);
    }
    public double findMedian(){
        int size = list.size();
        if (size%2==0)
            return (list.get(size/2 - 1) + list.get(size/2))/2.0;
        else
            return list.get(size/2)*1.0;
    }
}