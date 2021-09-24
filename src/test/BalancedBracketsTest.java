package test;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void noBracketTest(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("abcd"));
    }

    @Test
    public void oneOpenBracketTest(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("[abcd"));
    }

    @Test
    public void oneCloseBracketTest(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("abcd]"));
    }

    @Test
    public void outOfOrderBracketTest(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("]abcd["));
    }

    @Test
    public void nestedBracketsTest(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[one[two[three]]]"));
    }

    @Test
    public void failNestedBracketsTest(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("[one[two[three]]"));
    }

    @Test
    public void failNestedBrackets2Test(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("[one[two[three]]]]"));
    }

    @Test
    public void failNestedBrackets3Test(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("[[[[one[two]three]]"));
    }

    @Test
    public void curlyBracketsTest(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[one[{two]]"));
    }

    @Test
    public void curlyBrackets2Test(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("[one{two]]"));
    }
}
