package com.tsakostas.codility.arrays;

import java.util.Objects;

public class CyclicRotation {

  public int[] solution(int[] A, int K) {
    Objects.requireNonNull(A);

    if (K > 100 || K <= 0 || A.length > 100 || A.length == 0) {
      return A;
    }

    int[] B = new int[A.length];
    K = K % A.length;

    for (int i = 0; i < A.length; i++) {
      B[i] = A[(A.length - K + i) % A.length];
    }

    return B;
  }
}
