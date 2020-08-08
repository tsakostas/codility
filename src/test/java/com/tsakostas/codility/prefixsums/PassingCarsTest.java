package com.tsakostas.codility.prefixsums;

import static org.assertj.core.api.Assertions.assertThat;

import com.tsakostas.codility.maximumsliceproblem.MaxProfit;
import org.junit.jupiter.api.Test;

class PassingCarsTest {

  @Test
  void solutionTest1() {
    int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
    int expectedResult = 356;

    PassingCars passingCars = new PassingCars();

    long l1 = System.currentTimeMillis();
    assertThat(passingCars.solution(A)).isEqualTo(expectedResult);
    long l2 = System.currentTimeMillis();
    System.out.println("solutionTest1 took " + (l2 - l1) + " msec");
  }

}