public static XBit8 negativeOf(XBit8 value) {
	int buf = (~value.getUnsignedValue()) & XBit8.MAX_UNSIGNED_VALUE;
	return XBitUtils.incrementBy(
		XBit8.valueOfUnsigned(buf),
		1
	);
}