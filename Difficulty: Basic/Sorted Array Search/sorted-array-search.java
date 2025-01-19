//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class gfg {

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String inputLine[] = read.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int k = Integer.parseInt(read.readLine());

            Solution obj = new Solution();

            System.out.println(obj.searchInSorted(arr, k));
        }
    }
}
// } Driver Code Ends


class Solution {
    static boolean searchInSorted(int arr[], int k) {
        return search(arr, 0, arr.length-1, k);
    }
    
    public static boolean search(int[] arr, int low, int high, int k){
        // System.out.println("Low : "+low);
        // System.out.println("High : "+high);
        if(low<=high){
            int mid = (high+low)/2;
            // System.out.println("Mid : "+arr[mid]);
            if(arr[mid]==k){
                return true;
            } else if(arr[mid]>k){
                return search(arr, 0, mid-1, k);
            } else {
                return search(arr, mid+1, high, k);
            }
        }
        
        
        return false;
    }
}