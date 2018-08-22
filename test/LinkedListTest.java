import com.company.LinkedList;
import com.company.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    public static LinkedList list;
    private static Node head;
    public static Node second;
//    public third = new Node(3);

    @BeforeEach
    public void setValues() {
        list = new LinkedList();
        head = new Node(1);
        second = new Node(2);
//       Node third = new Node(3);
    }

    @Test
    public void canSetHead() {
        list.setHead(head);
        assertEquals(list.getHeadNode(), head);
    }

    @Test
    public void canGetHead() {
        list.setHead(head);
        Node data = list.getHeadNode();
        assertEquals( head, data);
    }

    @Test
    public void canInsertNode() {
        list.setHead(head);
        list.insertNode(second);
        assertEquals(list.getHeadNode(), head);
        assertEquals(list.getHeadNode().getNextNode(), second);
    }
}
