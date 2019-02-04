public static XBit16 valueOfHighAndLowInBigEndian(XBit8 high, XBit8 low) {
	ByteBuffer bb = ByteBuffer.allocate(2);
	bb.order(ByteOrder.BIG_ENDIAN);
	bb.put((byte)high.getSignedValue());
	bb.put((byte)low.getSignedValue());
	return new XBit16(bb.getShort());
}