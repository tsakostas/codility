package com.tsakostas.codility.toptal;

import java.util.Objects;

public class TopTal_2 {

  public int solution(int[] A) {
    Objects.requireNonNull(A);

    if (A.length > 100000) {
      throw new IllegalArgumentException("Invalid input array length.");
    }

    return 1;
  }
}
