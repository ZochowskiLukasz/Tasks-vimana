import Processors.AMGProcessor;
import Processors.KeyProcessor;
import Processors.KeyProcessorType;
import org.junit.Assert;
import org.junit.Test;

public class AMGProcessorEqualsTest {
    @Test
    public void testIfTypesAreEqualAMG() {
        KeyProcessor keyProcessor = KeyProcessorType.valueOf("AMG").createProcessor();
        Assert.assertTrue(keyProcessor.getClass().equals(AMGProcessor.class));
    }
}
