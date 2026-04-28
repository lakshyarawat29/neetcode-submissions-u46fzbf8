class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n!=m){
            return false;
        }
        int[] arr1 = new int[26];
        for(int i=0;i<n;i++){
            arr1[s.charAt(i)-'a']++;
        }

        for(int i=0;i<m;i++){
            arr1[t.charAt(i)-'a']--;
        }

        for(int i:arr1){
            if(i!=0){
                return false;
            }
        }

        return true;
    }
}
