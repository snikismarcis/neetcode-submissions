class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> vault = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int numNeeded = target - nums[i];

            if (vault.containsKey(numNeeded)) {
                return new int[] {vault.get(numNeeded), i};
            }

            vault.put(nums[i], i);
        }
        return new int[] {};
    }
}
