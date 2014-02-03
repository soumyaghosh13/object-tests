package date;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestDate {

    @Test
    public void testDate(){
        Date date = new Date(3,2,2013);
        System.out.println(date.displayDate());
    }


}
