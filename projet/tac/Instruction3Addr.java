package projet.tac;

public class Instruction3Addr {

    public enum Op {
        COPY, PLACE, GOTO, IF, RETURN, NIL, CONS, HD, TL, CALL
    }

    private Op op;
    private String arg1;
    private String arg2;
    private String arg3;
    private java.util.List<String> argsList; // For CALL operation

    // Constructor for operations with 3 string arguments (COPY, PLACE, GOTO, IF, RETURN, etc.)
    public Instruction3Addr(Op op, String arg1, String arg2, String arg3) {
        this.op = op;
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
        this.argsList = null;
    }

    // Constructor for CALL operation with argsList
    public Instruction3Addr(Op op, String arg1, String arg2, String arg3, java.util.List<String> argsList) {
        this.op = op;
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
        this.argsList = argsList;
    }


    public Op getOp() { return op; }
    public String getArg1() { return arg1; }
    public String getArg2() { return arg2; }
    public String getArg3() { return arg3; }
    public java.util.List<String> getArgsList() { return argsList; }

    @Override
    public String toString() {
        if (op == Op.CALL) {
            return op + " " + arg1 + " " + arg2 + " " + arg3 + " " + argsList;
        }
        return op + " " +
               (arg1 != null ? arg1 : "") + " " +
               (arg2 != null ? arg2 : "") + " " +
               (arg3 != null ? arg3 : "");
    }
}
