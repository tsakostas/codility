package com.tsakostas.codility.timecomplexity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 */
public class PermMissingElem {

  public int solution(int[] A) {
    Objects.requireNonNull(A);

    if(A.length == 0 || A.length > 100000) {
      return 1;
    }

    long N = A.length + 1;
    long idealSum = N * (N + 1) / 2;
    long actualSum = 0;

    for(int i = 0; i < A.length; i++) {
      actualSum += A[i];
    }

    return (int)(idealSum - actualSum);
  }

  public int solution3(int[] A) {
    Objects.requireNonNull(A);

    if(A.length == 0 || A.length > 100000) {
      return 1;
    }

    Arrays.sort(A);

    for(int i = 1; i < A.length; i++) {
      if(A[i] != A[i-1] + 1) {
        return A[i-1] + 1;
      }
    }

    return 1;
  }

  public int solution2(int[] A) {
    Objects.requireNonNull(A);

    // int[] A = {2, 3, 1, 5};

    if(A.length == 0 || A.length > 100000) {
      return 1;
    }

    Set<Integer> set = new HashSet<>();
    int maximumValue = A[0];

    for(int i = 0; i < A.length; i++) {
      set.add(A[i]);

      if(maximumValue < A[i]) {
        maximumValue = A[i];
      }
    }

    for(int i = 1; i <= maximumValue; i++ ) {
      if(!set.contains(i)) {
        return i;
      }
    }

    return 1;
  }
}
