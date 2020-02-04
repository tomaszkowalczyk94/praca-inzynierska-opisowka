public Instruction decode(Memory memory, XBit16 pc) 
    throws UnsupportedInstructionException, MemoryException {
        XBit8 opcode = memory.read(pc);

        int opcodeUnsignedValue = opcode.getUnsignedValue();
        XBit8 secondByte = readSecondByte(memory, pc);

        switch (opcodeUnsignedValue) {
            case 0xDD:
                return decodeDdOpcode(opcode, secondByte);
            case 0x36:
                return instructionsContainer.loadMemByHlFrom8Bit;
            case 0x0A:
                return instructionsContainer.loadAFromMemByBc;
            ...    
        }        
}        

private Instruction decodeDdOpcode(XBit8 opcode, XBit8 secondByte) 
    throws UnsupportedInstructionException {
        if(secondByte.getUnsignedValue() == 0x21) {
            return instructionsContainer.loadIxFrom16bit;
        }
        if(secondByte.getUnsignedValue() == 0x22) {
            return instructionsContainer.loadMemBy16bitFromIx;
        }
        ...
}        