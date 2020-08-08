package com.tsakostas.codility.dynamicprogramming;

public class MinAbsSum {

  public int solution(int[] A) {
    java.util.Objects.requireNonNull(A);

    if (A.length == 0 || A.length > 100000) {
      return 0;
    }

    int minimalAbsSum = Math.abs(A[0] + A[0]);
    int frontIndex = 0;
    int backIndex = A.length - 1;

    java.util.Arrays.sort(A);

    while (frontIndex <= backIndex) {
      int currentAbsSum = Math.abs(A[frontIndex] + A[backIndex]);
      minimalAbsSum = Math.min(minimalAbsSum, currentAbsSum);
      if(Math.abs(A[frontIndex]) > Math.abs(A[backIndex])) {
        frontIndex++;
      } else {
        backIndex--;
      }
    }

    return minimalAbsSum;
  }
}
