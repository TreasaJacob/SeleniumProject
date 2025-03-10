package com.Obsquara.SeleniumProject.TestNgSample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AnnotationsEg {
  @Test
  public void print() {
	  System.out.println("Hello");
  }
  @Test
  public void sample() {
	  System.out.println("Hi");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
  }

}
