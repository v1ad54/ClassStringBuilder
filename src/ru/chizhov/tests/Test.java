package ru.chizhov.tests;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// Ёксперименты работы с классом StringBuilder и StringBuffer предназначенных
		// дл€ построени€ строк.
		// »сповать сцепление строк (оператором +) не эффективно, т.к. при каждом
		// сцеплении создаетс€ новый объект типа String, на что расходуетс€ пам€ть и
		// врем€. ¬место этого следует использовать объект класса StringBuilder или
		// StringBuffer и их методы append.
		// StringBuilder Ч класс, что представл€ет измен€емую последовательность
		// символов.  ласс был введен в Java 5 и имеет полностью идентичный API с
		// StringBuffer. ≈динственное отличие Ч StringBuilder не синхронизирован. Ёто
		// означает, что его использование в многопоточных средах есть нежелательным.
		// —ледовательно, если вы работаете с многопоточностью, ¬ам идеально подходит
		// StringBuffer, иначе используйте StringBuilder, который работает намного
		// быстрее в большинстве реализаций.

		System.out.println("ClassStringBuilder");
		TestClass testBuilder = new TestStringBuilder();
		testBuilder.Test();

		System.out.println("\nClassStringBuffer");
		TestClass testBuffer = new TestStringBuffer();
		testBuffer.Test();

		System.out.println("\n¬рем€ работы классов:");
		TestClass.TestPerformance(new StringBuffer(""));
		TestClass.TestPerformance(new StringBuilder(""));

	}

}
