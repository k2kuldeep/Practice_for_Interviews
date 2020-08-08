package dailyByte;

import java.util.LinkedList;
import java.util.Queue;

/*Create a class CallCounter that tracks the number of calls a client has made within the last 3
seconds. Your class should contain one method, ping(int t) that receives the current timestamp
(in milliseconds) of a new call being made and returns the number of calls made within the last 3 seconds.
Note: you may assume that the time associated with each subsequent call to ping is strictly increasing.
Ex: Given the following calls to ping…
ping(1), return 1 (1 call within the last 3 seconds)
ping(300), return 2 (2 calls within the last 3 seconds)
ping(3000), return 3 (3 calls within the last 3 seconds)
ping(3002), return 3 (3 calls within the last 3 seconds)
ping(7000), return 1 (1 call within the last 3 seconds)
*/
public class callCounter {
    public static void main(String[] args) {
        RecentCounter obj = new RecentCounter();
        int call_at_time = obj.ping(1);System.out.println(call_at_time);
        call_at_time = obj.ping(300);System.out.println(call_at_time);
        call_at_time = obj.ping(3000);System.out.println(call_at_time);
        call_at_time = obj.ping(3002);System.out.println(call_at_time);
        call_at_time = obj.ping(7000);System.out.println(call_at_time);
        call_at_time = obj.ping(8000);System.out.println(call_at_time);
    }
}
class RecentCounter{
    Queue<Integer> q;
    RecentCounter(){
        q = new LinkedList<>();
    }
    public int ping(int t){
        q.add(t);
        while(q.peek() < t-3000)
            q.poll();

        return q.size();
    }
}
/*the function ping gets time when a call is made and we need to store all the cll records and
* remove the one which are more than 3 sec previous. */