import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxTest {

    @Test
    public void test () {
        Max max = new Max();
        int a = 7;
        int b = 3;
        int expected = a;
        int actual = max.max(a, b);
        Assertions.assertEquals(expected, actual);
    }
}
