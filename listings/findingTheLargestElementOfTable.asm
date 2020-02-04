MAX	    LD HL, 30h
        LD B, (HL)
		LD A, 0
		INC HL
		LD (50h), HL
LOOP    CP (HL)
		JR NC, NOSWITCH
		LD A, (HL)
		LD (50h), HL
NOSWITCH INC HL
		DEC B
		JR NZ, LOOP
		RET