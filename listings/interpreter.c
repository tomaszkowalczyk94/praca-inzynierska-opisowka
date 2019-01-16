
int PC = 0;
while(warunekStopu()) {
	
  Rozkaz rozkaz = dekodujRozkaz(pobierzRozkaz());

  switch(rozkaz) {
    case ROZKAZ_1:
      rozkaz_1();
    case ROZKAZ_2:
      rozkaz_2();
    ...  
  }

  obslugaPrzerwan();
  obslugaIO();
  inkrementacjaLicznikow();

  PC++;
}