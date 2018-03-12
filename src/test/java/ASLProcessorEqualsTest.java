import Processors.ASLProcessor;
import Processors.KeyProcessor;
import Processors.KeyProcessorType;
import org.junit.Assert;
import org.junit.Test;

public class ASLProcessorEqualsTest {
    @Test
    public void testIfTypesAreEqualASL() {
        KeyProcessor keyProcessor = KeyProcessorType.valueOf("ASL").createProcessor();
        Assert.assertTrue(keyProcessor.getClass().equals(ASLProcessor.class));
    }
}
