package org.example.stack;

import java.util.Stack;

public class Quest6 {
    public static void main(String[] args) {
        String[] arr =  {"-8","3","/"};
        System.out.println(evaluate(arr));
    }
    public int evaluate(String[] arr) {
        // code here
        Stack<Integer> st = new Stack <>();
        for(int i=0;i<arr.length;i++){
            if(valid(arr[i])){
                st.push(Integer.parseInt(arr[i]));
            }else{
                if(st.size()>=2){
                    int b = st.peek();
                    st.pop();
                    int a = st.peek();
                    st.pop();
                    if(arr[i].charAt(0)=='*'){
                        st.push(a*b);
                    }else if (arr[i].charAt(0)=='+'){
                        st.push(a+b);
                    }else if (arr[i].charAt(0)=='-'){
                        st.push(a-b);
                    }else if (arr[i].charAt(0)=='/'){
                        st.push(a/b);
                    }
                }}
        }
        return st.peek();

    }
    public static boolean valid(String s){
        if(s.length()==1 && (s.charAt(0)=='*' || s.charAt(0)=='+' || s.charAt(0)=='-' ||s.charAt(0)=='/' )){
            return false;
        }
        return true;
    }
}
