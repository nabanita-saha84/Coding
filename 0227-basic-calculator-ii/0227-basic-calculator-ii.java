class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int res = 0, num = 0;
        char sign = '+';

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c==' '){
                if(i!=s.length()-1)
                    continue;
            }
            if('0'<=c && c<='9'){
                num = num*10 + (c-'0');
                if(i!=s.length()-1){
                    continue;
                }
            }
            if(sign=='+'){
                stack.push(num);
            } else if(sign=='-'){
                stack.push(-num);
            } else if(sign=='*'){
                stack.push(stack.pop()*num);
            } else if(sign=='/'){
                stack.push(stack.pop()/num);
            }
            num=0;
            sign=c;
        }
        while(!stack.isEmpty()){
            res = res+stack.pop();
        }
        return res;
    }
}