public static Arithmetic8bitResult addTwo8bits(XBit8 value1, XBit8 value2) {
	Arithmetic8bitResult ret = new Arithmetic8bitResult();
	int result = value1.getUnsignedValue() + value2.getUnsignedValue();
	if(result>XBit8.MAX_UNSIGNED_VALUE) {
		ret.carry = true;
	}
	ret.result = XBit8.valueOfUnsigned(result & XBit8.MAX_UNSIGNED_VALUE);
	
	ret.overflow =((value1.getBit(7) && value2.getBit(7) && !ret.result.getBit(7)) ||
	(!value1.getBit(7) && !value2.getBit(7) && ret.result.getBit(7)));
	
	return ret;
}