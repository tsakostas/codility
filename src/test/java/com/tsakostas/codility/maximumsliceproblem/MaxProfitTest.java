package com.tsakostas.codility.maximumsliceproblem;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MaxProfitTest {

  @Test
  void solutionTest1() {
    int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
    int expectedResult = 356;

    MaxProfit maxProfit = new MaxProfit();

    long l1 = System.currentTimeMillis();
    assertThat(maxProfit.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionTest1 took " + (l2 - l1) + " msec");
  }
}