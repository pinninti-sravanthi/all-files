package com.Interface.example;

public class packageinfo {
	public static void main(String[] args) {
		Package pack = Package.getPackage("java.lang");
		System.out.println("package name: " + pack.getName());
		System.out.println("Specification title : " + pack.getSpecificationTitle());
		System.out.println("Specification Vendor: " + pack.getSpecificationVendor());
		System.out.println("Specification version: " + pack.getSpecificationVersion());
		System.out.println("Implementaion version: " + pack.getImplementationVersion());
		System.out.println("Implementation vendor: " + pack.getImplementationVendor());

	}
}
