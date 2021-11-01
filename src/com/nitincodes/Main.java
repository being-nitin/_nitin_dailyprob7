package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	/* Write a program to print the area and perimeter of a triangle having
	 sides of 3, 4 and 5 units by creating a class named 'Triangle'
	  without any parameter in its constructor
	 */
    Triangle t1 = new Triangle();
    t1.base = 3;
    t1.height = 4;
    t1.hypot = 5;
    t1.area_();
    t1.perimeter_();
    }
}
class Triangle{
    int base;
    int height;
    int hypot;
    float area;
    int perimeter;
    void area_(){
        area = (base*height)/2;
        System.out.println(area);
    }
    void perimeter_(){
        perimeter = base+height+hypot;
        System.out.println(perimeter);
    }
}
