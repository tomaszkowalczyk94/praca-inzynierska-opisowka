public void runOneInstruction() throws Z80Exception {
        interruptsManager.handleInterrupts(this);

        Instruction instruction = instructionDecoder.decode(memory, registerBank.getPc());

        InstructionResult result = instruction.execute(
                memory.read(registerBank.getPc()),
                this
        );

        clockCyclesCounter += result.getClocks();
        instructionCounter++;

        if(result.isAutoIncrementPc()) {
            registerBank.incrementReg16bit(PC, result.getSize());
        }
}