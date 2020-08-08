package com.tsakostas.codility.primeandcompositenumbers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FlagsTest {

  @Test
  void solutionTest1() {
    int[] A = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
    int expectedResult = 3;

    Flags flags = new Flags();

    long l1 = System.currentTimeMillis();
    assertThat(flags.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionTest1 took " + (l2 - l1) + " msec");
  }
}