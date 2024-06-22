package cs2130;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCases {
    @Nested
    class SequenceTest {

        @Test
        void GeometricTest() {
            ArrayList<Double> sequence = new ArrayList<>();
            sequence = Sequence.Geometric(5,5,2);
            assertEquals(sequence.get(0),5,.001);
            assertEquals(sequence.get(1),10, .001);
            assertEquals(sequence.get(2),20, .001);
            assertEquals(sequence.get(3),40, .001);
            assertEquals(sequence.get(4),80, .001);
            assertEquals(sequence.size(),5, .001);

        }

        @Test
        void GeometricTestRealNumbers() {
            ArrayList<Double> sequence = new ArrayList<>();
            sequence = Sequence.Geometric(4,5.1,2.3);
            assertEquals(sequence.get(0),5.1, .001);
            assertEquals(sequence.get(1),11.73, .001);
            assertEquals(sequence.get(2),26.979, .001);
            assertEquals(sequence.get(3),62.0517, .001);
            assertEquals(sequence.size(),4, .001);

        }

        @Test
        void ArithmeticTest() {
            ArrayList<Double> sequence = new ArrayList<>();
            sequence = Sequence.Arithmetic(5,5,2);
            assertEquals(sequence.get(0),5, .001);
            assertEquals(sequence.get(1),7, .001);
            assertEquals(sequence.get(2),9, .001);
            assertEquals(sequence.get(3),11, .001);
            assertEquals(sequence.get(4),13, .001);
            assertEquals(sequence.size(),5, .001);
        }


        @Test
        void ArithmeticTestRealNumbers() {
            ArrayList<Double> sequence = new ArrayList<>();
            sequence = Sequence.Arithmetic(4,3.7,5.6);
            assertEquals(sequence.get(0),3.7, .001);
            assertEquals(sequence.get(1),9.3, .001);
            assertEquals(sequence.get(2),14.9, .001);
            assertEquals(sequence.get(3),20.5, .001);
            assertEquals(sequence.size(),4, .001);
        }
    }
    @Nested
    class IntegersTest{
        @Test
        void DivTestPositive() {
            assertTrue(Integers.Div(23,6)==3);
            assertTrue(Integers.Mod(23,6)==5);
            assertTrue(Integers.Div(246,68)==3);
            assertTrue(Integers.Mod(246,68)==42);
            assertTrue(Integers.Div(259783,3218)==80);
            assertTrue(Integers.Mod(259783,3218)==2343);
        }

        @Test
        void DivTestNegative() {
            assertTrue(Integers.Div(-23,6)==-4);
            assertTrue(Integers.Mod(-23,6)==1);
            assertTrue(Integers.Div(-246,68)==-4);
            assertTrue(Integers.Mod(-246,68)==26);
            assertTrue(Integers.Div(-259783,3218)==-81);
            assertTrue(Integers.Mod(-259783,3218)==875);
        }

        @Test
        void GcdTest() {
            assertTrue(Integers.Gcd(324,486)==162);
            assertTrue(Integers.Gcd(324, 372)==12);
            assertTrue(Integers.Gcd(217, 372)==31);
            assertTrue(Integers.Gcd(372,217)==31);
            assertTrue(Integers.Gcd(816, 422)==2);
            assertTrue(Integers.Gcd(422, 816)==2);
        }

        @Test
        void LcmTest() {
            assertTrue(Integers.Lcm(324,486)==972);
            assertTrue(Integers.Lcm(324, 372)==10044);
            assertTrue(Integers.Lcm(217, 372)==2604);
            assertTrue(Integers.Lcm(816, 422)==172176);
        }
    }
}
