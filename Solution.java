class Solution {
    public boolean hasSameDigits(String s) {
        String str = "";

        while(s.length() > 2){
            for(int i=0;i<s.length()-1;i++){
                int sum  = (s.charAt(i)-'0' + s.charAt(i+1)-'0') % 10;
                str += sum+"";
            }
            s = str;
            str = "";
        }
        if(s.indexOf(s.charAt(1)) == 0){
            return true;
        }
        return false;
    }
}