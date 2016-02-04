/*
@throws IllegalArgumentException if something is wrong
*/


public abstract class Musical {}

some method() {} throws IllegalArgumentException;


class Guitar extends Musical {}

class Trumpet extends Musical {}

class Piano extends Musical {}

class MusicShop {
  Guitar x = new Guitar();
  Trumpet y = new Trumpet();
  Piano z = new Piano();
  }
