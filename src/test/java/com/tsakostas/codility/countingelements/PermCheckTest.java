package com.tsakostas.codility.countingelements;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class PermCheckTest {

  @Test
  void should1() {
    int[] A = {4, 1, 2, 3};
    int expectedResult = 1;

    PermCheck permCheck = new PermCheck();

    long l1 = System.currentTimeMillis();
    assertThat(permCheck.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("should1 took " + (l2 - l1) + " msec");
  }

  @Test
  void should2() {
    int[] A = {4, 1, 3};
    int expectedResult = 0;

    PermCheck permCheck = new PermCheck();

    long l1 = System.currentTimeMillis();
    assertThat(permCheck.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("should1 took " + (l2 - l1) + " msec");
  }

  @Test
  void shouldLarge() {
    int[] A = new int[100000];
    Arrays.fill(A, 0);
    int expectedResult = 0;

    PermCheck permCheck = new PermCheck();

    long l1 = System.currentTimeMillis();
    assertThat(permCheck.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("should1 took " + (l2 - l1) + " msec");
  }

  @Test
  void should4() {
    int[] A = {4, 1, 2, 3, 4};
    int expectedResult = 0;

    PermCheck permCheck = new PermCheck();

    long l1 = System.currentTimeMillis();
    assertThat(permCheck.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("should4 took " + (l2 - l1) + " msec");
  }
}