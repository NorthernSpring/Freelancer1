package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class FreelancerTest {
    @Test
   public void testCountRestMonthCase1() {
        Freelancer freelancer = new Freelancer();

        int actual = freelancer.calculate(10000, 3000, 20000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCountRestMonthCase2() {
        Freelancer freelancer = new Freelancer();

        int actual = freelancer.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }


  }

