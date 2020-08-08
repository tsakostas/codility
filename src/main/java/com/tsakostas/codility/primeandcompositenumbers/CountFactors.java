package com.tsakostas.codility.primeandcompositenumbers;

public class CountFactors {

  public int solution(int N) {
    int factors = 2; // self and 1

    for (int i = 2; i <= 9; i++) {
      if (N % i == 0) {
        factors++;
      }
    }

    return factors;
  }

  public int solutionSlow(int N) {
    int factors = 0;

    for (int i = 1; i <= N; i++) {
      if (N % i == 0) {
        factors++;
      }
    }

    return factors;
  }
}
