package com.tsakostas.codility.stacksandqueues;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;

/**
 *
 */
public class Brackets {


  public int solution(String S) {
    Objects.requireNonNull(S);

    if (S.length() > 200000) {
      throw new IllegalArgumentException("Invalid input array length.");
    }

    if (S.trim().isEmpty()) {
      return 1;
    }

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < S.length(); i++) {
      char currentChar = S.charAt(i);

      if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
        stack.push(currentChar);
      } else if (currentChar == ')' || currentChar == ']' || currentChar == '}') {
        if (!stack.isEmpty()) {
          char poppedChar = stack.pop();
          if ((poppedChar == '(' && currentChar != ')')
              || (poppedChar == '[' && currentChar != ']')
              || (poppedChar == '{' && currentChar != '}')) {
            return 0;
          }
        } else {
          return 0;
        }
      } else {
        return 0;
      }
    }

    return stack.isEmpty() ? 1 : 0;
  }


  public int solutionSlow(String S) {
    Objects.requireNonNull(S);

    if (S.length() > 200000) {
      throw new IllegalArgumentException("Invalid input array length.");
    }

    if (S.trim().isEmpty()) {
      return 1;
    }

    /**
     * A pair of opening (left) and closing (right) symbols.
     */
    class Pair {

      char left;
      char right;

      public Pair(char left, char right) {
        this.left = left;
        this.right = right;
      }

      public boolean isLeft(char c) {
        return c == left;
      }

      public boolean isRight(char c) {
        return c == right;
      }

      public boolean isValid(char l, char r) {
        return l == left && r == right;
      }
    }

    Set<Pair> allowedPairs = new HashSet<>();
    allowedPairs.add(new Pair('(', ')'));
    allowedPairs.add(new Pair('[', ']'));
    allowedPairs.add(new Pair('{', '}'));

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < S.length(); i++) {
      char c = S.charAt(i);

      if (allowedPairs.stream().anyMatch(pair -> pair.isLeft(c))) {
        stack.push(c);
      } else if (allowedPairs.stream().anyMatch(pair -> pair.isRight(c))) {
        if (!stack.isEmpty()) {
          char popped = stack.pop();
          if (!allowedPairs.stream().anyMatch(pair -> pair.isValid(popped, c))) {
            return 0;
          }
        } else {
          return 0;
        }
      } else {
        return 0;
      }
    }

    return stack.isEmpty() ? 1 : 0;
  }
}
