// code here
CSG Base = new Cube(100, 100, 5).toCSG()
.toXMin() .toYMin() .toZMin()
CSG Building = new Cube(20, 20, 45).toCSG()
.movex(15) .movey(15)  .toZMin()
CSG SecondBuilding = new Cube(20, 20, 30).toCSG()
.movex(40) .movey(15) .toZMin()
CSG ThirdBuilding = new Cube(20, 20, 50).toCSG()
.movex(65) .movey(15) .toZMin()
CSG FourthBuilding = new Cube(15, 20, 35).toCSG()
.movex(87) .movey(15) .toZMin()
CSG 

return CSG.unionAll([Base, Building, SecondBuilding, ThirdBuilding, FourthBuilding])