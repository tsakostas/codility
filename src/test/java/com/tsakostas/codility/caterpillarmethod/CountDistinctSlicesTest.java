package com.tsakostas.codility.caterpillarmethod;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CountDistinctSlicesTest {

  @Test
  void should1() {
    int M = 6;
    int[] A = {3, 4, 5, 5, 2};
    int expectedResult = 0;

    CountDistinctSlices countDistinctSlices = new CountDistinctSlices();

    long l1 = System.currentTimeMillis();
    assertThat(countDistinctSlices.solution(M, A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("should1 took " + (l2 - l1) );
  }
}