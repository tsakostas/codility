package com.tsakostas.codility.prefixsums;

public class CountDiv {

  public int solution(int A, int B, int K) {
    double start = Math.ceil(A / (double) K);
    double end = Math.floor(B / (double) K);

    return (int) (end - start + 1);
  }

  public int solutionSlow(int A, int B, int K) {
    int numberOfDivisibleIntegers = 0;

    for (int i = A; i <= B; i++) {
      if (i % K == 0) {
        numberOfDivisibleIntegers++;
      }
    }

    return numberOfDivisibleIntegers;
  }
}
