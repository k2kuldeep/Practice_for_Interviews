package dailyByte;

import java.util.LinkedList;
import java.util.Queue;

/*Design a class, MovingAverage, which contains a method, next that is responsible
for returning the moving average from a stream of integers.
Note: a moving average is the average of a subset of data at a given point in time.
Ex: Given the following series of events...
// i.e. the moving average has a capacity of 3.
MovingAverage movingAverage = new MovingAverage(3);
m.next(3) returns 3 because (3 / 1) = 3
m.next(5) returns 4 because (3 + 5) / 2 = 4
m.next(7) = returns 5 because (3 + 5 + 7) / 3 = 5
m.next(6) = returns 6 because (5 + 7 + 6) / 3 = 6
MovingAverage class definition:

public class MovingAverage {
    // TODO: declare any instance variables you require.
 //Initializes a MovingAverage with a
 //capacity of `size`.
public MovingAverage(int size) {
        // TODO: initialize your MovingAverage.
        }
 //Adds `val` to the stream of numbers
 //and returns the current average of the numbers.
public double next(int val) {
        // TODO: implement this method.
        }
        }
*/
public class movingAverage {
    public static void main(String[] args) {
        moveAvg obj = new moveAvg(3);
        System.out.println(obj.next(1));
        System.out.println(obj.next(10));
        System.out.println(obj.next(3));
        System.out.println(obj.next(5));


    }
}
class moveAvg{
    private Queue<Integer> q;
    private int len;
    private double sum;
    moveAvg(int size){
        q = new LinkedList<Integer>();
        len = size;
        sum=0.0;
    }
    public double next(int val){
        if (q.size()==len) {
            sum -= q.remove();
        }
        q.add(val);
        sum += val;
        return sum/q.size();
    }
}
/*Note - stream of integers problems (important)*/