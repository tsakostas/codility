package com.tsakostas.codility.caterpillarmethod;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AbsDistinctTest {

  @Test
  void should1() {
    int[] A = {-5, -3, -1, 0, 3, 6};
    int expectedResult = 5;

    AbsDistinct absDistinct = new AbsDistinct();

    long l1 = System.currentTimeMillis();
    assertThat(absDistinct.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("should1 took " + (l2 - l1) );
  }

  @Test
  void should2() {
    int[] A = {-2147483648, 214748364};
    int expectedResult = 2;

    AbsDistinct absDistinct = new AbsDistinct();

    long l1 = System.currentTimeMillis();
    assertThat(absDistinct.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("should1 took " + (l2 - l1) );
  }
}