package ru.chizhov.tests;

public class Test {

	public static void main(String[] args) {
		// ������������ ������ � ������� StringBuilder ��������������� ��� ����������
		// �����.
		// �������� ��������� ����� (���������� +) �� ����������, �.�. ��� ������
		// ��������� ��������� ����� ������ ���� String, �� ��� ����������� ������ �
		// �����. ������ ����� ������� ������������ ������ ������ StringBuilder � ���
		// ������ append.

		TestClass test = new TestStringBuilder();

		test.Init();
		test.Test();

	}

}
