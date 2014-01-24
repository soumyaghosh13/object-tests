package person;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StructureTest {
    //Correct hashCode functionality HashMap
    @Test
    public void testHashMapAllowsDifferentKeysToBeInserted() throws Exception {
        Person soumya1 = new Person("Asawari",19);
        Person soumya2 = new Person("Sant",19);
        HashMap<Integer,Person> people = new HashMap<Integer, Person>();

        people.put(new Integer(soumya1.hashCode()),soumya1);
        people.put(new Integer(soumya2.hashCode()),soumya2);

        assert(2 == people.size());
    }

    @Test
    public void testHashMapOverwritesSameDataIfKeyIsSame() throws Exception {
        Person asawari = new Person("Asawari",19);
        HashMap<Integer,Person> people = new HashMap<Integer, Person>();

        people.put(new Integer(asawari.hashCode()),asawari);
        people.put(new Integer(asawari.hashCode()),asawari);

        assert(1 == people.size());
    }

    //wrong hashCode functionality HashMap
    @Test
    public void testHashMapSameDataToBeInserted() throws Exception {
        WrongPerson asawari = new WrongPerson("asawari",19);
        HashMap<Integer,Person> people = new HashMap<Integer, Person>();

        people.put(new Integer(asawari.hashCode()),asawari);
        people.put(new Integer(asawari.hashCode()),asawari);

        assert(2 == people.size());
    }

    //Set Correct HashCode
    @Test
    public void testInsertingDifferentDataAllowsInserting() throws Exception {
        Person soumya1 = new Person("Asawari",19);
        Person soumya2 = new Person("Sant",19);
        Set<Person> people= new HashSet<Person>();

        people.add(soumya1);
        people.add(soumya2);

        assert(2 == people.size());
    }

    @Test
    public void testInsertingSameDataRejectsInserting() throws Exception {
        Person soumya1 = new Person("Asawari",19);
        Set<Person> people= new HashSet<Person>();

        people.add(soumya1);
        people.add(soumya1);

        assert(1 == people.size());
    }

    //Wrong HashCode set
    @Test
    public void testInsertingSameDataAllowsInserting() throws Exception {
        WrongPerson soumya1 = new WrongPerson("Asawari",19);
        Set<WrongPerson> people= new HashSet<WrongPerson>();

        people.add(soumya1);
        people.add(soumya1);

        assert(2 == people.size());
    }

    //ArrayList
    @Test
    public void testInsertInArrayList() throws Exception {
        Person soumya1 = new Person("Asawari",19);
        Person soumya2 = new Person("Sant",19);
        ArrayList<Person> people = new ArrayList<Person>();

        people.add(soumya1);
        people.add(soumya2);

        assert(2 == people.size());
    }
}