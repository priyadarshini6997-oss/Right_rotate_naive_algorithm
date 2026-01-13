package com.index;

import java.util.Scanner;

public class Ass10_prog2 {
	
	static void rotateRightOnce(int[] a) {
		int n = a.length;
		int last = a[n-1];
		for(int i=n-1;i>0;i--) {
			a[i]= a[i-1];
		}
		a[0] = last;
	}
	static void rotateRight(int[] a,int k) {
		int n = a.length;
		
		k=k%n;
		if(k==0) return;
		for(int i=1;i<=k;i++) {
			rotateRightOnce(a);
		}
	}
	

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		
		System.out.println("Original Array:");
        for (int x : a) {
            System.out.print(x + " ");
        }
        
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the k value to be rotated right");
		int k1 = sc.nextInt();
		rotateRight(a,k1);
		System.out.println("Array after right rotation:");
	        for (int x : a) {
	            System.out.print(x + " ");
	        }
		sc.close();
	}
		

	}


