package cs2130;

import javax.print.attribute.standard.PresentationDirection;

public class Boolean {
  static int Multiply(int x, int y) {
    int result = 0;
    if ((x == 1) && (y == 1)) {
      result = 1;
    }
    return result;
  }

  static int Add(int x, int y) {
    int result = 1;
    if ((x == 0) && (y == 0)) {
      result = 0;
    }
    return result;
  }

  static int Complement(int x) {
    int result = 1;
    if (x == 1) {
      result = 0;
    }
    return result;
  }

  static int Expression1(int x, int y, int z) {
    int resultOne;
    int resultTwo;
    int resultThree;
    int finalResult;
    resultOne = Add(x, y);
    resultTwo = Multiply(z, x);
    resultThree = Add(resultOne, resultTwo);
    finalResult = Add(resultThree, y);
    return finalResult;
  }

  static int Expression2(int x, int y, int z) {
    int resultOne;
    int resultTwo;
    int finalResult;
    resultOne = Multiply(Complement(x), Complement(y));
    resultTwo = Add(x,y);
    finalResult = Add(resultOne, resultTwo);
    return finalResult;
  }

  static int Expression3(int x, int y, int z) {
    int resultOne;
    int resultTwo;
    int resultThree;
    int resultFour;
    int finalResult;
    resultOne = Complement(Add(x, z));
    resultTwo = Add(y, Complement(x));
    resultThree = Multiply(resultOne, resultTwo);
    resultFour = Multiply(Multiply(x, Complement(y)), z);
    finalResult = Add(resultThree, resultFour);
    return finalResult;
  }
}
