package org.launchcode.techjobs_oo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    Job jobObject;
    Job otherJobObject;
    Job jobInfo;
    Job jobEmpty;

    @Before
    public void createJobObject(){
        jobObject = new Job();
        otherJobObject = new Job();
        jobInfo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobEmpty = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

    }

    @Test
    public void testSettingJobId(){
        assertFalse(jobObject.getId() == otherJobObject.getId());
    }

    //this test doesn't work yet
    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester", jobInfo.getName());
        assertEquals("ACME", jobInfo.getEmployer().getValue());
        assertEquals("Desert", jobInfo.getLocation().getValue());
        assertEquals("Quality control", jobInfo.getPositionType().getValue());
        assertEquals("Persistence", jobInfo.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(jobObject.equals(otherJobObject));
    }

    @Test
    public void testForBlankLine(){
        assertTrue(jobInfo.toString().startsWith("\n"));
        assertTrue(jobInfo.toString().endsWith("\n"));
    }

    @Test
    public void testToStringMethod(){
        assertEquals("\n" + "ID: " + "\nName: Product tester" + "\nEmployer: ACME" + "\nLocation: Desert" + "\nPosition Type: Quality control" + "\nCore Competency: Persistence" + "\n", jobInfo.toString());
    }

    @Test
    public void testIfDataIsAvailable(){
        assertEquals(jobEmpty.toString(), "\n" + "ID: " + "\nName: Data not available" + "\nEmployer: Data not available" + "\nLocation: Data not available" + "\nPosition Type: Data not available" + "\nCore Competency: Data not available" + "\n");
    }

}
