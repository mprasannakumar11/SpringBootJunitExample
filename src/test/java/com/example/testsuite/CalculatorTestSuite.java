package com.example.testsuite;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CalculatorTest.class, AdvancedCalculatorTest.class})
@IncludeClassNamePatterns(".*Tests")
public class CalculatorTestSuite {
}
