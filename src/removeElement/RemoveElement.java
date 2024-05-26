package removeElement;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 3, 2};
        int val = 2;
        RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.removeElement(nums, val));
    }
    public int removeElement (int[] nums, int val){
        if (nums.length == 0) {
            return 0;
        }
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            k++;
        }
        return k;
    }
}
