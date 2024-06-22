package cs2130;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

  @Nested
  @DisplayName("Implement logical operators, ")
  class OperatorTests {
    @Test
    @DisplayName("OR logic")
    @Tag("OR")
    void DisjunctionLogicWorks() {
      assertEquals('T', Logic.Disjunction('T', 'T'), "T T sent");
      assertEquals('T', Logic.Disjunction('T', 'F'), "T F sent");
      assertEquals('T', Logic.Disjunction('F', 'T'), "F T sent");
      assertEquals('F', Logic.Disjunction('F', 'F'), "T T sent");
    }

    @Test
    @DisplayName("AND logic")
    @Tags({@Tag("AND")})
    void ConjunctionLogicWorks() {
      assertEquals('T', Logic.Conjunction('T', 'T'), "T T sent");
      assertEquals('F', Logic.Conjunction('T', 'F'), "T F sent");
      assertEquals('F', Logic.Conjunction('F', 'T'), "F T sent");
      assertEquals('F', Logic.Conjunction('F', 'F'), "F F sent");
    }

    @Test
    @DisplayName("NOT logic")
    @Tags({@Tag("NOT")})
    void NegationLogicWorks() {
      assertEquals('F', Logic.Negation('T'), "T sent");
      assertEquals('T', Logic.Negation('F'), "F sent");
    }


    @Test
    @DisplayName("conditional logic")
    @Tag("conditional")
    void ConditionalLogicWorks() {
      assertEquals('T', Logic.Conditional('T', 'T'), "T T sent");
      assertEquals('F', Logic.Conditional('T', 'F'), "F T sent");
      assertEquals('T', Logic.Conditional('F', 'T'), "T F sent");
      assertEquals('T', Logic.Conditional('F', 'F'), "F F sent");
    }

    @Test
    @DisplayName("biconditional logic")
    @Tag("biconditional")
    void BiconditionalLogicWorks() {
      assertEquals('T', Logic.Biconditional('T', 'T'), "T T sent");
      assertEquals('F', Logic.Biconditional('T', 'F'), "F T sent");
      assertEquals('F', Logic.Biconditional('F', 'T'), "T F sent");
      assertEquals('T', Logic.Biconditional('F', 'F'), "F F sent");
    }
  }

  @Nested
  @DisplayName("Implement compound proposition methods, ")
  class PropositionTests {
    @Test
    @DisplayName("Propostion 1")
    @Tag("Propostion1")
    void Propostion1LogicWorks() {
      assertEquals('T', Logic.Proposition1('T', 'T', 'T'), "T T T sent");
      assertEquals('T', Logic.Proposition1('T', 'T', 'F'), "T T F sent");
      assertEquals('F', Logic.Proposition1('T', 'F', 'T'), "T F T sent");
      assertEquals('F', Logic.Proposition1('T', 'F', 'F'), "T F F sent");
      assertEquals('F', Logic.Proposition1('F', 'T', 'T'), "F T T sent");
      assertEquals('T', Logic.Proposition1('F', 'T', 'F'), "F T F sent");
      assertEquals('F', Logic.Proposition1('F', 'F', 'T'), "F F T sent");
      assertEquals('T', Logic.Proposition1('F', 'F', 'F'), "F F F sent");
    }

      @Test
      @DisplayName("Propostion 2")
      @Tag("Propostion2")
      void Propostion2LogicWorks() {
        assertEquals('F', Logic.Proposition2('T', 'T', 'T'), "T T T sent");
        assertEquals('F', Logic.Proposition2('T', 'T', 'F'), "T T F sent");
        assertEquals('T', Logic.Proposition2('T', 'F', 'T'), "T F T sent");
        assertEquals('F', Logic.Proposition2('T', 'F', 'F'), "T F F sent");
        assertEquals('F', Logic.Proposition2('F', 'T', 'T'), "F T T sent");
        assertEquals('F', Logic.Proposition2('F', 'T', 'F'), "F T F sent");
        assertEquals('T', Logic.Proposition2('F', 'F', 'T'), "F F T sent");
        assertEquals('T', Logic.Proposition2('F', 'F', 'F'), "F F F sent");
      }

      @Test
      @DisplayName("Propostion 3")
      @Tag("Propostion3")
      void Propostion3LogicWorks() {
        assertEquals('T', Logic.Proposition3('T', 'T', 'T'), "T T T sent");
        assertEquals('F', Logic.Proposition3('T', 'T', 'F'), "T T F sent");
        assertEquals('T', Logic.Proposition3('T', 'F', 'T'), "T F T sent");
        assertEquals('F', Logic.Proposition3('T', 'F', 'F'), "T F F sent");
        assertEquals('T', Logic.Proposition3('F', 'T', 'T'), "F T T sent");
        assertEquals('T', Logic.Proposition3('F', 'T', 'F'), "F T F sent");
        assertEquals('F', Logic.Proposition3('F', 'F', 'T'), "F F T sent");
        assertEquals('T', Logic.Proposition3('F', 'F', 'F'), "F F F sent");
      }

  }
}