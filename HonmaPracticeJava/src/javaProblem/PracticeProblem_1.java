package javaProblem;
/*
 * 目的：基本勉強（動くプログラム）
 * 内容：Javaの基本プログラムを理解する。
 * 作成者：本間夏海
 */

import java.util.ArrayList;
import java.util.List;

public class PracticeProblem_1 {

	public static void main(String[] args) {
		List<String> kihonDataList = new ArrayList<String>();
		// 配列内容
		kihonDataList.add("なおこ");
		kihonDataList.add("かつすけ");
		kihonDataList.add("のぶこ");
		kihonDataList.add("なつみ");
		kihonDataList.add("さつき");
		kihonDataList.add("ゆずき");
		
		// 分岐処理
		// 「なつみ」が含まれている判定
		if (kihonDataList.contains("なつみ")) {
			System.out.println("分岐処理＝配列に「なつみ」がふくまれている");
		}
		// 要素番号「3」に「なつみ」があるかどうか判定
		if (kihonDataList.get(3).equals("なつみ")) {
			System.out.println("分岐処理＝配列3番目に「なつみ」がはいっている");
		}
		
		// フラグで判定
		// 要素番号「3」に「なつみ」があるかどうか判定
		boolean isNatsumi = false;
		if (kihonDataList.get(3).equals("なつみ")) {
			isNatsumi = true;
		}
		if (isNatsumi) {
			System.out.println("フラグ判定＝配列3番目に「なつみ」がはいっている");
		}
		
		// ループ処理
		// 配列に「なつみ」があるかどうか判定
		for (int i = 0; i < kihonDataList.size(); i++) {
			if (kihonDataList.get(i).equals("なつみ")) {
				System.out.println("フラグ判定＝配列に「なつみ」がはいっている");
				break;
			}
		}
		System.out.println(kihonDataList);
	}
}
