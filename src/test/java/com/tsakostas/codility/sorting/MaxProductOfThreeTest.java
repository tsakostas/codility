package com.tsakostas.codility.sorting;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MaxProductOfThreeTest {

  @Test
  void solutionTest1() {
    int[] A = {-3, 1, 2, -2, 5, 6};
    int expectedResult = 60;

    MaxProductOfThree maxProductOfThree = new MaxProductOfThree();

    long l1 = System.currentTimeMillis();
    assertThat(maxProductOfThree.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionTest1 took " + (l2 - l1) + " msec");
  }

}