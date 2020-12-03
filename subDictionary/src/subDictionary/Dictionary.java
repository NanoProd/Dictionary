package subDictionary;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Dictionary {
	// attributes
	private int count;
	private String fileName;
	private ArrayList<String> A;
	private ArrayList<String> B;
	private ArrayList<String> C;
	private ArrayList<String> D;
	private ArrayList<String> E;
	private ArrayList<String> F;
	private ArrayList<String> G;
	private ArrayList<String> H;
	private ArrayList<String> I;
	private ArrayList<String> J;
	private ArrayList<String> K;
	private ArrayList<String> L;
	private ArrayList<String> M;
	private ArrayList<String> N;
	private ArrayList<String> O;
	private ArrayList<String> P;
	private ArrayList<String> Q;
	private ArrayList<String> R;
	private ArrayList<String> S;
	private ArrayList<String> T;
	private ArrayList<String> U;
	private ArrayList<String> V;
	private ArrayList<String> W;
	private ArrayList<String> X;
	private ArrayList<String> Y;
	private ArrayList<String> Z;

	// setters
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	//increase count
	public void increaseCount(){
		count++;
	}
	// getters
	public int getCount() {
		return count;
	}

	public String getFileName() {
		return fileName;
	}

	// constructors
	public Dictionary() {
		count = 0;
		fileName = "";
		A = new ArrayList<String>();
		B = new ArrayList<String>();
		C = new ArrayList<String>();
		D = new ArrayList<String>();
		E = new ArrayList<String>();
		F = new ArrayList<String>();
		G = new ArrayList<String>();
		H = new ArrayList<String>();
		I = new ArrayList<String>();
		J = new ArrayList<String>();
		K = new ArrayList<String>();
		L = new ArrayList<String>();
		M = new ArrayList<String>();
		N = new ArrayList<String>();
		O = new ArrayList<String>();
		P = new ArrayList<String>();
		Q = new ArrayList<String>();
		R = new ArrayList<String>();
		S = new ArrayList<String>();
		T = new ArrayList<String>();
		U = new ArrayList<String>();
		V = new ArrayList<String>();
		W = new ArrayList<String>();
		X = new ArrayList<String>();
		Y = new ArrayList<String>();
		Z = new ArrayList<String>();
	}

	public Dictionary(String fileName) {
		count = 0;
		this.fileName = fileName;
		A = new ArrayList<String>();
		B = new ArrayList<String>();
		C = new ArrayList<String>();
		D = new ArrayList<String>();
		E = new ArrayList<String>();
		F = new ArrayList<String>();
		G = new ArrayList<String>();
		H = new ArrayList<String>();
		I = new ArrayList<String>();
		J = new ArrayList<String>();
		K = new ArrayList<String>();
		L = new ArrayList<String>();
		M = new ArrayList<String>();
		N = new ArrayList<String>();
		O = new ArrayList<String>();
		P = new ArrayList<String>();
		Q = new ArrayList<String>();
		R = new ArrayList<String>();
		S = new ArrayList<String>();
		T = new ArrayList<String>();
		U = new ArrayList<String>();
		V = new ArrayList<String>();
		W = new ArrayList<String>();
		X = new ArrayList<String>();
		Y = new ArrayList<String>();
		Z = new ArrayList<String>();
	}

	// Method to find first character of word to store in right arraylist
	public static String firstChar(String word) {
		String temp = word.substring(0, 1);
		temp.toUpperCase();
		switch (temp) {
			case "A":
				return "A";
			case "B":
				return "B";
			case "C":
				return "C";
			case "D":
				return "D";
			case "E":
				return "E";
			case "F":
				return "F";
			case "G":
				return "G";
			case "H":
				return "H";
			case "I":
				return "I";
			case "J":
				return "J";
			case "K":
				return "K";
			case "L":
				return "L";
			case "M":
				return "M";
			case "N":
				return "N";
			case "O":
				return "O";
			case "P":
				return "P";
			case "Q":
				return "Q";
			case "R":
				return "R";
			case "S":
				return "S";
			case "T":
				return "T";
			case "U":
				return "U";
			case "V":
				return "V";
			case "W":
				return "W";
			case "X":
				return "X";
			case "Y":
				return "Y";
			case "Z":
				return "Z";
			default:
				System.out.println("Error with first char");
				return "";
		}
	}

	// method to search for illegal characters
	public static boolean illegalChar(String word) {
		int index;
		// check for question mark -- false if contains illegal version of question
		// mark, i.e not at end of word
		if ((word.indexOf("?")) >= 0) {
			index = word.indexOf("?");
			if (index != (word.length() - 1)) {
				return false;
			}
		}
		// check for : -- false if it appears and is not at end of word
		if ((word.indexOf(":")) >= 0) {
			index = word.indexOf(":");
			if (index != (word.length() - 1)) {
				return false;
			}
		}
		// check for apostrophe -- can only appear in front of m or s
		if ((word.indexOf("'")) >= 0) {
			index = word.indexOf("'");
			if (index == word.length() - 1) {
				return false;
			}
			char temp = word.charAt(index + 1);
			String next = Character.toString(temp);
			if ((next.equalsIgnoreCase("m")) || (next.equalsIgnoreCase("s"))) {

			} else {
				return false;
			}
		}
		//check for different type of apostrophe
		if ((word.indexOf("’")) >= 0) {
			index = word.indexOf("’");
			if (index == word.length() - 1) {
				return false;
			}
			char temp = word.charAt(index + 1);
			String next = Character.toString(temp);
			if ((next.equalsIgnoreCase("m")) || (next.equalsIgnoreCase("s"))) {

			} else {
				return false;
			}
		}
		// check for , -- can only appear at end of word
		if ((word.indexOf(",")) >= 0) {
			index = word.indexOf(",");
			if (index != (word.length() - 1)) {
				return false;
			}
		}

		// check for = sign, if word contains it it is an invalid word so returns false
		if ((word.indexOf("=")) >= 0) {
			return false;
		}
		// check for semi-colon -- only appears at end of a word
		if ((word.indexOf(";")) >= 0) {
			index = word.indexOf(";");
			if (index != (word.length() - 1)) {
				return false;
			}
		}
		// check for exclamation mark -- only appears at end of a word
		if ((word.indexOf("!")) >= 0) {
			index = word.indexOf("!");
			if (index != (word.length() - 1)) {
				return false;
			}
		}
		// check for period -- only appears at the end of a word
		if ((word.indexOf(".")) >= 0) {
			index = word.indexOf(".");
			if (index != (word.length() - 1)) {
				return true;
			}
		}
		// check for numbers - dates or any word containing a number is not recorded
		for (int i = 0; i < 10; i++) {
			String tempp = Integer.toString(i);
			if ((word.indexOf(tempp)) >= 0) {
				return false;
			}
		}
		// check for single characters except a and i (ignore case)
		if (word.length() == 1) {
			if ((word.equalsIgnoreCase("a")) || (word.equalsIgnoreCase("i"))) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	// methods to take out special characters (if any) -- use
	// containsIllegalCharacter before to make sure word is valid -- return upper
	// case word
	public static String extract(String word) {
		@SuppressWarnings("unused")
		int index;
		String str;
		// check for question mark -- true if contains illegal version of question mark,
		// i.e not at end of word
		if ((word.indexOf("?")) >= 0) {
			index = word.indexOf("?");
			str = word.substring(0, word.length() - 1);
			str = str.toUpperCase();
			return str;
		}
		// check for : -- true if it appears and is not at end of word
		if ((word.indexOf(":")) >= 0) {
			index = word.indexOf(":");
			str = word.substring(0, word.length() - 1);
			str = str.toUpperCase();
			return str;
		}
		// check for apostrophes -- can only appear in front of m or s, if not returns
		// true
		if ((word.indexOf("'")) >= 0) {
			index = word.indexOf("'");
			str = word.substring(0, index);
			str = str.toUpperCase();
			return str;
		}
		//different type of apostrophee
		if ((word.indexOf("’")) >= 0) {
			index = word.indexOf("’");
			str = word.substring(0, index);
			str = str.toUpperCase();
			return str;
		}
		// check for , -- can only appear at end of word
		if ((word.indexOf(",")) >= 0) {
			index = word.indexOf(",");
			str = word.substring(0, word.length() - 1);
			str = str.toUpperCase();
			return str;
		}
		// check for semi-colon -- only appears at end of a word
		if ((word.indexOf(";")) >= 0) {
			index = word.indexOf(";");
			str = word.substring(0, word.length() - 1);
			str = str.toUpperCase();
			return str;
		}
		// check for exclamation mark -- only appears at end of a word
		if ((word.indexOf("!")) >= 0) {
			index = word.indexOf("!");
			str = word.substring(0, word.length() - 1);
			str = str.toUpperCase();
			return str;
		}
		// check for period -- only appears at the end of a word
		if ((word.indexOf(".")) >= 0) {
			index = word.indexOf(".");
			str = word.substring(0, word.length() - 1);
			str = str.toUpperCase();
			return str;
		}
		str = word;
		str = str.toUpperCase();
		return str;
	}

	// main method for testing
	public static void main(String args[]) {

		// ask user what the file name is
		Scanner ip = new Scanner(System.in);
		System.out.println("Please enter the file name: ");
		String file = ip.nextLine();

		// initialize dictionaly with that file name
		Dictionary dict = new Dictionary(file);

		// init arraylists for every letter in the alphabet and store it in an object
		// array
		dict.A.add("A");
		dict.A.add("==");
		dict.B.add("B");
		dict.B.add("==");
		dict.C.add("C");
		dict.C.add("==");
		dict.D.add("D");
		dict.D.add("==");
		dict.E.add("E");
		dict.E.add("==");
		dict.F.add("F");
		dict.F.add("==");
		dict.G.add("G");
		dict.G.add("==");
		dict.H.add("H");
		dict.H.add("==");
		dict.I.add("I");
		dict.I.add("==");
		dict.J.add("J");
		dict.J.add("==");
		dict.K.add("K");
		dict.K.add("==");
		dict.L.add("L");
		dict.L.add("==");
		dict.M.add("M");
		dict.M.add("==");
		dict.N.add("N");
		dict.N.add("==");
		dict.O.add("O");
		dict.O.add("==");
		dict.P.add("P");
		dict.P.add("==");
		dict.Q.add("Q");
		dict.Q.add("==");
		dict.R.add("R");
		dict.R.add("==");
		dict.S.add("S");
		dict.S.add("==");
		dict.T.add("T");
		dict.T.add("==");
		dict.U.add("U");
		dict.U.add("==");
		dict.V.add("V");
		dict.V.add("==");
		dict.W.add("W");
		dict.W.add("==");
		dict.X.add("X");
		dict.X.add("==");
		dict.Y.add("Y");
		dict.Y.add("==");
		dict.Z.add("Z");
		dict.Z.add("==");

		// read from the file
		BufferedReader inputStream;
		try {
			inputStream = new BufferedReader(new FileReader(dict.getFileName()));
			String line;
			boolean valid = true;
			while (valid) {
				line = inputStream.readLine();
				if (line == null) {
					break;
				}
				if (line.length() == 0) {
					continue;
				}
				String[] words = line.split(" ");
				for (int i = 0; i < words.length; i++) {
					if (illegalChar(words[i])) {
						String word = extract(words[i]);
						switch (firstChar(word)) {
							case "A":
								if (dict.A.contains(word)) {
									break;
								}
								dict.A.add(word);
								dict.increaseCount();
								break;
							case "B":
								if (dict.B.contains(word)) {
									break;
								}
								dict.B.add(word);
								dict.increaseCount();
								break;
							case "C":
								if (dict.C.contains(word)) {
									break;
								}
								dict.C.add(word);
								dict.increaseCount();
								break;
							case "D":
								if (dict.D.contains(word)) {
									break;
								}
								dict.D.add(word);
								dict.increaseCount();
								break;
							case "E":
								if (dict.E.contains(word)) {
									break;
								}
								dict.E.add(word);
								dict.increaseCount();
								break;
							case "F":
								if (dict.F.contains(word)) {
									break;
								}
								dict.F.add(word);
								dict.increaseCount();
								break;
							case "G":
								if (dict.G.contains(word)) {
									break;
								}
								dict.G.add(word);
								dict.increaseCount();
								break;
							case "H":
								if (dict.H.contains(word)) {
									break;
								}
								dict.H.add(word);
								dict.increaseCount();
								break;
							case "I":
								if (dict.I.contains(word)) {
									break;
								}
								dict.I.add(word);
								dict.increaseCount();
								break;
							case "J":
								if (dict.J.contains(word)) {
									break;
								}
								dict.J.add(word);
								dict.increaseCount();
								break;
							case "K":
								if (dict.K.contains(word)) {
									break;
								}
								dict.K.add(word);
								dict.increaseCount();
								break;
							case "L":
								if (dict.L.contains(word)) {
									break;
								}
								dict.L.add(word);
								dict.increaseCount();
								break;
							case "M":
								if (dict.M.contains(word)) {
									break;
								}
								dict.M.add(word);
								dict.increaseCount();
								break;
							case "N":
								if (dict.N.contains(word)) {
									break;
								}
								dict.N.add(word);
								dict.increaseCount();
								break;
							case "O":
								if (dict.O.contains(word)) {
									break;
								}
								dict.O.add(word);
								dict.increaseCount();
								break;
							case "P":
								if (dict.P.contains(word)) {
									break;
								}
								dict.P.add(word);
								dict.increaseCount();
								break;
							case "Q":
								if (dict.Q.contains(word)) {
									break;
								}
								dict.Q.add(word);
								dict.increaseCount();
								break;
							case "R":
								if (dict.R.contains(word)) {
									break;
								}
								dict.R.add(word);
								dict.increaseCount();
								break;
							case "S":
								if (dict.S.contains(word)) {
									break;
								}
								dict.S.add(word);
								dict.increaseCount();
								break;
							case "T":
								if (dict.T.contains(word)) {
									break;
								}
								dict.T.add(word);
								dict.increaseCount();
								break;
							case "U":
								if (dict.U.contains(word)) {
									break;
								}
								dict.U.add(word);
								dict.increaseCount();
								break;
							case "V":
								if (dict.V.contains(word)) {
									break;
								}
								dict.V.add(word);
								dict.increaseCount();
								break;
							case "W":
								if (dict.W.contains(word)) {
									break;
								}
								dict.W.add(word);
								dict.increaseCount();
								break;
							case "X":
								if (dict.X.contains(word)) {
									break;
								}
								dict.X.add(word);
								dict.increaseCount();
								break;
							case "Y":
								if (dict.Y.contains(word)) {
									break;
								}
								dict.Y.add(word);
								dict.increaseCount();
								break;
							case "Z":
								if (dict.Z.contains(word)) {
									break;
								}
								dict.Z.add(word);
								dict.increaseCount();
								break;
							default:
								System.out.println("Unusual behaviour");
								break;
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
			System.exit(0);
		} catch (IOException e) {
			System.out.println(e.toString());
			System.exit(0);
		}

		//sort the craeted array lists alphabetically
		dict.A.sort(String::compareToIgnoreCase);
		dict.B.sort(String::compareToIgnoreCase);
		dict.C.sort(String::compareToIgnoreCase);
		dict.D.sort(String::compareToIgnoreCase);
		dict.E.sort(String::compareToIgnoreCase);
		dict.F.sort(String::compareToIgnoreCase);
		dict.G.sort(String::compareToIgnoreCase);
		dict.H.sort(String::compareToIgnoreCase);
		dict.I.sort(String::compareToIgnoreCase);
		dict.J.sort(String::compareToIgnoreCase);
		dict.K.sort(String::compareToIgnoreCase);
		dict.L.sort(String::compareToIgnoreCase);
		dict.M.sort(String::compareToIgnoreCase);
		dict.N.sort(String::compareToIgnoreCase);
		dict.O.sort(String::compareToIgnoreCase);
		dict.P.sort(String::compareToIgnoreCase);
		dict.Q.sort(String::compareToIgnoreCase);
		dict.R.sort(String::compareToIgnoreCase);
		dict.S.sort(String::compareToIgnoreCase);
		dict.T.sort(String::compareToIgnoreCase);
		dict.U.sort(String::compareToIgnoreCase);
		dict.V.sort(String::compareToIgnoreCase);
		dict.W.sort(String::compareToIgnoreCase);
		dict.X.sort(String::compareToIgnoreCase);
		dict.Y.sort(String::compareToIgnoreCase);
		dict.Z.sort(String::compareToIgnoreCase);




		// write to file
		PrintWriter os = null;
		try {
			os = new PrintWriter(new FileWriter("SubDictionary.txt"));
			os.write("The document produced this sub-dictionary, which includes " + dict.getCount() + " entries." + "\n");
			for (String content : dict.A) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.B) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.C) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.D) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.E) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.F) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.G) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.H) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.I) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.J) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.K) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.L) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.M) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.N) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.O) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.P) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.Q) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.R) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.S) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.T) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.U) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.V) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.W) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.X) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.Y) {
				os.write(content + "\n");
			}
			os.write("\n");
			for (String content : dict.Z) {
				os.write(content + "\n");
			}
			os.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}

	}

}
