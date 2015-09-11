/** Defines a recursive list of integers.
 *  @author Andrew Mendoza
 */

public class IntList {
    public int head;
    public IntList tail;

    public IntList(int h, IntList t) {
        head = h;
        tail = t;
    }

    /** Retuns the size of this IntList */
    public int size() {
        if (tail == null)
            return 1;
        else
            return 1 + tail.size();     
    }

    /** Returns the size of this IntList. */
    public int iterativeSize() {
        IntList runner = this;
        int size = 0;

        while (runner != null)
        {
            size += 1;
            runner = runner.tail;
        }
        return size;
    }

    /** In class exercise 1: 
      * Returns ith item of this IntList. For 
      * simplicity, assume the item exists. */
    public int get(int i) {
        if (i == 0)
            return head;
        else
            return tail.get(i - 1);
    }

    public String toString() {
        if (tail == null)
            return Integer.toString(head);
        else return Integer.toString(head) + " " + tail.toString();
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.tail = new IntList(7, null);
        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        System.out.println(L.get(1));

        System.out.println(L.toString());
    }
} 