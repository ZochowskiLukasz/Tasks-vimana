package Processors;

public enum KeyProcessorType {
    AMG{
        @Override
        public KeyProcessor createProcessor() {
            return new AMGProcessor();
        }
    },ASL{
        @Override
        public KeyProcessor createProcessor() {
            return new ASLProcessor();
        }
    },AST{
        @Override
        public KeyProcessor createProcessor() {
            return new ASTProcessor();
        }
    },OMG{
        @Override
        public OMGProcessor createProcessor() {
            return new OMGProcessor();
        }
    };
    public abstract KeyProcessor createProcessor();
}
