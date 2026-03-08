class Solution {
    int missingNumber(int arr[], int n) {
        int sum = n * (n + 1) / 2;
        int arrSum = 0;

        for (int i = 0; i < n - 1; i++) {
            arrSum += arr[i];
        }

        return sum - arrSum;
    }
}
