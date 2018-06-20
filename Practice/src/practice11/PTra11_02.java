package practice11;
/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */



public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します

		Book[] book = FileReaderClass.readBookDataFile();
		//int型配列の中にはintのインスタンス,String型配列の中にはStringのインスタンス,
		//book型配列の中にはbookのインスタンスが入っている。

		System.out.println("探したい本のタイトル（又はその一部）を入力してください");
		String input = new java.util.Scanner(System.in).nextLine();

		for (int i = 0; i < book.length; i++) {
			if(book[i].title.contains(input)) {
				// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください
				System.out.println(book[i].dispBookInfo());
			}
		}

	}
}
