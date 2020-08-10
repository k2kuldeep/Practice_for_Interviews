/*Given a rope of length n, you need to find maximum number of pieces you can make
 such that length of every piece is in set {a,b,c} for given values of a,b,c.
 Eg : n=5, a=2,b=5,c=1
  Output: 5 as maximum will be 5 pieces with size 1.
 Eg : n=23, a=12,b=9,c=11
  Output: 2 as one piece of size 12 and other of size 11.
 Eg : n=5, a=4,b=2,c=6
  Output: -1 as it will not be possible.
*/
  
class MaximumCuts{
    public static void main(String[] args) {
        int n = 23;
        int a = 11;
        int b = 9;
        int c = 12 ;
        int res = fun(n,a,b,c);
        System.out.println(res);
    }

    private static int fun(int n, int a, int b, int c) {
        if (n==0)
            return 0;
        if (n<0)
            return -1;

        int res = Math.max(Math.max(fun(n-a,a,b,c),fun(n-b,a,b,c)),
                fun(n-c,a,b,c));
        if (res == -1)
            return -1;
        return (res+1);
    }

}
