package person;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EqualsTest {
    //Correct Implementation

    @Test
    public void testEqualsFunctionalityWithSamePersonData() throws Exception {
        Person soumya1 = new Person("soumya",18);
        Person soumya2 = new Person("soumya",18);

        assert(soumya1.equals(soumya2));
        assert(soumya2.equals(soumya1));
        assertEquals(false, soumya1 == soumya2);
    }

    @Test
    public void testEqualsFunctionalityWithDifferentPersonData() throws Exception {
        Person soumya1 = new Person("soumya",18);
        Person soumya2 = new Person("soumyagh",18);

        assertEquals(false,soumya1.equals(soumya2));
        assertEquals(false,soumya2.equals(soumya1));
        assertEquals(false,soumya1 == soumya2);
    }

    @Test
    public void testEqualsFunctionalityWithSamePersonReference() throws Exception {
        Person soumya1 = new Person("soumya",18);
        Person soumya2 = soumya1;

        assert(soumya1.equals(soumya2));
        assert(soumya2.equals(soumya1));
        assert(soumya1 == soumya2);
    }

    @Test
    public void testEqualsFunctionalityWhenOneOfReferencesIsNullGivesStatusUnequal() throws Exception {
        Person soumya1 = new Person("soumya",18);
        Person soumya2 = null;
        assertEquals(false,soumya1.equals(soumya2));
    }


    //Wrong Implementation
    @Test
    public void testGivesStatusUnequalForSameReferences() throws Exception {
        WrongPerson pallavi = new WrongPerson("pallavi",101);


        assertEquals(false,pallavi.equals(pallavi));

    }

    @Test
    public void testGivesStatusUnequalForTwoPersonsHavingSameData() throws Exception {
        WrongPerson pallavi1 = new WrongPerson("pallavi",101);
        WrongPerson pallavi2 = new WrongPerson("pallavi",101);

        assertEquals(false,pallavi1.equals(pallavi2));
    }

}