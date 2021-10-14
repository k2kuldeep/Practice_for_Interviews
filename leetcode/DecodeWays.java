//Problem Link:- https://leetcode.com/problems/decode-ways

class DecodeWays {

	public static void main(String[] args) {
		String inp = "11106"
		int result = numDecodings(inp);
		System.out.println(result);
	}

    private static int numDecodings(String s) {
        int n=s.length();
        int[] dp=new int[n+1];
        dp[n]=1;
        if(s.charAt(n-1)!='0'){
            dp[n-1]=1;
        }
        for(int i=n-2;i>=0;i--){
            dp[i]=0;
            if(s.charAt(i)!='0'){    
                dp[i]+=dp[i+1];
            }
            if(s.charAt(i)=='1'){
                dp[i]+=dp[i+2];
            }
            if(s.charAt(i)=='2'){
                if(s.charAt(i+1)<='6'){
                    dp[i]+=dp[i+2];
                }
            }
        }
        return dp[0];
    }
}