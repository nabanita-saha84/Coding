class Solution {
    public String convertToBase7(int num) {
        if(num==0)  return "0";

        String base7 = "";
        boolean neg=false;
        if(num<0)   neg=true;
        num = Math.abs(num);
        while(num!=0){
            base7 = (num%7) + base7;
            num /= 7;
        }

        return neg?("-"+base7):base7;
        
    }
}