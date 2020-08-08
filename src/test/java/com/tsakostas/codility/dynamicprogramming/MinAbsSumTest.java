package com.tsakostas.codility.dynamicprogramming;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MinAbsSumTest {

  @Test
  void should1() {
    int[] A = {1, 2, 2, -2};
    int expectedResult = 0;

    MinAbsSum minAbsSum = new MinAbsSum();

    long l1 = System.currentTimeMillis();
    assertThat(minAbsSum.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("should1 took " + (l2-l1)/1000f);
  }
}