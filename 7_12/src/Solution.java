import java.util.*;
public class Solution {

    public void merge(int A[], int m, int B[], int n) {
        int i=0;
        int j=0;
        int[] c=new int[m+n];
        int k=0;
        while(i < m && j < n) {
            if(A[i] < B[j]) {
                c[k++]=A[i++];
            } else {
                c[k++]=B[j++];
            }
        }
        if(i == m) {
            while(j < n) {
                c[k++] = B[j++];
            }
        }
        if(j == n) {
            while( i <m) {
                c[k++] =A[i++];
            }
        }
        for (int l = 0; l < m+n; l++) {
            A[l]=c[l];
        }
    }

    public static void main(String[] args) {
        int[] A={4,5,6};
        int[] B={1,2,3};
        Solution solution =new Solution();
        solution.merge(A,3,B,3);
        System.out.println(Arrays.toString(A));
    }
}