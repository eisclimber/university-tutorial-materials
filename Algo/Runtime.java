package main;

import java.util.Arrays;

public class Runtime {	
	
	// Geben sie die Worst-Case-Laufzeit (in Abhängigkeit von data.length) an
	// Schreiben sie method1 als for-Schleife ohne "for (int i: data)" zu nutzen,
	// als while- und do-while-Schleife
	public static int method0(int[] data) {
		int result = 0;
		for (int i: data) {
			result += i;
		}
		return result;
	}
	
	// Geben sie die Worst-Case-Laufzeit an 
	public static int method1(int n) {
		int result = 0;
		for (int i = n; n >= 0; i--) {
			result += i;
		}
		return result;
	}
	
	// Geben sie die Worst-Case-Laufzeit und das Ergebnis der Funktion an 
	public static int method2(int n) {
		n = 10;
		return method1(n);
	}
	
	/*
	 * Laufzeit: Für jedes n wird method1() mit n = 10 aufgerufen. Somit ist die Laufzeit konstant, also in O(1)
	 * Ergebnis: method1() berechent die Summe von 1 bis n-1, also berechnet method2() die von 1 bis 9 = 45
	 */
	
	// Geben sie die Worst-Case-Laufzeit an 
	public int method3(int n) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			method1(i);
		}
		return result;
	}
	
	/*
	 * Laufzeit: Es wird n Mal method1() mit i aufgerufen. 
	 * Da immer i<n schätzen wir die Laufzeit von method1(i) nach oben mit O(n) ab.
	 * (sum(0) +...+ sum(n-1) <= sum(n) +...+ sum(n-1))
	 * Somit ergibt sich n * O(n), also gesammt O(n^2)
	 */
	
	
	// Geben Sie die Worst-Case-Laufzeit und das Ergebnis für n=10
	public static int method4(int n) {
		int result = 0;
		for (int i = 0; i < n; i++)
			i++;
			result += n;
		return result;
	}
	
	/*
	 * Laufzeit: Aufgrund der fehlenden 
	 */
	
	
	// Vereinfachen Sie und berechnen Sie die Worst-Case-Laufzeit
	public static boolean method5(int[] array) {
		for (int i : array) {
			if (i == 0) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	// Vereinfachen Sie und geben sie die Worst-Case-Laufzeit, die Anzahl und das Ergebnis der Additionen für n=10
	// (Ignorieren sie Inkrementierungen)
	public static int method6(int n) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; i++) {
				if (j == 0) {
					result += i;
				}
			}
		}
		return result;
	}
	
	// Geben sie die Worst-Case-Laufzeit (in Abhängigkeit data.length) an
	public static boolean method7(boolean[] data) {
		boolean result = true;
		for (int i = 0; i < data.length; i++) {
			for (int j = data.length - 1; j > 0; j /= 2) {
				result &= data[j];
			}
		}
		return result;
	}
	
	
	// Geben sie die Worst-Case-Laufzeit (in Abhängigkeit data.length) an
	public static boolean method8(boolean[] data) {
		if (data.length == 0) {
			return false;
		} else if (data.length < 3) {
			return data[0];
		} else {
			return method8(Arrays.copyOfRange(data, 0, data.length / 3));
		}
	}
}
