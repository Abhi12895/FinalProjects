package com.tcs.app;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestCalculator.class, TestCalculator2.class })
public class CalculatorTestSuite {

}
