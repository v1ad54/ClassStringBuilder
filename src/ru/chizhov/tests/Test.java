package ru.chizhov.tests;

public class Test {

	public static void main(String[] args) {
		// Ёксперименты работы с классом StringBuilder предназначенным дл€ построени€
		// строк.
		// »сповать сцепление строк (оператором +) не эффективно, т.к. при каждом
		// сцеплении создаетс€ новый объект типа String, на что расходуетс€ пам€ть и
		// врем€. ¬место этого следует использовать объект класса StringBuilder и его
		// методы append.

		TestClass test = new TestStringBuilder();

		test.Init();
		test.Test();

	}

}
