package com.tsakostas.codility.prefixsums;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CountDivTest {

  @Test
  void solutionTest1() {
    int A = 6;
    int B = 11;
    int K = 2;
    int expectedResult = 3;

    CountDiv countDiv = new CountDiv();

    long l1 = System.currentTimeMillis();
    assertThat(countDiv.solution(A, B, K)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionTest1 took " + (l2 - l1) + " msec");
  }

}