class Solution {
    public String convertToBase7(int num) {
        String s = "";
        String neg="";
        if(num==0){
            return "0";
        }
        if(num<0){
            num=-num;
            neg="-";
        }
        while(num!=0){
            int rem = num%7;
            s = rem+s;
            num = num/7;
        }
        return neg+s;
    }
}