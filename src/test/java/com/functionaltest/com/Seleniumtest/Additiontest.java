package com.functionaltest.com.Seleniumtest;

import org.junit.jupiter.api.*;



public class Additiontest  {

	
 	 @Test
		public void test() {
 		 int number4=6;
 		
 		
 		Assertions.assertEquals(number4,Addition.Add2numbers());
 		System.out.println("Addition of 2 numbers is ");
	        }
	}


