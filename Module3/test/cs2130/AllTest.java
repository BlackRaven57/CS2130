package cs2130;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AllTest {
  @Nested
  @DisplayName("Implement set operations, ")
  class SetsMethods {
    @Test
    @DisplayName("intersectionOfSets")
    void setIntersectionWorks() {
      ArrayList<Integer> setA = new ArrayList<Integer>() {
        {
          add(12);
          add(7);
          add(9);
          add(8);
          add(2);
        }
      };
        ArrayList<Integer> setB = new ArrayList<Integer>() {
          {
            add(3);
            add(2);
            add(12);
            add(9);
            add(8);
          }
      };
      ArrayList<Integer> result = Sets.intersectionOfSets(setA, setB);
      assertEquals(4, result.size(), "size of intersection set");
      assertEquals(2, result.get(0), "element 0 in intersection");
      assertEquals(8, result.get(1), "element 0 in intersection");
      assertEquals(9, result.get(2), "element 0 in intersection");
      assertEquals(12, result.get(3), "element 0 in intersection");


    }

    @Test
    @DisplayName("unionOfSets")
    void setUnionWorks() {
      ArrayList<Integer> setA = new ArrayList<Integer>() {
        {
          add(12);
          add(7);
          add(9);
          add(8);
          add(2);
        }
      };
      ArrayList<Integer> setB = new ArrayList<Integer>() {
        {
          add(3);
          add(2);
          add(12);
          add(9);
          add(8);
        }
      };
      ArrayList<Integer> result = Sets.unionOfSets(setA, setB);
      assertEquals(6, result.size(), "size of intersection set");
      assertEquals(2, result.get(0), "element 0 in intersection");
      assertEquals(3, result.get(1), "element 0 in intersection");
      assertEquals(7, result.get(2), "element 0 in intersection");
      assertEquals(8, result.get(3), "element 0 in intersection");
      assertEquals(9, result.get(4), "element 0 in intersection");
      assertEquals(12, result.get(5), "element 0 in intersection");
    }
//    @Test
//    @DisplayName("complement operation")
//    void BooleanComplementWorks() {
//      assertEquals(0, Boolean.Add(0, 0), "0 0 sent");
//      assertEquals(1, Boolean.Add(0, 1), "0 1 sent");
//      assertEquals(1, Boolean.Add(1, 0), "1 0 sent");
//      assertEquals(1, Boolean.Add(1, 1), "1 1 sent");
//    }
  }

  @Nested
  @DisplayName("Function property methods, ")
  class FunctionProperties {
    @Test
    @DisplayName("function properties one-to-one, onto, bijection")
    void functionPropertiesEqualSameOrderBoth() {
      ArrayList<Integer> domain = new ArrayList<Integer>() {
        {
          add(12);
          add(7);
          add(9);
          add(8);
          add(2);
        }
      };
      ArrayList<Integer> target = new ArrayList<Integer>() {
        {
          add(3);
          add(2);
          add(12);
          add(9);
          add(8);
        }
      };
      ArrayList<Integer> range = new ArrayList<Integer>() {
        {
          add(3);
          add(2);
          add(12);
          add(9);
          add(8);
        }
      };
      assertEquals(true, Functions.isOneToOne(domain, target, range));
      assertEquals(true, Functions.isOnto(domain, target, range));
      assertEquals(true, Functions.isBijection(domain, target, range));
    }
    @Test
    @DisplayName("function properties one-to-one, onto, bijection")
    void functionPropertiesBothDifferentOrder() {
      ArrayList<Integer> domain = new ArrayList<Integer>() {
        {
          add(12);
          add(7);
          add(9);
          add(8);
          add(2);
        }
      };
      ArrayList<Integer> target = new ArrayList<Integer>() {
        {
          add(3);
          add(2);
          add(12);
          add(9);
          add(8);
        }
      };
      ArrayList<Integer> range = new ArrayList<Integer>() {
        {
          add(3);
          add(9);
          add(12);
          add(8);
          add(2);
        }
      };
      assertEquals(true, Functions.isOneToOne(domain, target, range));
      assertEquals(true, Functions.isOnto(domain, target, range));
      assertEquals(true, Functions.isBijection(domain, target, range));
    }
    @Test
    @DisplayName("function properties onto")
    void functionPropertiesOntoDifferentOrder() {
      ArrayList<Integer> domain = new ArrayList<Integer>() {
        {
          add(12);
          add(7);
          add(9);
          add(8);
          add(2);
        }
      };
      ArrayList<Integer> target = new ArrayList<Integer>() {
        {
          add(3);
          add(12);
          add(9);
          add(8);
        }
      };
      ArrayList<Integer> range = new ArrayList<Integer>() {
        {
          add(8);
          add(9);
          add(12);
          add(3);
          add(8);
        }
      };
      assertEquals(false, Functions.isOneToOne(domain, target, range));
      assertEquals(true, Functions.isOnto(domain, target, range));
      assertEquals(false, Functions.isBijection(domain, target, range));
    }

    @Test
    @DisplayName("function properties NOT one-to-one NOT onto NOT bijection")
    void functionPropertiesNotOneToOneSameOrder() {
      ArrayList<Integer> domain = new ArrayList<Integer>() {
        {
          add(12);
          add(7);
          add(9);
          add(8);
          add(2);
        }
      };
      ArrayList<Integer> target = new ArrayList<Integer>() {
        {
          add(3);
          add(2);
          add(12);
          add(9);
          add(8);
          add(4);
        }
      };
      ArrayList<Integer> range = new ArrayList<Integer>() {
        {
          add(3);
          add(2);
          add(12);
          add(9);
          add(9);
        }
      };
      assertEquals(false, Functions.isOneToOne(domain, target, range));
      assertEquals(false, Functions.isOnto(domain, target, range));
      assertEquals(false, Functions.isBijection(domain, target, range));
    }


    @Test
    @DisplayName("function properties NOT one-to-one NOT onto NOT bijection")
    void functionPropertiesNotOneToOneDifferentOrder() {
      ArrayList<Integer> domain = new ArrayList<Integer>() {
        {
          add(12);
          add(7);
          add(9);
          add(8);
          add(2);
        }
      };
      ArrayList<Integer> target = new ArrayList<Integer>() {
        {
          add(3);
          add(2);
          add(12);
          add(9);
          add(8);
          add(4);
        }
      };
      ArrayList<Integer> range = new ArrayList<Integer>() {
        {
          add(8);
          add(4);
          add(12);
          add(4);
          add(3);
        }
      };
      assertEquals(false, Functions.isOneToOne(domain, target, range));
      assertEquals(false, Functions.isOnto(domain, target, range));
      assertEquals(false, Functions.isBijection(domain, target, range));
    }


    @Test
    @DisplayName("function properties one-to-one")
    void functionPropertiesOneToOne() {
      ArrayList<Integer> domain = new ArrayList<Integer>() {
        {
          add(12);
          add(7);
          add(9);
          add(8);
          add(2);
        }
      };
      ArrayList<Integer> target = new ArrayList<Integer>() {
        {
          add(3);
          add(2);
          add(12);
          add(9);
          add(8);
          add(4);
        }
      };
      ArrayList<Integer> range = new ArrayList<Integer>() {
        {
          add(3);
          add(2);
          add(12);
          add(9);
          add(8);
        }
      };
      assertEquals(true, Functions.isOneToOne(domain, target, range));
      assertEquals(false, Functions.isOnto(domain, target, range));
      assertEquals(false, Functions.isBijection(domain, target, range));
    }


    @Test
    @DisplayName("function properties one-to-one")
    void functionPropertiesOneToOne2() {
      ArrayList<Integer> domain = new ArrayList<Integer>() {
        {
          add(12);
          add(7);
          add(9);
          add(8);
          add(2);
        }
      };
      ArrayList<Integer> target = new ArrayList<Integer>() {
        {
          add(3);
          add(2);
          add(12);
          add(9);
          add(8);
          add(4);
        }
      };
      ArrayList<Integer> range = new ArrayList<Integer>() {
        {
          add(8);
          add(4);
          add(12);
          add(9);
          add(3);
        }
      };
      assertEquals(true, Functions.isOneToOne(domain, target, range));
      assertEquals(false, Functions.isOnto(domain, target, range));
      assertEquals(false, Functions.isBijection(domain, target, range));
    }

    @Test
    @DisplayName("function properties onto")
    void functionPropertiesOnto() {
      ArrayList<Integer> domain = new ArrayList<Integer>() {
        {
          add(12);
          add(7);
          add(9);
          add(8);
          add(2);
        }
      };
      ArrayList<Integer> target = new ArrayList<Integer>() {
        {
          add(3);
          add(2);
          add(9);
          add(8);
        }
      };
      ArrayList<Integer> range = new ArrayList<Integer>() {
        {
          add(3);
          add(2);
          add(3);
          add(9);
          add(8);
        }
      };
      assertEquals(false, Functions.isOneToOne(domain, target, range));
      assertEquals(true, Functions.isOnto(domain, target, range));
      assertEquals(false, Functions.isBijection(domain, target, range));
    }

  }
}
