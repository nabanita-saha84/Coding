class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int res=0, num=0, sign=1;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c==' '){
                continue;
            } 
            if(Character.isDigit(c)){
                num = num*10 + (c-'0');
            } else if(c=='-'){
                res = res+num*sign;
                num=0;
                sign = -1;
            } else if(c=='+'){
                res = res+num*sign;
                num=0;
                sign=1;
            } else if(c=='('){
                stack.push(res);
                stack.push(sign);
                res=0;
                num=0;
                sign=1;
            } else {
                num = res+num*sign;
                sign = stack.pop();
                res = stack.pop();
            }
        }
        if(num!=0){
            res = res + num*sign;
        }
        while(!stack.isEmpty()){
            sign=stack.pop();
            num=stack.pop();
            res = res + num*sign;
        }
        return res;
    }
}