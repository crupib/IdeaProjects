import org.junit.Test;

import static org.junit.Assert.*;

public class PrintGradesTest {
    @Test
    public void test()
    {
        PrintGrades pg = new PrintGrades();
        String result = pg.Print(95);
        assertEquals("You got an A!",result);
    }

}