/*Given an expression string exp , write a program to examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” 
 are correct in exp. For example, the program should print true for exp = “[()]{}{[()()]()}” and false for exp = “[(])”
 */
public class Balanced_Parentheses {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch[] = {'{','(',')','}','[',']'};
		
		DemoStack stack = new DemoStack();
		int count = 0;
		for(int i=0;i<ch.length;i++){
			//for entry
			if(ch[i]=='{'||ch[i]=='('||ch[i]=='[')
				stack.push(ch[i]);
			
			//for exit
			if(ch[i]=='}'||ch[i]==')'||ch[i]==']'){
				if(stack.isEmpty()){
					count = 1;
					System.out.println("Not Balanced");
				}	
				else if(!MatchingPair(stack.pop(),ch[i])){
					count = 1;
					System.out.println("Not Balanced");
				}
						
			}	
		}
		if(count==0 &&  stack.isEmpty())
			System.out.println("balanced");
		else
			System.out.println("Not Balanced");
	}

	private static boolean MatchingPair(char char1, char char2) {
		// TODO Auto-generated method stub
		if (char1 == '(' && char2 == ')') 
	         return true; 
	       else if (char1 == '{' && char2 == '}') 
	         return true; 
	       else if (char1 == '[' && char2 == ']') 
	         return true; 
	       else
	         return false;
	}
}

class DemoStack{
	int MAX_LENGTH = 100;
	int top=-1;
	char arr[] = new char[MAX_LENGTH];
	
	public void push(char d){
		if( top == MAX_LENGTH )
			System.out.println("Stack overflow");
		else{
			top++;
			arr[top] = d;
			System.out.println(d+" pushed");
		}
	}
	public char pop(){
		if(top == -1){
			System.out.println("Stack Underflow");
			return '\0';
		}	
		else{
			char x = arr[top];
			System.out.println(x+" popped");
			top--;
			return x;
		}
	}
	public boolean isEmpty(){
		if(top == -1)
			System.out.println("Stack empty");
		return (top == -1)? true : false;
	}
}