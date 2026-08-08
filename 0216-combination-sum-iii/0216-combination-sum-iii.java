class Solution {
    
    private void solve(List<List<Integer>> ans,List<Integer> curr, int sum, int next_start,int k) {
        if(sum==0 && curr.size()==k) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(sum<0 || curr.size()==k) {
            return;
        }

        for(int i=next_start;i<=9;i++) {
            if(i<=sum) {
                curr.add(i);
                solve(ans,curr,sum-i,i+1,k);
                curr.remove(curr.size()-1);
            } else {
                break;
            }
        }
    }
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans,new ArrayList<>(),n,1,k);
        return ans;
    }
}