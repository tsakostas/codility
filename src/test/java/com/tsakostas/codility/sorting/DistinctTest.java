package com.tsakostas.codility.sorting;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DistinctTest {

  @Test
  void solutionTest1() {
    int[] A = {2, 1, 1, 2, 3, 1};
    int expectedResult = 3;

    Distinct distinct = new Distinct();

    long l1 = System.currentTimeMillis();
    assertThat(distinct.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionTest1 took " + (l2 - l1) + " msec");
  }

}