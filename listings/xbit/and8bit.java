public static XBit8 and8bit(XBit8 value1, XBit8 value2) {
	return XBit8.valueOfUnsigned(
		(value1.getUnsignedValue() & value2.getUnsignedValue()) 
		& XBit8.MAX_UNSIGNED_VALUE
	);
}