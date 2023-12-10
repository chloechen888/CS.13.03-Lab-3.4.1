import java.util.LinkedList;

public class CISStack {
    private LinkedList<Integer> s;
    private int Size;

    @Override
    public String toString() {
        return "CISStack{" +
                "stack=" + s +
                ", size=" + Size +
                '}';
    }

    public CISStack()
    {
        s= new LinkedList<>();
        Size =0;
    }

    public void push (int t)
    {
        s.addFirst(t);
        Size++;
    }

    public int size()
    {
        return Size;
    }

    public Integer pop()
    {
        int popop = s.removeFirst();
        Size--;
        return popop;
    }
    public boolean isEmpty()
    {
        return Size==0;
    }



    // Linked list property.

    // Size property.

    // Constructor.

    // Push. This method pushes a value onto the top of the stack.

    // Pop. This method pops a value from the top of the stack.

    // isEmpty. Returns a boolean indicating whether the linked list is empty.

    // size. Returns the size of the queue.

    // toString. Returns a description of the queue in, for example, the following format:
    // CISStack{stack=[7, 11], size=2}

}
