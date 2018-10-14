package ru.chizhov.tests;

public abstract class TestClass {

	public abstract void Init();

	public abstract void Test();

	public static void TestPerformance(Appendable obj) throws java.io.IOException {
		// ������ ������� ����� �� �����
		long before = System.currentTimeMillis();
		for (int i = 0; i++ < 1e9;) {
			obj.append("");
		}
		// ������ ������� ����� ����� �����
		long after = System.currentTimeMillis();
		// ������� ���������
		System.out.println(obj.getClass().getSimpleName() + ": " + (after - before) + "ms.");
	}
}
