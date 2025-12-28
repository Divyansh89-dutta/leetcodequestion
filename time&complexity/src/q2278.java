class solution2278{
    public int percentageLetter(String s, char letter){
        int count = 0;
        for(char ch : s.toCharArray()){
            if (ch == letter){
                count++;
            }
        }
        return (count * 100) / s.length();
    }
}
public class q2278 {
    static void main(String[] args) {
        solution2278 sol = new solution2278();
        String s = "foobar";
        char letter = 'o';
        System.out.println(sol.percentageLetter(s, letter));
    }
}
