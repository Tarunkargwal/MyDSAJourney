package org.example.stack;

import java.util.Stack;

public class Quest2 {
    public static void main(String[] args) {
        int[] arr = {15, 11, 20, 10, 25};
        int[] ans = leftSmaller(arr);
        for(int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] leftSmaller(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        for(int i =0;i<n;i++){
            if(st.isEmpty()){
                ans[i]=-1;
                st.push(arr[i]);
            }else{
                while(!st.isEmpty() && st.peek()>arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[i]=-1;
                    st.push(arr[i]);
                }else{
                    ans[i]=st.peek();
                    st.push(arr[i]);
                }
            }
        }
        return ans;
    }
}
