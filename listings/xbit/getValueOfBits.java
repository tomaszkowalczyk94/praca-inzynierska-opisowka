public int getValueOfBits(int startIndexBit, int stopIndexBit) {
	if(startIndexBit<stopIndexBit) {
		throw new NumberFormatException();
	}
	
	int buff = valueContainer >>> stopIndexBit;
	return buff & (~(Integer.MAX_VALUE<<(startIndexBit-stopIndexBit+1)));
}