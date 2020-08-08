package com.tsakostas.codility.countingelements;

import java.util.Arrays;

public class MaxCounters {

  public int[] solution(int N, int[] A) {
    int[] counters = new int[N];
    Arrays.fill(counters, 0);

    if (N < 1 || N > 100000) {
      return counters;
    }

    int currentMaximum = 0;
    int resetToMaxCounterValue = 0;
    int index;

    for (int i = 0; i < A.length; i++) {
      index = A[i] - 1;

      if (index < N) {
        if (counters[index] < resetToMaxCounterValue) {
          counters[index] = resetToMaxCounterValue + 1;
        } else {
          counters[index] = counters[index] + 1;
        }

        if (currentMaximum < counters[index]) {
          currentMaximum = counters[index];
        }
      } else {
        resetToMaxCounterValue = currentMaximum;
      }
    }

    for (int i = 0; i < N; i++) {
      if (counters[i] < resetToMaxCounterValue) {
        counters[i] = resetToMaxCounterValue;
      }
    }

    return counters;
  }
}
