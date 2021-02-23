#define _CRT_SECURE_NO_WARNINGS	// for VS
#include <iostream>
#include <stdio.h>
#define _USE_MATH_DEFINES	// for Pi. This must come after the "math.h"
#include <math.h>			// this can be replaced by the <cmath>	

int main() {
	double r, s1, s2;
	scanf("%lf", &r);	// lf or le is for double
	s1 = M_PI * r * r;
	s2 = r * r * 2;

	printf("%.6f\n", s1);
	printf("%.6f", s2);

	system("pause");
}

