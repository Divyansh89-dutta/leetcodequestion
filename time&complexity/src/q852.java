class solution852{
    public int peakIndexInMountainArray(int[] arr){
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }
}
public class q852 {
    static void main(String[] args) {
        solution852 sol = new solution852();
        int[] arr = {0, 2, 4, 6, 5, 3, 1};

        System.out.println(sol.peakIndexInMountainArray(arr));
    }
}
