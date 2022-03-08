package javaProblem;

/*
 * 目的：基本勉強（動くプログラム）
 * 内容：Javaの基本プログラムを理解する。
 * 作成者：本間夏海
 */

import java.util.ArrayList;
import java.util.List;

public class PracticeProblem_2 {

	public static void main(String[] args) {
		// 練習問題 1-1
		// “Hello World”と表示するプログラムを作成しなさい。
		System.out.println("練習問題 1-1");
		System.out.println("Hello World");
		
		
		// 練習問題 1-2
		// int 型の変数 x に数値 11 を代入し、x の値を“x=11”のように表示するプログラムを作成しなさい。
		int x;
		x = 11;
		System.out.println("練習問題 1-2");
		System.out.println("x=" + x);
		
		
		// 練習問題 1-3
		// int 型の変数 x、y に数値 13、17 を代入し、x、y の値を“x=13,y=17”のように表示するプログラムを作成しなさい。
		int y;
		x = 13;
		y = 17;
		System.out.println("練習問題 1-3");
		System.out.println("x=" + x + ",y=" + y);
		
		
		// 練習問題 1-4
		// int 型の変数 x に数値 13 と 17 の和を代入し、x の値を表示するプログラムを作成しなさい。
		x = 13 + 17;
		System.out.println("練習問題 1-4");
		System.out.println("x=" + x);
		
		
		// 練習問題 1-5
		// 数値 13 と 17 の積を表示するプログラムを作成しなさい。ただし、変数を使用しないこと。
		// ※ System.out.println()の引数部分で演算を行う。
		System.out.println("練習問題 1-5");
		System.out.println( 13 * 17 );
		
		
		// 練習問題 1-6
		// 次のプログラムを作成しなさい。
		// int 型の変数 x に数値 7 を代入する。
		// 変数 x の値を 3 倍にする。
		// 変数 x の値を表示する。
		// 変数 x の値を半分（1/2）にする。
		// 変数 x の値を表示する。
		x = 7;
		x *= 3;
		System.out.println("練習問題 1-6");
		System.out.println( "x=" + x );
		x /= 2;
		System.out.println( "x=" + x );
		
		
		// 練習問題 1-7
		// int 型の変数 x、y に任意の数値を代入し、
		// x の値を y に、y の値を x に入れ替えて x と y の値を表示するプログラムを作成しなさい。
		// ※ 	xとy以外に、もうひとつ変数が必要となる。
		// x = 3;
		// y = 7;
		// ここでxとyの値を入れ替える
		// System.out.println( "x=" + x + ",y=" + y );
		int t;
		x = 3;
		y = 7;
		t = x;
		x = y;
		y = t;
		System.out.println("練習問題 1-7");
		System.out.println( "x=" + x + ",y=" + y );
		
		
		// 練習問題 1-8
		// int 型の変数 x、y に数値 19、23 を代入し、
		// その積を変数 z に代入して z の値を表示するプログラムを作成しなさい。
		int z;
		x = 19;
		y = 23;
		z = x * y;
		System.out.println("練習問題 1-8");
		System.out.println( "z=" + z );
		
		
		// 練習問題 1-9
		// int 型の変数 x に任意の数値を代入し、
		// x を 2 倍、3 倍、4 倍した結果を表示するプログラムを作成しなさい。
		x = 12;
		System.out.println("練習問題 1-9");
		System.out.println( x * 2 );
		System.out.println( x * 3 );
		System.out.println( x * 4 );
		
		
		// 練習問題 1-10
		// int 型の変数 x に任意の数値を代入し、
		// x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。
		x = 3;
		System.out.println("練習問題 1-10");
		System.out.println( x );
		System.out.println( x * x );
		System.out.println( x * x * x );
		
		
		// 練習問題 1-11
		// int 型の変数 x に任意の数値を代入し、
		// x を x より小さい任意の数値で割った商と余りを表示するプログラムを作成しなさい。
		x = 13;
		System.out.println("練習問題 1-11");
		System.out.println( "商=" + ( x / 5 ) + ", 余り=" + ( x % 5 ) );
		
		
		
		// 練習問題 1-12
		// int 型の変数 x に任意の数値を代入し、
		// インクリメント演算子、デクリメント演算子を適用して結果を表示することにより
		// 演算子の効果を確認するプログラムを作成しなさい。
		x = 10;
		x++;
		System.out.println("練習問題 1-12");
		System.out.println( x );
		x--;
		x--;
		System.out.println( x );
		
		
		
	}
}
