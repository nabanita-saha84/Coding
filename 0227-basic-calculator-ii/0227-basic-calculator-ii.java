class Solution {
    public int calculate(String s) {
        Deque<Integer> numbers = new ArrayDeque<>();
        s = s.replaceAll(" ", "");
        int result=0;
        int sign=1;
        int len = s.length();
        for(int i=0; i<len; i++){
            int curr_num=0;
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int[] res = calculateNumber(s, i);
                curr_num = res[0];
                i=res[1];

                numbers.push(curr_num*sign);
            } else if( c == '+'){
                sign = 1;
            } else if( c == '-'){
                sign = -1;
            } else if( c == '*'){
                int[] res = calculateNumber(s, i+1);
                curr_num = res[0];
                i=res[1];
                numbers.push(numbers.pop() * curr_num);
            } else if ( c == '/'){
                int[] res = calculateNumber(s, i+1);
                curr_num = res[0];
                i=res[1];
                numbers.push(numbers.pop() / curr_num);
            }
        }

        while(!numbers.isEmpty()){
            result+=numbers.pop();
        }
        return result;
    }

    int[] calculateNumber(String s, int initial_index){
        int index = initial_index;
        int num=0;
        while(index<s.length() && Character.isDigit(s.charAt(index))){
            num = num*10  +    s.charAt(index)-'0';
            index++;
        }
        return new int[]{num, index-1};
    }

}