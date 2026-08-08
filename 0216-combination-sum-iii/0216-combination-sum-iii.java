class Solution {
    private void solve(List<List<Integer>> ans, List<Integer> curr, int sum,int left, int currNum) {
        if(currNum>10) {
            return;
        }
        if(currNum==10) {
            if(sum==0 && left==0) {
                ans.add(new ArrayList<>(curr));
                return;
            }
        }
        //pick
        curr.add(currNum);
        solve(ans,curr,sum-currNum,left-1,currNum+1);
        curr.remove(curr.size()-1);

        //not_pick
        solve(ans,curr,sum,left,currNum+1);
    }
 
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans,new ArrayList<>(),n,k,1);
        return ans;
    }
}