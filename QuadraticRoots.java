import java.util.Scanner;

//Program to format the output. (Asked in amazon test)
public class QuadraticRoots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double root = Math.sqrt((b*b) - (4*a*c));
		
		double xp = (-b + root)/(2*a);
		double xm = (-b - root)/(2*a);
		
		String s1 = String.format("%.3f",xp);
		String s2 = String.format("%.3f",xm);
		
		System.out.println(s1+"\n"+s2);
		//System.out.println(xp+"\n"+xm);
		

	}

}
