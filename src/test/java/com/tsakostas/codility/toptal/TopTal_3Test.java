package com.tsakostas.codility.toptal;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TopTal_3Test {

  @Test
  void solutionTest1() {
    int[] A = {3, 1, 2, 4, 3};
    int expectedResult = 1;

    TopTal_3 topTal_3 = new TopTal_3();

    long l1 = System.currentTimeMillis();
    assertThat(topTal_3.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionTest1 took " + (l2 - l1) + " msec");
  }

  @Test
  void solutionNoElement() {
    int[] A = {};
    int expectedResult = 1;

    TopTal_3 topTal_3 = new TopTal_3();

    long l1 = System.currentTimeMillis();
    assertThat(topTal_3.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionNoElement took " + (l2 - l1) + " msec");
  }

  @Test
  void solutionOneElement() {
    int[] A = {1};
    int expectedResult = 1;

    TopTal_3 topTal_3 = new TopTal_3();

    long l1 = System.currentTimeMillis();
    assertThat(topTal_3.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionOneElement took " + (l2 - l1) + " msec");
  }

  @Test
  void solutionLarge() {
    int limit = 100000000;
    int[] A = new int[limit];
    for (int i = 0; i < limit; i++) {
      A[i] = i;
    }
    int expectedResult = 1;

    TopTal_3 topTal_3 = new TopTal_3();

    long l1 = System.currentTimeMillis();
    assertThat(topTal_3.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionLarge took " + (l2 - l1) / 1000f);
  }
}
