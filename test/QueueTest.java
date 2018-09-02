import com.company.Queue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    @Test
    public void canCreateEmptyQueue(){
        Queue q = new Queue();
        assertNotNull(q);
    }
}
