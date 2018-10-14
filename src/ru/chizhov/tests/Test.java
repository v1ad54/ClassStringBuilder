package ru.chizhov.tests;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// ������������ ������ � ������� StringBuilder � StringBuffer ���������������
		// ��� ���������� �����.
		// �������� ��������� ����� (���������� +) �� ����������, �.�. ��� ������
		// ��������� ��������� ����� ������ ���� String, �� ��� ����������� ������ �
		// �����. ������ ����� ������� ������������ ������ ������ StringBuilder ���
		// StringBuffer � �� ������ append.
		// StringBuilder � �����, ��� ������������ ���������� ������������������
		// ��������. ����� ��� ������ � Java 5 � ����� ��������� ���������� API �
		// StringBuffer. ������������ ������� � StringBuilder �� ���������������. ���
		// ��������, ��� ��� ������������� � ������������� ������ ���� �������������.
		// �������������, ���� �� ��������� � ����������������, ��� �������� ��������
		// StringBuffer, ����� ����������� StringBuilder, ������� �������� �������
		// ������� � ����������� ����������.

		System.out.println("ClassStringBuilder");
		TestClass testBuilder = new TestStringBuilder();
		testBuilder.Test();

		System.out.println("\nClassStringBuffer");
		TestClass testBuffer = new TestStringBuffer();
		testBuffer.Test();

		System.out.println("\n����� ������ �������:");
		TestClass.TestPerformance(new StringBuffer(""));
		TestClass.TestPerformance(new StringBuilder(""));

	}

}
