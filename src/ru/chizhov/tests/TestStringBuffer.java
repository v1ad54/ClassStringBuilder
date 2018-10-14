package ru.chizhov.tests;

public class TestStringBuffer extends TestClass {

	private StringBuffer strBuffer;

	public TestStringBuffer() {
		super();
		Init();
	}

	@Override
	public void Init() {
		strBuffer = new StringBuffer();
	}

	@Override
	public void Test() {

		// public StringBuffer append(String str)
		// public StringBuffer append(char c)
		// � �.�.
		// ������������� ������ append, ���������� ������� ������ ����������� �����
		strBuffer.append("�����������").append('\t').append("����������");
		System.out.println(strBuffer.toString());

		// public StringBuffer appendCodePoint(int codePoint)
		// ��������� ������� �����, ���������� �� � ���� ��� ��� ������� �������,
		// ���������� this
		strBuffer.append('\t').appendCodePoint(201).appendCodePoint(205).appendCodePoint(187);
		System.out.println(strBuffer.toString());

		// ������������� ������ ��������� �� ������ ��������� � ������� ��������� �
		// ������ ���������
		strBuffer.setCharAt(3, 'A');
		System.out.println(strBuffer.toString());

		// public StringBuffer insert(int offset, String str)
		// ��� ������������� �������
		// ��������� ������ �������� � ������� ��������� � ������ ���������
		strBuffer.insert(12, "��� ��� �\t");
		System.out.println(strBuffer.toString());

		// public StringBuffer delete(int start, int end)
		// ������� ������� ������� � ������� �� start �� end-1
		strBuffer.delete(12, 22);
		System.out.println(strBuffer.toString());

		// public String toString()
		// ����� toString ���������� ������ ���������� �� �� ������ ��� � ������
		// ����������� �����
	}

}
