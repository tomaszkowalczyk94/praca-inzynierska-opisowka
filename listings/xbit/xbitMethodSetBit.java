public TSelf setBit(int index, boolean value) {
	int mask = 1 << index;
	int newValue;
	if(value) {
		newValue = this.getUnsignedValue() | mask;
	} else {
		newValue = (this.getUnsignedValue() & ~mask);
	}
	return createNewOfUnsigned(newValue);
}