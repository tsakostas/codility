package com.tsakostas.codility.countingelements;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MissingIntegerTest {

  @Test
  void should() {
    MissingInteger missingInteger = new MissingInteger();

    int[] A = {1, 3, 6, 4, 1, 2, 7};
    int result1 = missingInteger.solution(A);
    System.out.println(result1);
    assertThat(result1).isEqualTo(5);

    int[] B = {-1, -3};
    int result2 = missingInteger.solution(B);
    System.out.println(result2);
    assertThat(result2).isEqualTo(1);

    int[] C = {1, 2, 3};
    int result3 = missingInteger.solution(C);
    System.out.println(result3);
    assertThat(result3).isEqualTo(4);

    int[] D = {2};
    int result4 = missingInteger.solution(D);
    System.out.println(result4);
    assertThat(result4).isEqualTo(1);

    int[] E = {0, 1, 2, 3, 17, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 4, 18, 19, 20};
    int result5 = missingInteger.solution(E);
    System.out.println(result5);
    assertThat(result5).isEqualTo(11);
  }

  @Test
  void should2() {
    MissingInteger missingInteger = new MissingInteger();

    int[] A = {2, 3, 4};
    int result1 = missingInteger.solution(A);
    System.out.println(result1);
    assertThat(result1).isEqualTo(1);
  }
}