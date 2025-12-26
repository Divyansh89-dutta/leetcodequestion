class Solution709 {
    public String toLowerCase(String s) {

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];

            // If character is uppercase
            if (c >= 'A' && c <= 'Z') {
                arr[i] = (char) (c + 32); // convert to lowercase
            }
        }
        return new String(arr);
    }
}

public class q709 {
    public static void main(String[] args) {

        Solution709 sol = new Solution709();

        String s = "Hello WORLD";
        System.out.println(sol.toLowerCase(s));
    }
}
