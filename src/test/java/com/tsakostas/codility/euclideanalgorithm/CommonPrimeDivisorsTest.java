package com.tsakostas.codility.euclideanalgorithm;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CommonPrimeDivisorsTest {

  @Test
  void should1() {
    int[] A = {1};
    int[] B = {1};
    int result = 5;

    long l1 = System.currentTimeMillis();
    CommonPrimeDivisors commonPrimeDivisors = new CommonPrimeDivisors();
    assertThat(commonPrimeDivisors.solution(A, B)).isEqualTo(result);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionTest1 took " + (l2 - l1) + " msec");
  }

}