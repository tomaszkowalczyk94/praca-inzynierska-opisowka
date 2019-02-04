public boolean getBit(int index) {
	if(index <0 || index > getSize()-1) {
		throw new NumberFormatException();
	}
	return ((valueContainer >> index) & 1) == 1;
}