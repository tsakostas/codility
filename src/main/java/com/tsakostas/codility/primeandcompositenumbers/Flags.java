package com.tsakostas.codility.primeandcompositenumbers;

import java.util.LinkedList;
import java.util.List;

public class Flags {

  public int solution(int[] A) {
    if (A.length == 1) {
      return A[0];
    }

    int flags = 0;

    // int[] A = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
    List<Integer> peaksIndicesList = new LinkedList<>();

    for (int i = 1; i < A.length - 1; i++) {
      int delta1 = A[i] - A[i - 1];
      int delta2 = A[i + 1] - A[i];

      if (delta1 > 0 && delta2 < 0) {
        flags++;
        peaksIndicesList.add(i);
        System.out.println("index: " + i);
      }
    }

    return flags;
  }
}
