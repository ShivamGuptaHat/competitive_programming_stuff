package longest_increasing_subsequence;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }

        int res = longestCommonSubsequence(arr);
        System.out.println(res);
    }

    private static int fix(int[] tailTable, int left, int right, int key){
        int mid = 0;
        while(right - left > 1){
            mid = left + (right - left) / 2;
            if(tailTable[mid] >= key){
                right = mid;
            }else{
                left = mid;
            }
        }
        return right;
    }

    public static int longestCommonSubsequence(int[] a){
        int[] tailTable = new int[a.length];
        Arrays.fill(tailTable, 0);

        int len = 0;
        tailTable[0] = a[0];
        len++;
        for(int i = 1; i < a.length; i++){
            if(a[i] < tailTable[i]){
                tailTable[0] = a[i];
            }else if(a[i] > tailTable[len - 1]){
                tailTable[len++] = a[i];
            }else{
                tailTable[fix(tailTable, -1, len - 1, a[i])] = a[i];
            }
        }
        return len;
    }
}