package person;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringTest {
    @Test
    public void testWithTwoLiteralsThatHasSameValue() throws Exception {
        String literal1 = "soumya",literal2 = "soumya";

        assert(literal1.equals(literal2));
        assert(literal1 == literal2);

    }

    @Test
    public void testWithTwoLiteralsWithDifferentValues() throws Exception {
        String literal1 = "soumya",literal2 = "soumyagh";

        assertEquals(false, literal1.equals(literal2));
    }

    @Test
    public void testWithStringConstructorWithSameValues() throws Exception {
        String string1 = new String("soumya");
        String string2 = new String("soumya");

        assert(string1.equals(string2));
        assertEquals(false, string1 == string2);
    }

    @Test
    public void testWithStringConstructorWithDifferentValues() throws Exception {
        String string1 = new String("soumya");
        String string2 = new String("soumyagh");

        assertEquals(false,string1.equals(string2));
        assertEquals(false,string1 == string2);
    }

    @Test
    public void testWithLiteralAndStringConstructorWithSameValues() throws  Exception  {
        String literal = "soumya";
        String string = new String("soumya");

        assert(literal.equals(string));
        assertEquals(false,literal == string);
    }

    @Test
    public void testWithLiteralAndStringConstructorWithDifferentValues() throws  Exception  {
        String literal ="soumya";
        String string = "soumyagh";

        assertEquals(false,literal.equals(string));
    }
}
