public static XBit16 valueOfHighAndLowInLittleEndian(XBit8 high, XBit8 low) {
	return valueOfHighAndLowInBigEndian(low, high);
}