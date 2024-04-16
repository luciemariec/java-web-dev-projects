package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: EMPTY TEST 1
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    //TODO Test 2 for String with Only Brackets
    @Test
    public void onlyBracketsReturnTrue() {
        String message = "A single set of only opening and closing brackets should return true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), message);;
    }
    //TODO: Test balanced brackets around other characters - "[LaunchCode]"
    @Test
    public void balancedBracketsWithOtherCharactersReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));;
    }
    //TODO: Test balanced brackets within other characters - "Launch[Code]"
    @Test
    public void balancedBracketsWithinOtherCharactersReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));;
    }
    //TODO: Test balanced brackets in front of other characters - "[]LaunchCode"
    @Test
    public void balancedBracketsInFrontOfOtherCharactersReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));;
    }
    //TODO: Test multiple consecutive pairs of balanced brackets - "[][]"
    @Test
    public void consecutivePairsBalancedBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));;
    }
    //TODO: Test multiple nested balanced brackets - "[[[]]]"
    @Test
    public void consecutiveNestedBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));;
    }
    //TODO Test for Empty String - " "
    @Test
    public void emptyStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }
    //TODO: Test single bracket with other characters - "[LaunchCode"
    @Test
    public void singleBracketWithOtherCharactersReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));;
    }
    //TODO: Test unbalanced brackets among other characters - "Launch]Code["
    @Test
    public void unbalancedBracketsWithOtherCharactersReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));;
    }
    //TODO: Test single opening bracket - "["
    @Test
    public void singleOpenBracketReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));;
    }
    //TODO: Test single closing bracket - "]"
    @Test
    public void singleClosedBracketReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));;
    }
    //TODO: Test reversed bracket - "]["
    @Test
    public void reverseBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));;
    }
    //TODO: Test a series of mixed, unbalanced brackets - "[[]][]["
    @Test
    public void mixedUnbalancedBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]][]["));;
    }
}
