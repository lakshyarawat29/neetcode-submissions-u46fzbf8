class Solution {
    public boolean isAnagram(String s, String t) {
        int m = t.length();
        int n = s.length();

        if(n!=m){
            return false;
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=(s.charAt(i)-'a');
        }

        for(int i=0;i<m;i++){
            if(!s.contains(String.valueOf(t.charAt(i)))){
                return false;
            };
            sum-=(t.charAt(i)-'a');
        }
        return (sum == 0)?true:false;
    }
}
