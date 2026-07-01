class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();

        int p=0;
        int q=1;

        int n = s.length();
        if(n==0){
            return 0;
        }
        int ans = 1;
        st.add(s.charAt(p));

        while(p<n && q<n && p<q){
            while(p<n && q<n && p<q && !st.contains(s.charAt(q))){
                st.add(s.charAt(q));
                q++;
            }

            ans = Integer.max(ans,q-p);
            if(q==n)break;

            while(p<n && q<n && p<q && st.contains(s.charAt(q))){
                st.remove(s.charAt(p));
                p++;
            }
            if(p==q){
                st.add(s.charAt(q));
                q++;
            }
        }

        return ans;
    }
}