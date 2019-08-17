/*cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. 
 For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
 Given this implementation of cons:
	def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair
Implement car and cdr.
 */
public class DailyCodingProblem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(car(cons(3, 4)));
		System.out.println(cdr(cons(3, 4)));

	}
	
	public static String cons(int a,int b){
		return a+""+b;
	}
	
	public static int car(String a){
		return Integer.parseInt(a.charAt(0)+"");
	}
	
	public static int cdr(String a){
		return Integer.parseInt(a.charAt(a.length()-1)+"");
	}
}
