private void handleNmiInterrupt(Z80 z80) throws MemoryException {
    iff2 = iff1;

    stackHelper.pushToStack(z80, z80.getRegs().getPc());
    z80.getRegs().setPc(XBit16.valueOfUnsigned(0x0066));
    nmiRequest = false;
}