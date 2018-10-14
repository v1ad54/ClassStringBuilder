package ru.chizhov.tests;

public class TestStringBuilder extends TestClass {

	private StringBuilder strBuilder;

	public TestStringBuilder() {
		super();
		Init();
	}

	@Override
	public void Init() {
		strBuilder = new StringBuilder();
	}

	@Override
	public void Test() {

		// public StringBuilder append(String str)
		// public StringBuilder append(char c)
		// � �.�.
		// ������������� ������ append, ���������� ������� ������ ����������� �����
		strBuilder.append("�����������").append('\t').append("����������");
		System.out.println(strBuilder.toString());

		// public StringBuilder appendCodePoint(int codePoint)
		// ��������� ������� �����, ���������� �� � ���� ��� ��� ������� �������,
		// ���������� this
		strBuilder.append('\t').appendCodePoint(201).appendCodePoint(205).appendCodePoint(187);
		System.out.println(strBuilder.toString());

		// ������������� ������ ��������� �� ������ ��������� � ������� ��������� �
		// ������ ���������
		strBuilder.setCharAt(3, 'A');
		System.out.println(strBuilder.toString());

		// public StringBuilder insert(int offset, String str)
		// ��� ������������� �������
		// ��������� ������ �������� � ������� ��������� � ������ ���������
		strBuilder.insert(12, "��� ��� �\t");
		System.out.println(strBuilder.toString());

		// public StringBuilder delete(int start, int end)
		// ������� ������� ������� � ������� �� start �� end-1
		strBuilder.delete(12, 22);
		System.out.println(strBuilder.toString());

		// public String toString()
		// ����� toString ���������� ������ ���������� �� �� ������ ��� � ������
		// ����������� �����
	}

}
