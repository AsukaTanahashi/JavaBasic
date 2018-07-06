/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
        ArrayList<Player> array = new ArrayList<Player>();

        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
            	String[] list = line.split(",",0);

            	Player player = new Player();

            	player.setPosition(list[0]);
            	player.setName(list[1]);
            	player.setCountry(list[2]);
            	player.setTeam(list[3]);


                // ★ 1行ごとにArrayListに格納してください
                array.add(player);

            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        Collections.shuffle(array);

        int ct=0;
        int ct2=0;
        int ct3=0;
        int ct4=0;

        for(int i=0;i<array.size();i++) {
        	if(array.get(i).getPosition().contains("GK")) {
        		if(ct<1) {
	        		System.out.println(array.get(i));
	        		ct++;
        		}

        	}

        	if(array.get(i).getPosition().contains("DF")) {
        		if(ct2<4) {
	        		System.out.println(array.get(i));
	        		ct2++;
        		}

        	}

        	if(array.get(i).getPosition().contains("MF")) {
        		if(ct3<4) {
	        		System.out.println(array.get(i));
	        		ct3++;
        		}

        	}

        	if(array.get(i).getPosition().contains("FW")) {
        		if(ct4<2) {
	        		System.out.println(array.get(i));
	        		ct4++;
        		}

        	}
        }

	}
}
