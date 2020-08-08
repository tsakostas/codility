package com.tsakostas.codility.arrays;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CyclicRotationTest {

  @Test
  void should1() {
    int[] A = {3, 8, 9, 7, 6};
    int[] result = {9, 7, 6, 3, 8};

    CyclicRotation cyclicRotation = new CyclicRotation();
    assertThat(cyclicRotation.solution(A, 3)).isEqualTo(result);
  }

  @Test
  void should2() {
    int[] A = {0, 0, 0};
    int[] result = {0, 0, 0};

    CyclicRotation cyclicRotation = new CyclicRotation();
    assertThat(cyclicRotation.solution(A, 1)).isEqualTo(result);
  }

  @Test
  void should3() {
    int[] A = {1, 2, 3, 4};
    int[] result = {1, 2, 3, 4};

    CyclicRotation cyclicRotation = new CyclicRotation();
    assertThat(cyclicRotation.solution(A, 4)).isEqualTo(result);
  }

  @Test
  void should4() {
    int[] A = {3, 8, 9, 7, 6};
    int[] result = {3, 8, 9, 7, 6};

    CyclicRotation cyclicRotation = new CyclicRotation();
    assertThat(cyclicRotation.solution(A, 101)).isEqualTo(result);
  }

  @Test
  void should5() {
    int[] A = {3, 8, 9, 7, 6};
    int[] result = {9, 7, 6, 3, 8};

    CyclicRotation cyclicRotation = new CyclicRotation();
    assertThat(cyclicRotation.solution(A, 13)).isEqualTo(result);
  }

  @Test
  void should6() {
    int[] A = {};
    int[] result = {};

    CyclicRotation cyclicRotation = new CyclicRotation();
    assertThat(cyclicRotation.solution(A, 13)).isEqualTo(result);
  }
}