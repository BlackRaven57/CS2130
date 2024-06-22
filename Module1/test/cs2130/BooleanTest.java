package cs2130;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooleanTest {
  @Nested
  @DisplayName("Implement Boolean operations, ")
  class BooleanOperationTests {
    @Test
    @DisplayName("multiplication operation")
    @Tag("multiply")
    void BooleanMultiplyWorks() {
      assertEquals(0, Boolean.Multiply(0, 0), "0 0 sent");
      assertEquals(0, Boolean.Multiply(0, 1), "0 1 sent");
      assertEquals(0, Boolean.Multiply(1, 0), "1 0 sent");
      assertEquals(1, Boolean.Multiply(1, 1), "1 1 sent");
    }

    @Test
    @DisplayName("addition operation")
    @Tag("add")
    void BooleanAddWorks() {
      assertEquals(0, Boolean.Add(0, 0), "0 0 sent");
      assertEquals(1, Boolean.Add(0, 1), "0 1 sent");
      assertEquals(1, Boolean.Add(1, 0), "1 0 sent");
      assertEquals(1, Boolean.Add(1, 1), "1 1 sent");
    }

    @Test
    @DisplayName("complement operation")
    void BooleanComplementWorks() {
      assertEquals(0, Boolean.Add(0, 0), "0 0 sent");
      assertEquals(1, Boolean.Add(0, 1), "0 1 sent");
      assertEquals(1, Boolean.Add(1, 0), "1 0 sent");
      assertEquals(1, Boolean.Add(1, 1), "1 1 sent");
    }
  }

  @Nested
  @DisplayName("Implement Boolean expression methods, ")
  class BooleaExpressionTests {
    @Test
    @DisplayName("expression 1")
    void BooleanExpression1Works() {
      assertEquals(0, Boolean.Expression1(0, 0, 0), "0 0 0 sent");
      assertEquals(0, Boolean.Expression1(0, 0, 1), "0 0 1 sent");
      assertEquals(1, Boolean.Expression1(0, 1, 0), "0 1 0 sent");
      assertEquals(1, Boolean.Expression1(0, 1, 1), "0 1 1 sent");
      assertEquals(1, Boolean.Expression1(1, 0, 0), "1 0 0 sent");
      assertEquals(1, Boolean.Expression1(1, 0, 1), "1 0 1 sent");
      assertEquals(1, Boolean.Expression1(1, 1, 0), "1 1 0 sent");
      assertEquals(1, Boolean.Expression1(1, 1, 1), "1 1 1 sent");
    }

  @Test
  @DisplayName("expression2")
  void BooleanExpression2Works() {
    assertEquals(1, Boolean.Expression2(0, 0, 0), "0 0 0 sent");
    assertEquals(1, Boolean.Expression2(0, 0, 1), "0 0 1 sent");
    assertEquals(1, Boolean.Expression2(0, 1, 0), "0 1 0 sent");
    assertEquals(1, Boolean.Expression2(0, 1, 1), "0 1 1 sent");
    assertEquals(0, Boolean.Expression2(1, 0, 0), "1 0 0 sent");
    assertEquals(1, Boolean.Expression2(1, 0, 1), "1 0 1 sent");
    assertEquals(1, Boolean.Expression2(1, 1, 0), "1 1 0 sent");
    assertEquals(1, Boolean.Expression2(1, 1, 1), "1 1 1 sent");
  }

  @Test
  @DisplayName("expression3")
  void BooleanExpression3Works() {
    assertEquals(1, Boolean.Expression3(0, 0, 0), "0 0 0 sent");
    assertEquals(0, Boolean.Expression3(0, 0, 1), "0 0 1 sent");
    assertEquals(1, Boolean.Expression3(0, 1, 0), "0 1 0 sent");
    assertEquals(0, Boolean.Expression3(0, 1, 1), "0 1 1 sent");
    assertEquals(0, Boolean.Expression3(1, 0, 0), "1 0 0 sent");
    assertEquals(1, Boolean.Expression3(1, 0, 1), "1 0 1 sent");
    assertEquals(0, Boolean.Expression3(1, 1, 0), "1 1 0 sent");
    assertEquals(0, Boolean.Expression3(1, 1, 1), "1 1 1 sent");
  }
}

}