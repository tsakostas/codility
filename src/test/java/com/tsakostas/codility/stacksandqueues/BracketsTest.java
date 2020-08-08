package com.tsakostas.codility.stacksandqueues;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BracketsTest {

  @Test
  void solutionTest1() {
    String S = "{[()()]}";
    int expectedResult = 1;

    Brackets brackets = new Brackets();

    long l1 = System.currentTimeMillis();
    assertThat(brackets.solution(S)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionTest1 took " + (l2 - l1) + " msec");
  }

  @Test
  void solutionTest2() {
    String S = "([)()]";
    int expectedResult = 0;

    Brackets brackets = new Brackets();

    long l1 = System.currentTimeMillis();
    assertThat(brackets.solution(S)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionTest2 took " + (l2 - l1) + " msec");
  }

  @Test
  void solutionTest3() {
    String S = "[{A}]";
    int expectedResult = 0;

    Brackets brackets = new Brackets();

    long l1 = System.currentTimeMillis();
    assertThat(brackets.solution(S)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionTest3 took " + (l2 - l1) + " msec");
  }

  @Test
  void solutionTest4() {
    String S = ")";
    int expectedResult = 0;

    Brackets brackets = new Brackets();

    long l1 = System.currentTimeMillis();
    assertThat(brackets.solution(S)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionTest4 took " + (l2 - l1) + " msec");
  }

}