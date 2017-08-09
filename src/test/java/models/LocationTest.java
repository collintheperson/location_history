package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LocationTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void instanceOfLocation_true () {
        Location location = new Location("suit","toil",true);
        assertTrue(location instanceof Location);
    }
    @Test
    public void locationInstanciatesSomewhere_suitcaseName()    {
        Location location = new Location("suitcase", "toiletries", true);
        assertEquals("suitcase",location.getSuitcase());
    }
    @Test
    public void takeDataThatWasSubmited_storedID()  {
        Location location = new Location("suitcase", "toiletries", true);

    }
}