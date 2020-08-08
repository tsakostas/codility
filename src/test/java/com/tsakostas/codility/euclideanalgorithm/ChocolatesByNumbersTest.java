package com.tsakostas.codility.euclideanalgorithm;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ChocolatesByNumbersTest {

  @Test
  void should1() {
    int N = 10;
    int M = 4;
    int result = 5;

    long l1 = System.currentTimeMillis();
    ChocolatesByNumbers chocolatesByNumbers = new ChocolatesByNumbers();
    assertThat(chocolatesByNumbers.solution(N, M)).isEqualTo(result);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionTest1 took " + (l2 - l1) + " msec");
  }
}