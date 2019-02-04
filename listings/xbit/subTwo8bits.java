public static Arithmetic8bitResult subTwo8bits(XBit8 value1, XBit8 value2) {
	return addTwo8bits(
		value1,
		negativeOf(value2)
	);
}