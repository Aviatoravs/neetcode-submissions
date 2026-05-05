class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean duplicateExists = false;
        HashSet<Integer> map = new HashSet<>();
        for (int num : nums) {
            if (map.contains(num)) {
                duplicateExists = true;
                break;
            } else
                map.add(num);

        }
        return duplicateExists;
    }
}