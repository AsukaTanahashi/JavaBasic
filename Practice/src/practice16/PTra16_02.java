/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b = true;
		Boolean ob = new Boolean(b);
		System.out.println(ob);

		byte by = 100;
		Byte oby = new Byte(by);
		System.out.println(oby);

		short s = 300;
		Short os = new Short(s);
		System.out.println(os);

		char c = '日';
		Character oc = new Character(c);
		System.out.println(oc);

		int i = 1000;
		Integer oi = new Integer(i);
		System.out.println(oi);

		long l = 2000L;
		Long ol = new Long(l);
		System.out.println(ol);

		float f = 3.14F;
		Float of = new Float(f);
		System.out.println(of);

		double d = 453.592;
		Double od = new Double(d);
		System.out.println(od);

		// ★ 上記基本型を、それぞれのラッパークラスに代入してください
	}
}
