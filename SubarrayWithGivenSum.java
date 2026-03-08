class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int start = 0, sum = 0;

        for(int end = 0; end < n; end++){
            sum += arr[end];

            while(sum > s && start < end){
                sum -= arr[start];
                start++;
            }

            if(sum == s){
                ArrayList<Integer> res = new ArrayList<>();
                res.add(start + 1);
                res.add(end + 1);
                return res;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(-1);
        return res;
    }
                }
