
int PC = 0;
while(warunekStopu()) {
  Rozkaz rozkaz = dekodujRozkaz(memory[PC]);

  switch(rozkaz) {
    case ROZKAZ_1:
      rozkaz_1();
    case ROZKAZ_2:
      rozkaz_2();
    ...  

  }

  obsługaPrzerwan();
  obsługaIO();
  inkrementacjaLicznikow();

  PC++;
}