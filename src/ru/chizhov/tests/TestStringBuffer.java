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
		// и т.д.
		// Перегруженные методы append, возвращают текущий объект построителя строк
		strBuffer.append("Абракадабра").append('\t').append("Симсалабим");
		System.out.println(strBuffer.toString());

		// public StringBuffer appendCodePoint(int codePoint)
		// Добавляет кодовую точку, преобразуя ее в одну или две кодовые единицы,
		// возврацает this
		strBuffer.append('\t').appendCodePoint(201).appendCodePoint(205).appendCodePoint(187);
		System.out.println(strBuffer.toString());

		// Устанавливает символ указанный во втором аргументе в позицию указанную в
		// первом аргументе
		strBuffer.setCharAt(3, 'A');
		System.out.println(strBuffer.toString());

		// public StringBuffer insert(int offset, String str)
		// ряд перегруженных функций
		// Вставляет второй аргумент в позицию указанную в первом аргументе
		strBuffer.insert(12, "тут был я\t");
		System.out.println(strBuffer.toString());

		// public StringBuffer delete(int start, int end)
		// Удаляет кодовые единицы с позиций от start до end-1
		strBuffer.delete(12, 22);
		System.out.println(strBuffer.toString());

		// public String toString()
		// Метод toString возвращает строку содержащую те же данные что и объект
		// построителя строк
	}

}
