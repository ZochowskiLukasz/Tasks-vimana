import Processors.ASTProcessor;
import Processors.KeyProcessor;
import Processors.KeyProcessorType;
import org.junit.Assert;
import org.junit.Test;

public class ASTProcessorEqualsTest {
    @Test
    public void testIfTypesAreEqualAST() {
        KeyProcessor keyProcessor = KeyProcessorType.valueOf("AST").createProcessor();
        Assert.assertTrue(keyProcessor.getClass().equals(ASTProcessor.class));
    }
}
