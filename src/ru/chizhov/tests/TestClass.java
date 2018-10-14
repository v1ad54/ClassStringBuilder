package ru.chizhov.tests;

public abstract class TestClass {

	public abstract void Init();

	public abstract void Test();

	public static void TestPerformance(Appendable obj) throws java.io.IOException {
		// узнаем текущее время до теста
		long before = System.currentTimeMillis();
		for (int i = 0; i++ < 1e9;) {
			obj.append("");
		}
		// узнаем текущее время после теста
		long after = System.currentTimeMillis();
		// выводим результат
		System.out.println(obj.getClass().getSimpleName() + ": " + (after - before) + "ms.");
	}
}
