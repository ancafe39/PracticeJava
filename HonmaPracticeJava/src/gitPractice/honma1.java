package gitPractice;
/*
 * 目的：AKBさん現場での修正方法の事前確認
 * 内容：
 * ①配列(Max:6)の中に経営企画部がセットされていたら、なにもしない
 * ②配列(Max:6)の中にブランクがある場合、経営企画部をセットする
 * ③配列(Max:6)の中に6つのデータがすでにある場合、メッセージを表示する。
 * 以下、プラスα
 * ④配列(Max:6)の中に経営区花き部がセットされていたら、メッセージを表示する。
 * 作成者：本間夏海
 */

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Objects;

public class honma1 {

	public static void main(String[] args) {
		List<String> inputDeptList = new ArrayList<String>();
		// 配列内容
		inputDeptList.add("001");
		inputDeptList.add("002");
		inputDeptList.add("003");
		inputDeptList.add("004");
		inputDeptList.add("");
		inputDeptList.add("006");
		
		// 経営企画部
		String keieikikaku = "003";
		
		boolean maxMassageFlg = false;
		boolean alreadyMassageFlg = false;
		// 出力（確認用）
		for (int i = 0; i < inputDeptList.size(); i++) {
			
			if (inputDeptList.get(i).equals("")) {
				
				// 経営企画部が含まれていない場合、経営企画部をセット
				maxMassageFlg = true;
				if (!inputDeptList.contains(keieikikaku)) {
					inputDeptList.set(i, keieikikaku);
				} else {
					alreadyMassageFlg = true;
				}
			}
			
			System.out.println(inputDeptList.get(i));
		}
		System.out.println(inputDeptList);
		if (alreadyMassageFlg) {
			System.out.println("すでに経営企画部が設定されているため追加できませんでした");
		}
		if (!maxMassageFlg) {
			System.out.println("すでに協議先が6件まで設定されているため追加できませんでした");
		}
		
		/*
		 * for (int i = 0; i < inputDeptList.size(); i++) {
		 * System.out.println(inputDeptList.get(i)); }
		 */
	}
}
