import static org.junit.Assert.*;
import org.junit.*;

public class WordReplacerTest {
    @Test
    public void Test1() {
assertEquals("onetwotwothreefour", WordReplacer.WordRep("onetwothreefour", "two", "twotwo"));
}
}