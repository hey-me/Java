package ch06_클래스.예제;

public class P228_ex_FieldInitValue {

	public static void main(String[] args) {

		FieldInitValue fiv = new FieldInitValue();

		System.out.println("ByteField : " + fiv.byteField);
		System.out.println("shortField : " + fiv.shortField);
		System.out.println("intField : " + fiv.intField);
		System.out.println("longField : " + fiv.longField);
		System.out.println("booleanField : " + fiv.booleanField);
		System.out.println("charField : " + fiv.charField);
		System.out.println("floatField : " + fiv.floatField);
		System.out.println("doubleField : " + fiv.doubleField);
		System.out.println("arrField : " + fiv.arrField);
		System.out.println("referenceField : " + fiv.referenceField);
	}

}

class FieldInitValue {
	byte byteField;
	short shortField;
	int intField;
	long longField;

	boolean booleanField;
	char charField;

	float floatField;
	double doubleField;

	int[] arrField;
	String referenceField;
}