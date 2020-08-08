package com.tsakostas.codility.timecomplexity;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PermMissingElemTest {

  @Test
  void should1() {
    int[] A = {2, 3, 1, 5};
    int expectedResult = 4;

    PermMissingElem permMissingElem = new PermMissingElem();

    long l1 = System.currentTimeMillis();
    assertThat(permMissingElem.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("should1 took " + (l2 - l1) + " msec");
  }

  @Test
  void should2() {
    int[] A = {};
    int expectedResult = 1;

    PermMissingElem permMissingElem = new PermMissingElem();

    long l1 = System.currentTimeMillis();
    assertThat(permMissingElem.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("should2 took " + (l2 - l1) + " msec");
  }

  @Test
  void should3() {
    int[] A = {1};
    int expectedResult = 2;

    PermMissingElem permMissingElem = new PermMissingElem();

    long l1 = System.currentTimeMillis();
    assertThat(permMissingElem.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("should3 took " + (l2 - l1) + " msec");
  }

  @Test
  void should4() {
    int[] A = {1, 2, 3, 4, 5, 7};
    int expectedResult = 6;

    PermMissingElem permMissingElem = new PermMissingElem();

    long l1 = System.currentTimeMillis();
    assertThat(permMissingElem.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("should4 took " + (l2 - l1) + " msec");
  }

}