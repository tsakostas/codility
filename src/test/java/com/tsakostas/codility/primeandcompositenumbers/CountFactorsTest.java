package com.tsakostas.codility.primeandcompositenumbers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CountFactorsTest {

  @Test
  void solutionTest1() {
    int N = 24;
    int expectedResult = 8;

    CountFactors countFactors = new CountFactors();

    long l1 = System.currentTimeMillis();
    assertThat(countFactors.solution(N)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionTest1 took " + (l2 - l1) + " msec");
  }

  @Test
  void solutionTest2() {
    int N = 48;
    int expectedResult = 8;

    CountFactors countFactors = new CountFactors();

    long l1 = System.currentTimeMillis();
    assertThat(countFactors.solution(N)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionTest1 took " + (l2 - l1) + " msec");
  }

}