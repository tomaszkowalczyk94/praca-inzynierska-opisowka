public static XBit8 not8bit(XBit8 value) {
	return XBit8.valueOfUnsigned(
		(~value.getUnsignedValue()) & XBit8.MAX_UNSIGNED_VALUE
	);
}	