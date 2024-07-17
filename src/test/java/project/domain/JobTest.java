package project.domain;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;

public class JobTest {
    /**
     * Test the constructor of the Job class.
     */
    @Test
    public void testConstructor_ValidJobName(){
        Job job = new Job("gardener");
        assertEquals("gardener", job.getName());
    }

    @Test
    public void testConstructor_InvalidJobName(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Job job = new Job("gardener123");
        });
        assertEquals("Invalid name. The name can only contain letters and spaces.", exception.getMessage());
    }

    @Test
    public void testConstructor_NullJobName(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Job job = new Job("");
        });
        assertEquals("Invalid name. The name can only contain letters and spaces.", exception.getMessage());
    }

    //teste ao set

    @Test
    public void testSet_ValidJobName(){
        Job job = new Job("gardener");
        job.setName("electrician");
        assertEquals("electrician", job.getName());
    }

    @Test
    public void testSet_InvalidJobName(){
        Job job = new Job("gardener");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            job.setName("gardener123");
        });
        assertEquals("Invalid name. The name can only contain letters and spaces.", exception.getMessage());
    }
    @Test
    public void testSet_nullJobName(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Job job = new Job("");
        });
        assertEquals("Invalid name. The name can only contain letters and spaces.", exception.getMessage());
    }
}
