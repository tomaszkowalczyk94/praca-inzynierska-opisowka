public class LoadAFromMemByBc extends Instruction {
    public LoadAFromMemByBc(InstructionHelper helper) {
        super(helper);
    }

    @Override
    public InstructionResult execute(XBit8 opcode, Z80 z80) throws Z80Exception {

        XBit8 valueFromMemory = z80.getMem().read(
                z80.getRegs().getBC()
        );

        z80.getRegs().setA(
                valueFromMemory
        );

        return InstructionResult.builder()
                .machineCycles(2)
                .clocks(7)
                .executionTime(1.75f)
                .size(1)
                .build();
    }
}