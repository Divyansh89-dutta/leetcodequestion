import java.nio.charset.Charset;

class MyHashSet{
    boolean[] set;
    public MyHashSet(){
        set = new boolean[1000001];
    }
    public void add(int key){
        set[key] = true;
    }
    public void remove(int key){
        set[key] = false;
    }
    public boolean contains(int key){
        return set[key];
    }
}
public class q705 {
    static void main(String[] args) {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        System.out.println(hashSet.contains(1));
    }
}
