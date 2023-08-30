package org.example;

public class Main {
    public static void main(String[] args) {
        String string = "        5345 #@$ abcdefghijklmnopqrstuvwxyz";
        string = string.trim();
        char[] letters = string.toCharArray();
        String l1 = "", l2 = "", l3 = "", l4 = "", l5 = "", l6 = "", l7 = "";
        String answer = "";

        for (int i = 0; i < letters.length; i++) {
            switch (letters[i]) {
                case 'A':
                case 'a':
                    l1 = l1 + " AAA  ";
                    l2 = l2 + "A   A ";
                    l3 = l3 + "A   A ";
                    l4 = l4 + "AAAAA ";
                    l5 = l5 + "A   A ";
                    l6 = l6 + "A   A ";
                    l7 = l7 + "A   A ";
                    break;
                case 'b':
                case 'B':
                    l1 = l1 + "BBBB  ";
                    l2 = l2 + "B   B ";
                    l3 = l3 + "B   B ";
                    l4 = l4 + "BBBB  ";
                    l5 = l5 + "B   B ";
                    l6 = l6 + "B   B ";
                    l7 = l7 + "BBBB  ";
                    break;
                case 'C':
                case 'c':
                    l1 = l1 + " CCC  ";
                    l2 = l2 + "C   C ";
                    l3 = l3 + "C     ";
                    l4 = l4 + "C     ";
                    l5 = l5 + "C     ";
                    l6 = l6 + "C   C ";
                    l7 = l7 + " CCC  ";
                    break;
                case 'D':
                case 'd':
                    l1 = l1 + "DDDD  ";
                    l2 = l2 + "D   D ";
                    l3 = l3 + "D   D ";
                    l4 = l4 + "D   D ";
                    l5 = l5 + "D   D ";
                    l6 = l6 + "D   D ";
                    l7 = l7 + "DDDD  ";
                    break;
                case 'E':
                case 'e':
                    l1 = l1 + "EEEEE ";
                    l2 = l2 + "E     ";
                    l3 = l3 + "E     ";
                    l4 = l4 + "EEEEE ";
                    l5 = l5 + "E     ";
                    l6 = l6 + "E     ";
                    l7 = l7 + "EEEEE ";
                    break;
                case 'F':
                case 'f':
                    l1 = l1 + "FFFFF ";
                    l2 = l2 + "F     ";
                    l3 = l3 + "F     ";
                    l4 = l4 + "FFFFF ";
                    l5 = l5 + "F     ";
                    l6 = l6 + "F     ";
                    l7 = l7 + "F     ";
                    break;
                case 'G':
                case 'g':
                    l1 = l1 + " GGG  ";
                    l2 = l2 + "G   G ";
                    l3 = l3 + "G     ";
                    l4 = l4 + "G GGG ";
                    l5 = l5 + "G   G ";
                    l6 = l6 + "G   G ";
                    l7 = l7 + " GGG  ";
                    break;
                case 'H':
                case 'h':
                    l1 = l1 + "H   H ";
                    l2 = l2 + "H   H ";
                    l3 = l3 + "H   H ";
                    l4 = l4 + "HHHHH ";
                    l5 = l5 + "H   H ";
                    l6 = l6 + "H   H ";
                    l7 = l7 + "H   H ";
                    break;
                case 'I':
                case 'i':
                    l1 = l1 + "IIIII ";
                    l2 = l2 + "  I   ";
                    l3 = l3 + "  I   ";
                    l4 = l4 + "  I   ";
                    l5 = l5 + "  I   ";
                    l6 = l6 + "  I   ";
                    l7 = l7 + "IIIII ";
                    break;
                case 'J':
                case 'j':
                    l1 = l1 + "JJJJJ ";
                    l2 = l2 + "    J ";
                    l3 = l3 + "    J ";
                    l4 = l4 + "    J ";
                    l5 = l5 + "    J ";
                    l6 = l6 + "    J ";
                    l7 = l7 + "JJJJ  ";
                    break;
                case 'K':
                case 'k':
                    l1 = l1 + "K   K ";
                    l2 = l2 + "K  K  ";
                    l3 = l3 + "K K   ";
                    l4 = l4 + "KK    ";
                    l5 = l5 + "K K   ";
                    l6 = l6 + "K  K  ";
                    l7 = l7 + "K   K ";
                    break;
                case 'L':
                case 'l':
                    l1 = l1 + "L     ";
                    l2 = l2 + "L     ";
                    l3 = l3 + "L     ";
                    l4 = l4 + "L     ";
                    l5 = l5 + "L     ";
                    l6 = l6 + "L     ";
                    l7 = l7 + "LLLLL ";
                    break;
                case 'M':
                case 'm':
                    l1 = l1 + "M   M ";
                    l2 = l2 + "MM MM ";
                    l3 = l3 + "M M M ";
                    l4 = l4 + "M   M ";
                    l5 = l5 + "M   M ";
                    l6 = l6 + "M   M ";
                    l7 = l7 + "M   M ";
                    break;
                case 'N':
                case 'n':
                    l1 = l1 + "N   N ";
                    l2 = l2 + "NN  N ";
                    l3 = l3 + "N   N ";
                    l4 = l4 + "N N N ";
                    l5 = l5 + "N   N ";
                    l6 = l6 + "N  NN ";
                    l7 = l7 + "N   N ";
                    break;
                case 'O':
                case 'o':
                    l1 = l1 + " OOO  ";
                    l2 = l2 + "O   O ";
                    l3 = l3 + "O   O ";
                    l4 = l4 + "O   O ";
                    l5 = l5 + "O   O ";
                    l6 = l6 + "O   O ";
                    l7 = l7 + " OOO  ";
                    break;
                case 'P':
                case 'p':
                    l1 = l1 + "PPPP  ";
                    l2 = l2 + "P   P ";
                    l3 = l3 + "P   P ";
                    l4 = l4 + "PPPP  ";
                    l5 = l5 + "P     ";
                    l6 = l6 + "P     ";
                    l7 = l7 + "P     ";
                    break;
                case 'Q':
                case 'q':
                    l1 = l1 + " QQQ  ";
                    l2 = l2 + "Q   Q ";
                    l3 = l3 + "Q   Q ";
                    l4 = l4 + "Q   Q ";
                    l5 = l5 + "Q Q Q ";
                    l6 = l6 + "Q  QQ ";
                    l7 = l7 + " QQQQ ";
                    break;
                case 'R':
                case 'r':
                    l1 = l1 + "RRRR  ";
                    l2 = l2 + "R   R ";
                    l3 = l3 + "R   R ";
                    l4 = l4 + "RRRR  ";
                    l5 = l5 + "R R   ";
                    l6 = l6 + "R  R  ";
                    l7 = l7 + "R   R ";
                    break;
                case 'S':
                case 's':
                    l1 = l1 + " SSS  ";
                    l2 = l2 + "S   S ";
                    l3 = l3 + "S     ";
                    l4 = l4 + " SSS  ";
                    l5 = l5 + "    S ";
                    l6 = l6 + "S   S ";
                    l7 = l7 + " SSS  ";
                    break;
                case 'T':
                case 't':
                    l1 = l1 + "TTTTT ";
                    l2 = l2 + "  T   ";
                    l3 = l3 + "  T   ";
                    l4 = l4 + "  T   ";
                    l5 = l5 + "  T   ";
                    l6 = l6 + "  T   ";
                    l7 = l7 + "  T   ";
                    break;
                case 'U':
                case 'u':
                    l1 = l1 + "U   U ";
                    l2 = l2 + "U   U ";
                    l3 = l3 + "U   U ";
                    l4 = l4 + "U   U ";
                    l5 = l5 + "U   U ";
                    l6 = l6 + "U   U ";
                    l7 = l7 + " UUU  ";
                    break;
                case 'V':
                case 'v':
                    l1 = l1 + "V   V ";
                    l2 = l2 + "V   V ";
                    l3 = l3 + "V   V ";
                    l4 = l4 + "V   V ";
                    l5 = l5 + "V   V ";
                    l6 = l6 + " V V  ";
                    l7 = l7 + "  V   ";
                    break;
                case 'W':
                case 'w':
                    l1 = l1 + "W   W ";
                    l2 = l2 + "W   W ";
                    l3 = l3 + "W   W ";
                    l4 = l4 + "W W W ";
                    l5 = l5 + "W W W ";
                    l6 = l6 + "W W W ";
                    l7 = l7 + " W W  ";
                    break;
                case 'X':
                case 'x':
                    l1 = l1 + "X   X ";
                    l2 = l2 + "X   X ";
                    l3 = l3 + " X X  ";
                    l4 = l4 + "  X   ";
                    l5 = l5 + " X X  ";
                    l6 = l6 + "X   X ";
                    l7 = l7 + "X   X ";
                    break;
                case 'Y':
                case 'y':
                    l1 = l1 + "Y   Y ";
                    l2 = l2 + "Y   Y ";
                    l3 = l3 + " Y Y  ";
                    l4 = l4 + "  Y   ";
                    l5 = l5 + "  Y   ";
                    l6 = l6 + "  Y   ";
                    l7 = l7 + "  Y   ";
                    break;
                case 'Z':
                case 'z':
                    l1 = l1 + "ZZZZZ ";
                    l2 = l2 + "    Z ";
                    l3 = l3 + "   Z  ";
                    l4 = l4 + "  Z   ";
                    l5 = l5 + " Z    ";
                    l6 = l6 + "Z     ";
                    l7 = l7 + "ZZZZZ ";
                    break;
                case ' ':
                    l1 = l1 + "      ";
                    l2 = l2 + "      ";
                    l3 = l3 + "      ";
                    l4 = l4 + "      ";
                    l5 = l5 + "      ";
                    l6 = l6 + "      ";
                    l7 = l7 + "      ";
                    break;

                default:
                    break;

            }
            String lf1 = l1.replaceFirst("\\s++$", "");
            String lf2 = l2.replaceFirst("\\s++$", "");
            String lf3 = l3.replaceFirst("\\s++$", "");
            String lf4 = l4.replaceFirst("\\s++$", "");
            String lf5 = l5.replaceFirst("\\s++$", "");
            String lf6 = l6.replaceFirst("\\s++$", "");
            String lf7 = l7.replaceFirst("\\s++$", "");
                    answer = lf1 + "\n" + lf2 + "\n" + lf3 + "\n" + lf4 + "\n" + lf5 + "\n" + lf6 + "\n" + lf7;

        }
        System.out.println(answer);

    }
}