package person;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class HashCodeTest {

    //correct implementation
    @Test
    public void testHashCodeOfTwoObjectsWithSameDataShouldBeSame() throws Exception {
        Person soumya1 = new Person("soumya",97);
        Person soumya2 = new Person("soumya",97);

        int hash1 = soumya1.hashCode();
        int hash2 = soumya2.hashCode();

        assert(hash1 == hash2);
        assert(soumya1.equals(soumya2));
     }

    @Test
    public void testCalculatingHashTwiceOnSameObjectShouldGiveSameValue() throws Exception {
        Person sam = new Person("Sam",18);
        int hash1 = sam.hashCode();
        int hash2 = sam.hashCode();

        assert(hash1 == hash2);
    }

    //Wrong Implementation
    @Test
    public void testHashCodeGivesDifferentValueOnSameReference() throws Exception {
        WrongPerson soumya = new WrongPerson("soumya",97);

        int hash1 = soumya.hashCode();
        int hash2 = soumya.hashCode();

        assertEquals(false,hash1 == hash2);
    }
}
