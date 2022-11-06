package com.mycompany.Selenium_Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dhakane
 */
public class Constructor_Assignment {
    
	public Constructor_Assignment () 
	{
		this(1,2,3,4);
		System.out.println("This is Default Parametrized Constructor");
	}
	public Constructor_Assignment (int a)
	{
		this();
		System.out.println("This is One Parametrized Constructor");
	}
	public Constructor_Assignment (int a , int b)
	{
		this(1,2,3);
		System.out.println("This is Two Parametrized Constructor");
	}
	public Constructor_Assignment (int a , int b , int c)
	{
		this(1);
		System.out.println("This is Three Parametrized Constructor");
	}
	public Constructor_Assignment (int a , int b , int c , int d)
	{
		System.out.println("This is Four Parametrized Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_Assignment CA= new Constructor_Assignment(1,2);
		

	}
    
}
