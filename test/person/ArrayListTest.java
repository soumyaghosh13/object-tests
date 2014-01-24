package person;

import org.junit.Test;
import person.Person;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    @Test(expected = java.lang.ClassCastException.class)
    public void testGivesExceptionWhenIllegalCast() throws Exception {
        ArrayList list = new ArrayList<String>();
        list.add(new Object());
        list.add(new Object());
        String a = (String)list.get(0);
    }

    @Test
    public void testArrayListForSubclassGenerics() throws Exception {
        ArrayList<? super Person> list = new ArrayList<Person>();
        Person p1 = new Person("name",100){
            int phoneNo = 1234567890;
        };
        Person p2 = new Person("name2",200);
        list.add(p1);
        list.add(p2);
        for (Object person : list) {
            Person p = (Person)person;
        }
    }
}