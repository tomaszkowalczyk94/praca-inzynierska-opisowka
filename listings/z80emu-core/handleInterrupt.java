private void handleInterrupt(Z80 z80) throws Z80Exception {
    this.iff1 = this.iff2 = false;
    stackHelper.pushToStack(z80, z80.getRegs().getPc());
    
    switch (interruptionMode) {
        case IM0:
            Instruction instruction = z80.instructionDecoder.decodeOneByte(addressBus);
            instruction.execute(addressBus, z80);
            break;
        case IM1:
            z80.getRegisterBank().setPc(XBit16.valueOfUnsigned(0x0038));
            break;
        case IM2:
            XBit16 newPcValue = XBit16.valueOfHighAndLow(
                    z80.getRegs().getI(),
                    addressBus
            ).setBit(0, false);
    
            z80.getRegisterBank().setPc(newPcValue);
            break;
    }
}