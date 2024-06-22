package cs2130;

public class Logic {
  static char Conjunction(char p, char q) {
    char result = 'F';
    if (p == 'T') {
      if (q == 'T') {
        result = 'T';
      }
    }
    return result;
  }

  static char Disjunction(char p, char q) {
    char result;
    if (p == 'T') {
      result = 'T';
    }
    else if (q == 'T') {
      result = 'T';
    }
    else {
      result = 'F';
    }
    return result;
  }

  static char Negation(char p) {
    char result;
    if (p == 'T') {
      result = 'F';
    }
    else {
      result = 'T';
    }
    return result;
  }

  static char Conditional(char p, char q) {
    char result = 'F';
    if (p == 'F') {
      result = 'T';
    }
    else if (p == 'T') {
      if (q == 'T') {
        result = 'T';
      }
    }
    return result;
  }

  static char Biconditional(char p, char q) {
    char result = 'F';
    if (p == 'F') {
      if (q == 'F') {
        result = 'T';
      }
    }
    else if (p == 'T') {
      if (q == 'T') {
        result = 'T';
      }
    }
    return result;
  }

  static char Proposition1(char p, char q, char r) {
    char resultOne;
    char resultTwo;
    char finalResult;
    // Result One
    if ((p == 'T') && (q == 'T')) {
      resultOne = 'T';
    }
    else {
      resultOne = 'F';
    }
    // Result Two
    if ((r == 'F') && (p == 'F')) {
      resultTwo = 'T';
    }
    else {
      resultTwo = 'F';
    }
    // Final Result
    if ((resultOne == 'T') || (resultTwo == 'T')) {
      finalResult = 'T';
    }
    else {
      finalResult = 'F';
    }
    return finalResult;
  }

  static char Proposition2(char p, char q, char r) {
    char resultOne;
    char resultTwo;
    char finalResult;
    resultOne = Disjunction(p, q);
    resultTwo = Conjunction(Negation(q), r);
    finalResult = Conditional(resultOne, resultTwo);
    return finalResult;
  }

  static char Proposition3(char p, char q, char r) {
    char resultOne;
    char resultTwo;
    char finalResult;
    resultOne = Biconditional(p, r);
    resultTwo = Conjunction(Negation(p), q);
    finalResult = Disjunction(resultOne, resultTwo);
    return finalResult;
  }
}
