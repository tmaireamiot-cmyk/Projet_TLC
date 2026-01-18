import java.io.*;


public class Parser3Addr {

    public static Code3Addr parse(String filename) {
        SymbolTable symbols = new SymbolTable();

        Code3Addr code = new Code3Addr(symbols);

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;
            while ((line = br.readLine()) != null) {

                String[] t = line.trim().split("\\s+");
                if (t.length == 0) continue;

                switch (t[0]) {

                    case "place":
                        code.add(
                            new Instruction3Addr(Instruction3Addr.Op.PLACE, t[1], null, null)
                        );
                        break;

                    case "copy":
                        code.add(
                            new Instruction3Addr(Instruction3Addr.Op.COPY, t[1], t[2], null)
                        );
                        break;

                    case "goto":
                        code.add(
                            new Instruction3Addr(Instruction3Addr.Op.GOTO, t[1], null, null)
                        );
                        break;

                    case "if":
                        code.add(
                            new Instruction3Addr(Instruction3Addr.Op.IF, t[1], null, null)
                        );
                        break;

                    case "return":
                        String arg = (t.length > 1) ? t[1] : null;
                        code.add(
                            new Instruction3Addr(Instruction3Addr.Op.RETURN, arg, null, null)
                        );
                        break;

                    default:
                        System.out.println("Instruction inconnue : " + line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return code;
    }
}
