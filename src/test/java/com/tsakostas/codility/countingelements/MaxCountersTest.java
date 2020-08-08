package com.tsakostas.codility.countingelements;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MaxCountersTest {

  @Test
  void should1() {
    int N = 5;
    int[] A = {3, 4, 4, 6, 1, 4, 4};
    int[] result = {3, 2, 2, 4, 2};

    MaxCounters maxCounters = new MaxCounters();

    long l1 = System.currentTimeMillis();
    assertThat(maxCounters.solution(N, A)).isEqualTo(result);
    long l2 = System.currentTimeMillis();
    System.out.println("should1 took " + (l2 - l1) );
  }

  @Test
  void should2() {
    int N = 1;
    int[] A = {3, 4, 4, 6, 1, 4, 4};
    int[] result = {1};

    MaxCounters maxCounters = new MaxCounters();

    long l1 = System.currentTimeMillis();
    assertThat(maxCounters.solution(N, A)).isEqualTo(result);
    long l2 = System.currentTimeMillis();
    System.out.println("should2 took " + (l2 - l1) );
  }

  @Test
  void shouldLarge() {
    int N = 100000;
    int[] A = {1};
    int[] result = new int[N];
    result[0] = 1;

    MaxCounters maxCounters = new MaxCounters();

    long l1 = System.currentTimeMillis();
    assertThat(maxCounters.solution(N, A)).isEqualTo(result);
    long l2 = System.currentTimeMillis();
    System.out.println("shouldLarge took " + (l2 - l1) );
  }
}