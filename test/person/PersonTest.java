package person;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    Person swamiji = new Person("Swamiji", 3);
    Person kunal = new Person("Kunal", 50);
    Person digvijay = new Person("Digvijay", 35);
    public static List addPeopleToList(Person... persons){
        List<Person> people = new ArrayList<Person>();
        for (Person person : persons) {
            people.add(person);
        }
        return people;
    }

    @Test
    public void testForComparatorOnLengthOfPersonName() throws Exception {
        List<Person> people = addPeopleToList(digvijay, kunal, swamiji);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().length()-p2.getName().length();
            }
        });

        assertEquals(true,kunal.equals(people.get(0)));
        assertEquals(true,swamiji.equals(people.get(1)));
        assertEquals(true,digvijay.equals(people.get(2)));
    }

    @Test
    public void testForComparatorOnPersonName() throws Exception {
        List<Person> people = addPeopleToList(digvijay, kunal, swamiji);

        Collections.sort(people,new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        assertEquals(true,digvijay.equals(people.get(0)));
        assertEquals(true,kunal.equals(people.get(1)));
        assertEquals(true,swamiji.equals(people.get(2)));
    }

    @Test
    public void testForComparatorOnAgeOfLength() throws Exception {
        List<Person> people = addPeopleToList(digvijay, kunal, swamiji);

        Collections.sort(people,new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        assertEquals(true,swamiji.equals(people.get(0)));
        assertEquals(true,digvijay.equals(people.get(1)));
        assertEquals(true,kunal.equals(people.get(2)));
    }

    @Test
    public void testForComparatorWithReverseOrder() throws Exception {
        List<Person> people = addPeopleToList(digvijay, kunal, swamiji);

        Collections.sort(people,new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });

        assertEquals(true,swamiji.equals(people.get(0)));
        assertEquals(true,kunal.equals(people.get(1)));
        assertEquals(true,digvijay.equals(people.get(2)));
    }
}