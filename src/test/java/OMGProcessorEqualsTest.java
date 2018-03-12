import Processors.KeyProcessor;
import Processors.KeyProcessorType;
import Processors.OMGProcessor;
import org.junit.Assert;
import org.junit.Test;

public class OMGProcessorEqualsTest {
    @Test
    public void testIfTypesAreEqualOMG() {
        KeyProcessor keyProcessor = KeyProcessorType.valueOf("OMG").createProcessor();
        Assert.assertTrue(keyProcessor.getClass().equals(OMGProcessor.class));
    }
}
