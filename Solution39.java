/*
Time complexity:O(2^N)
Checking if the candidates is null then res
calling helper method where the logic is an itertaive solution.



*/
class Solution39 {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result= new ArrayList<>();
        if(candidates== null || candidates.length==0){
            return result;
        }
        
        helper(candidates,target,0, new ArrayList<>());
        return result;
    }
    private void helper(int[] candidates,int target, int index, List<Integer> path){
        //base
        if(target==0){
            result.add(new ArrayList<>(path));
            return;
        }
        if(target<0){
            return;
        }
        //logic
        for(int i=index;i<candidates.length;i++){
            
            path.add(candidates[i]);
            helper(candidates,target-candidates[i],i,path);
            path.remove(path.size()-1);
        }
    }
}