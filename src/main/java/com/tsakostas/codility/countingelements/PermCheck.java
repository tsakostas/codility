package com.tsakostas.codility.countingelements;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PermCheck {

  public int solution(int[] A) {
    Objects.requireNonNull(A);

    if (A.length == 0 || A.length > 100000) {
      return 0;
    }

    int maximumValue = A[0];

    Set<Integer> set = new HashSet<>();

    for(int element : A) {
      if(element > 0 && element <= 1000000000) {
        if(set.contains(element)) {
          return 0;
        }

        set.add(element);
        if(maximumValue < element) {
          maximumValue = element;
        }
      }
    }

    if(set.isEmpty()) {
      return 0;
    }

    for(int i = 1; i <= maximumValue; i++ ) {
      if(!set.contains(i)) {
        return 0;
      }
    }

    return 1;
  }
}
