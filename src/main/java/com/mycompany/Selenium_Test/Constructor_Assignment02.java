/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Selenium_Test;

/**
 *
 * @author Dhakane
 */
public class Constructor_Assignment02 {
    
    
 public void Method01 ()
 {
	 System.out.println("This is Default Parametrized Constructor");
 }
 public void Method02 (int a)
 {
	 System.out.println("This is One Parametrized Constructor");
 }
 public void Method03 (int a, int b)
 {
	 this.Method04(1, 2, 3);
	 this.Method01();
	 this.Method05(1, 2, 3, 4);
	 this.Method01();
	 System.out.println("This is Two Parametrized Constructor");
 }
 public void Method04 (int a, int b , int c)
 {
	 System.out.println("This is Three Parametrized Constructor");
 }
 public void Method05 (int a, int b , int c, int d)
 {
	 System.out.println("This is Four Parametrized Constructor");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor_Assignment02 CA02 = new Constructor_Assignment02();
		CA02.Method03(1, 2);
	}

}
