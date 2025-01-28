//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> list = new ArrayList<>();
        long fact = 1;
        long high = (long)Math.sqrt(n)+1;
        for(long i=1; i<=high; i++){
            if((fact*i)<=n){
                fact*=i;
                list.add(fact);
            }
            else
                break;
        }
        return list;
    }
}