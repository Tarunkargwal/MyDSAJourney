import java.util.ArrayList;
public class fre {
    public static void main(String[] args) {

        ArrayList<String> s = new ArrayList<>();
        s.add("the");
        s.add("quick");
        s.add("brown");
        s.add("fox");
        s.add("quick");
        String word1 = "the";
        String word2 = "quick";
        int d1=-1;
        int d2=-1;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<s.size();i++){
            if(s.get(i).equals(word1)){
                d1=i;
            }
            if(s.get(i).equals(word2)){
                d2=i;
            }
            if(d1!=-1 && d2!=-1){
             ans = Math.min(ans,Math.abs(d1-d2));   
            }
            
        }
        System.out.println(ans);
    }

}
