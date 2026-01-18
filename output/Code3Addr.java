import java.util.ArrayList;
import java.util.List;

public class Code3Addr {

    private List<Instruction3Addr> instructions = new ArrayList<>();
    private SymbolTable symbols;

    public Code3Addr(SymbolTable symbols) {
        this.symbols = symbols;
    }

    public SymbolTable getSymbols() {
        return symbols;
    }

    public void add(Instruction3Addr instr) {
        instructions.add(instr);
    }

    public List<Instruction3Addr> getInstructions() {
        return instructions;
    }
    public void print() {
        for (Instruction3Addr i : instructions) {
            System.out.println(i);
        }
    }
}
