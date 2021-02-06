package org.launchcode.techjobs_oo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    Job jobObject;
    Job otherJobObject;
    Job jobInfo;

    @Before
    public void createJobObject(){
        jobObject = new Job();
        otherJobObject = new Job();
        jobInfo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
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

}
