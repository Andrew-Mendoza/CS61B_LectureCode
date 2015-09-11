/** Additional operations on an IntList.
 *  @author Josh Hug
 */

public class IntListOps {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        if (L.tail == null)
            return new IntList(L.head + x, null);

        int newHead = L.head + x;
        IntList newTail = incrList(L.tail, x);
        return new IntList(newHead, newTail);
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        L.head -= x;

        if (L.tail == null)
            return L;

        L.tail = dincrList(L.tail, x);
        return L;
    }

    /** Destructively squares each element of the given IntList L.
     * Don't use 'new'; modify the original IntList.
     * Should be written recursively. */
    public static IntList SquareDestructive(IntList L)
    {
        L.head *= L.head;

        if (L.tail == null)
            return L;

        L.tail = SquareDestructive(L.tail);
        return L;
    }

    /** Destructively squares each element of the given IntList L.
     * Don't use 'new'; modify the original IntList.
     * Should be written iteratively. */
    public static IntList SquareDestructiveIterative(IntList L)
    {
        
    }

    /** Non-destructively squares each element of the given IntList L.
     * Don't modify the given IntList.
     * Should be written recursively. */
    public static IntList SquareNonDestructive(IntList L)
    {
        int newHead = L.head * L.head;
        if (L.tail == null)
            return new IntList(newHead, null);
        IntList newTail = SquareNonDestructive(L.tail);
        return new IntList(newHead, newTail);
    }


    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.tail = new IntList(7, null);    
        L.tail.tail = new IntList(9, null);
        System.out.println(L);
        System.out.println(incrList(L, 3));
        System.out.println(dincrList(L, 3));
        System.out.println(SquareDestructive(L));
        System.out.println(SquareNonDestructive(L));
    }
} 