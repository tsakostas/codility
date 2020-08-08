package com.tsakostas.codility.caterpillarmethod;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MinAbsSumOfTwoTest {

  @Test
  void should1() {
    int[] A = {1, 4, -3};

    MinAbsSumOfTwo minAbsSumOfTwo = new MinAbsSumOfTwo();

    long l1 = System.currentTimeMillis();
    assertThat(minAbsSumOfTwo.solution(A)).isEqualTo(1);
    long l2 = System.currentTimeMillis();
    System.out.println("should1 took " + (l2-l1)/1000f);
  }

  @Test
  void should2() {
    int[] A = {-8, 4, 5, -10, 3};

    MinAbsSumOfTwo minAbsSumOfTwo = new MinAbsSumOfTwo();

    long l1 = System.currentTimeMillis();
    assertThat(minAbsSumOfTwo.solution(A)).isEqualTo(3);
    long l2 = System.currentTimeMillis();
    System.out.println("should2 took " + (l2-l1)/1000f);
  }

  @Test
  void extraLarge() {
    int limit = 100000000;
    int[] A = new int[limit];
    for(int i = 0; i < limit; i++) {
      A[i] = i;
    }

    MinAbsSumOfTwo minAbsSumOfTwo = new MinAbsSumOfTwo();

    long l1 = System.currentTimeMillis();
    assertThat(minAbsSumOfTwo.solution(A)).isEqualTo(0);
    long l2 = System.currentTimeMillis();
    System.out.println("extraLarge took " + (l2-l1)/1000f);
  }

}