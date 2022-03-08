package javaAKB;
/*
 * 目的：AKBさん現場での修正方法の事前確認
 * 内容：「AkibaProject_1_1」の内容の処理を短くする。
 * 作成者：本間夏海
 */

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Objects;

public class AkibaProject_1_2 {

	public static void main(String[] args) {
		List<String> inputDeptList = new ArrayList<String>();
		// 配列内容
		inputDeptList.add("001");
		inputDeptList.add("002");
		inputDeptList.add("aaa");
		inputDeptList.add("004");
		inputDeptList.add("bbb");
		inputDeptList.add("006");
		// 経営企画部
		String keieikikaku = "003";
		
		// すべての協議先が埋まっているフラグ
		boolean maxMassageFlg = false;
		// すでに経営企画部がセットされているフラグ
		boolean isKeieikikakuFlg = false;
		
		// 出力（確認用）
		if (inputDeptList.contains(keieikikaku)) {
			isKeieikikakuFlg = true;
		}
		if (!isKeieikikakuFlg) {
			for (int i = 0; i < inputDeptList.size(); i++) {
				if (inputDeptList.get(i).equals("")) {
					// 経営企画部が含まれていない場合、経営企画部をセット
					maxMassageFlg = true;
					if (!inputDeptList.contains(keieikikaku)) {
						inputDeptList.set(i, keieikikaku);
						break;
					}
				}
			}
			if (!maxMassageFlg) {
				System.out.println("すでに協議先が6件まで設定されているため追加できませんでした");
			}
		}
		System.out.println(inputDeptList);
	}
}
//プラスα分
//if (isKeieikikakuFlg) {
//	System.out.println("すでに経営企画部が設定されているため追加できませんでした");
//}
