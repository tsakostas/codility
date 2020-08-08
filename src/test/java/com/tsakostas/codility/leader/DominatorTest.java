package com.tsakostas.codility.leader;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DominatorTest {

  @Test
  void should1() {
    int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
    int result = 7;

    long l1 = System.currentTimeMillis();
    Dominator dominator = new Dominator();
    assertThat(dominator.solution(A)).isEqualTo(result);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionTest1 took " + (l2 - l1) + " msec");
  }
}