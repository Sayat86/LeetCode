package removeElement;

public class RemElement {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        RemElement remElement = new RemElement();
        int k = remElement.removeElement(nums, val);
        System.out.println(k);
    }
    public int removeElement (int[] nums, int val){
        if (nums.length == 0) {
            return 0;
        }
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                k++;
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println();
        return k;
    }
}
