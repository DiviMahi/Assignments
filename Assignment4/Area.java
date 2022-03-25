package com.dv.Assignment4;

public class Area extends Shape{
	float RectangleArea(float length, float breadth) {
		return length * breadth;
	}

	double CircleArea(double radius) {
		return 3.14 * (radius * radius);
	}

	float SquareArea(float side) {
		return (side * side);
	}

}
