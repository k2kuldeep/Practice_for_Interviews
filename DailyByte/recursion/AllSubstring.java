/*Print all substring using recursion . */
class AllSubstring{
    public static void main(String[] args) {
        String str = "ABC";
        fun(str,"",0);

    }

    private static void fun(String str,String current,int i) {
        if (i==str.length()) {
            System.out.print(current + " ");
            return;
        }

        fun(str,current,i+1);
        fun(str,current+str.charAt(i),i+1);

    }
    
}
/*Note - one recursive call with including the next character and one call with not 
including the next character*/
