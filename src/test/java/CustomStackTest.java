import org.junit.Test;

import java.util.ArrayList;

public class CustomStackTest {
    ArrayList al = new ArrayList();

    @Test
    public void testEmpty() {
        System.out.println("Test Array is empty");
        assert (al.size() == 0);

    }

    @Test
    public void testPeek() {
        System.out.println("Test object from the top of the Stack");

        al.add(5);
        al.add(7);
        al.add(9);
        assert (al.get(al.size() - 1).equals(9));
    }

    @Test
    public void testPopOne() {
        System.out.println("Test function for a stack with one element");
        al.add(4);
        al.remove(al.size() - 1);
        assert (al.isEmpty());
    }

    @Test
    public void testPopTwo() {
        System.out.println("Test function for a stack with two element");
        al.add(1);
        al.add(2);
        al.remove(al.size() - 1);
        assert (al.remove(al.size() - 1).equals(1));
    }

    /*public int push (int p){
        al.add(8);
    }*/
    @Test
    public void testPush() {
        al.add(8);
        assert (al.get(al.size() - 1).equals(8));

    }

    @Test
    public void testSearchOne() {
        System.out.println("Test function for searching in a stack with one element");
        al.add(1);
        al.add(2);
        al.add(3);
//        for (int i = 0; i < (al.size() - 1); i++){
        assert (al.contains(1));


    }
    @Test

    public void testSearchTwo(){
        System.out.println("Test function for searching in a stack with two elements");
        al.add(1);
        al.add(2);
        al.add(3);
        assert (al.contains(1) & al.contains(2));
    }

}





