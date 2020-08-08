package com.tsakostas.codility.stacksandqueues;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FishTest {

  @Test
  void solutionTest1() {
    int[] A = {3, 1, 2, 4, 3};
    int expectedResult = 1;

    Fish fish = new Fish();

    long l1 = System.currentTimeMillis();
    assertThat(fish.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionTest1 took " + (l2 - l1) + " msec");
  }

}