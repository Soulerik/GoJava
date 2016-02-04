public abstract class Flower {}
try {
some method();
}
catch(IOException ex){
System.out.println("Wrong amount"); 
throw ex;
}

class Rose extends Flower {}

class Chamonile extends Flower {}

class Tulip extends Flower {}

class Aster extends Flower {}

class Bouquet {
  Flower x = new Flower();
  try{
  collectSunShines() throws ex{}
  }
  catch(HlorofileNotFoundExeption ex){
  throw ex;
  }
  
class RoseBunch {
  Rose x = new Rose();
  }

class HlorofileNotFoundExeption extend FileNotFoundExeption {
System.err.print("We can not collect sunshine!")
}
