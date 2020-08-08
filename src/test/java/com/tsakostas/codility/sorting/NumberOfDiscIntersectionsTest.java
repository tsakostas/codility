package com.tsakostas.codility.sorting;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class NumberOfDiscIntersectionsTest {

  @Test
  void solutionTest1() {
    int[] A = {1, 5, 2, 1, 4, 0};
    int expectedResult = 11;

    NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();

    long l1 = System.currentTimeMillis();
    assertThat(numberOfDiscIntersections.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionTest1 took " + (l2 - l1) + " msec");
  }

}