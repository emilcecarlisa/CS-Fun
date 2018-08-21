import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class NodeTest {
    private int value;
    private com.company.Node node;
    private com.company.Node nextNode;

    @BeforeEach
    public void setUpNode() {
        value = 1;
        node = new com.company.Node(value);
        nextNode = new com.company.Node( 2 );
    }

    @Test
    public void canGetData() {
        assertEquals(node.getData(), value);
        assertEquals(nextNode.getNextNode(),null);
    }
}