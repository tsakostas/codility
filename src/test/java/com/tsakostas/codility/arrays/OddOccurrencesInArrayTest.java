package com.tsakostas.codility.arrays;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class OddOccurrencesInArrayTest {

  @Test
  void should1() {
    int[] A = {9, 3, 9, 3, 9, 7, 9};
    int result = 7;

    OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

    long l1 = System.currentTimeMillis();
    assertThat(oddOccurrencesInArray.solution(A)).isEqualTo(result);
    long l2 = System.currentTimeMillis();
    System.out.println("should1 took " + (l2 - l1) / 1000f);
  }

  @Test
  void should2() {
    int[] A = new int[201];
    for(int i = 0; i < A.length; i++) {
      if(i == 0) {
        A[i] = 1000;
      } else {
        A[i] = 20;
      }
    }

    int result = 1000;

    OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

    long l1 = System.currentTimeMillis();
    assertThat(oddOccurrencesInArray.solution(A)).isEqualTo(result);
    long l2 = System.currentTimeMillis();
    System.out.println("should2 took " + (l2 - l1) / 1000f);
  }
}