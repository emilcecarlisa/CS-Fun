import com.company.LinkedList;
import com.company.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    public static LinkedList list;
    private static Node first;
    public static Node second;
    public static Node x;

    @BeforeEach
    public void setValues() {
        list = new LinkedList();
        first = new Node(1);
        second = new Node(2);
        x = new Node(3);
    }

    @Test
    public void canGetHead() {
        list.setHead(first);
        Node data = list.getHeadNode();
        assertEquals(first, data);
    }

    @Test
    public void canSetHead() {
        list.setHead(first);
        assertEquals(list.getHeadNode(), first);
    }

    @Test
    public void canInsertNode() {
        list.setHead(first);
        first.setNextNode(second);
        list.insertNode(x);
        assertEquals(list.getHeadNode(), x);
    }

    @Test
    public void canGetValue() {
        list.setHead(first);
        first.setNextNode(second);
        assertEquals(list.getValue(2), second.getData());
    }

    @Test
    public Boolean canFindValue() {
        list.setHead(first);
        first.setNextNode(second);
        assertEquals(list.findValue(2), true);
    }

//    @Test
//    public void canDeleteValue() {
//        list.setHead(first);
//        first.setNextNode(second);
//        second.setNextNode(x);
//        list.deleteNode(x);
//    }
}
