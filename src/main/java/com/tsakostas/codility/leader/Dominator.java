package com.tsakostas.codility.leader;

public class Dominator {

  public int solution(int[] A) {
    java.util.Objects.requireNonNull(A);

    if (A.length == 0 || A.length > 100000) {
      return -1;
    }

    int virtualStackSize = 0;
    int stackValue = 0;

    for (int i = 0; i < A.length; i++) {
      if (virtualStackSize == 0) {
        stackValue = A[i];
        virtualStackSize++;
      } else {
        if (A[i] == stackValue) {
          virtualStackSize++;
        } else {
          virtualStackSize--;
        }
      }
    }

    if (virtualStackSize > 0) {
      int leaderIndex = -1;
      int counterOfCandidateLeader = 0;

      for (int i = 0; i < A.length; i++) {
        if (A[i] == stackValue) {
          leaderIndex = i;
          counterOfCandidateLeader++;
        }
      }

      if(counterOfCandidateLeader > A.length / 2) {
        return leaderIndex;
      }
    }

    return -1;
  }
}
