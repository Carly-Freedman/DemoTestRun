import static org.junit.Assert.*; 
import org.junit.*;

public class DemoTest {
    @Test
    public void DivisionTest(){
        assertEquals("undefined", Demo.division(3, 0));
    }
}
