package project.domain;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;

public class SkillTest {
    /**
     * Test the constructor of the Job class.
     */
    @Test
    public void testConstructor_ValidSkillName(){
        Skill skill = new Skill("tree pruning");
        assertEquals("tree pruning", skill.getName());
    }

    @Test
    public void testConstructor_InvalidSkillName(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Skill skill = new Skill("tree pruning 123");
        });
        assertEquals("Invalid name. The name can only contain letters and spaces.", exception.getMessage());
    }

    @Test
    public void testConstructor_NullSkillName(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Skill skill = new Skill("");
        });
        assertEquals("Invalid name. The name can only contain letters and spaces.", exception.getMessage());
    }

    //teste ao set

    @Test
    public void testSet_ValidSkillName(){
        Skill skill = new Skill("tree pruning");
        skill.setName(" operating machines");
        assertEquals(" operating machines", skill.getName());
    }

    @Test
    public void testSet_InvalidSkillName(){
        Skill skill = new Skill(" operating machines");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            skill.setName(" operating machines 123");
        });
        assertEquals("Invalid name. The name can only contain letters and spaces.", exception.getMessage());
    }
    @Test
    public void testSet_nullSkillName(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Skill skill = new Skill("");
        });
        assertEquals("Invalid name. The name can only contain letters and spaces.", exception.getMessage());
    }
}
