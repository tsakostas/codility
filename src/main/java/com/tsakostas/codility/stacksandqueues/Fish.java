package com.tsakostas.codility.stacksandqueues;

import java.util.Objects;

public class Fish {

  public int solution(int[] A) {
    Objects.requireNonNull(A);

    if (A.length > 100000) {
      throw new IllegalArgumentException("Invalid input array length.");
    }

    return 1;
  }
}
