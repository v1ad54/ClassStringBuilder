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
		// и т.д.
		// Перегруженные методы append, возвращают текущий объект построителя строк
		strBuilder.append("Абракадабра").append('\t').append("Симсалабим");
		System.out.println(strBuilder.toString());

		// public StringBuilder appendCodePoint(int codePoint)
		// Добавляет кодовую точку, преобразуя ее в одну или две кодовые единицы,
		// возврацает this
		strBuilder.append('\t').appendCodePoint(201).appendCodePoint(205).appendCodePoint(187);
		System.out.println(strBuilder.toString());

		// Устанавливает символ указанный во втором аргументе в позицию указанную в
		// первом аргументе
		strBuilder.setCharAt(3, 'A');
		System.out.println(strBuilder.toString());

		// public StringBuilder insert(int offset, String str)
		// ряд перегруженных функций
		// Вставляет второй аргумент в позицию указанную в первом аргументе
		strBuilder.insert(12, "тут был я\t");
		System.out.println(strBuilder.toString());

		// public StringBuilder delete(int start, int end)
		// Удаляет кодовые единицы с позиций от start до end-1
		strBuilder.delete(12, 22);
		System.out.println(strBuilder.toString());

		// public String toString()
		// Метод toString возвращает строку содержащую те же данные что и объект
		// построителя строк
	}

}
