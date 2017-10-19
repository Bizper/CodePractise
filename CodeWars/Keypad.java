/*
Prior to having fancy iPhones, teenagers would wear out their thumbs sending SMS
messages on candybar-shaped feature phones with 3x4 numeric keypads.
------- ------- -------
|     | | ABC | | DEF |
|  1  | |  2  | |  3  |
------- ------- -------
------- ------- -------
| GHI | | JKL | | MNO |
|  4  | |  5  | |  6  |
------- ------- -------
------- ------- -------
|PQRS | | TUV | | WXYZ|
|  7  | |  8  | |  9  |
------- ------- -------
------- ------- -------
|     | |space| |     |
|  *  | |  0  | |  #  |
------- ------- -------
Prior to the development of T9 (predictive text entry) systems, the method to
type words was called "multi-tap" and involved pressing a button repeatedly to
cycle through the possible values.

For example, to type a letter "R" you would press the 7 key three times (as the
screen display for the current character cycles through P->Q->R->S->7). A
characteris "locked in" once the user presses a different key or pauses for a
short periodof time (thus, no extra button presses are required beyond what is
needed for each letter individually). The zero key handles spaces, with one
press of the key producing a space and two presses producing a zero.

In order to send the message "WHERE DO U WANT 2 MEET L8R" a teen would have to
actually do 47 button presses. No wonder they abbreviated.

For this assignment, write a module that can calculate the amount of button
presses required for any phrase. Punctuation can be ignored for this exercise.
Likewise, you can assume the phone doesn't distinguish between upper/lowercase
characters (but you should allow your module to accept input in either for
convenience).

Hint: While it wouldn't take too long to hard code the amount of keypresses
for all 26 letters by hand, try to avoid doing so! (Imagine you work at a
phone manufacturer who might be testing out different keyboard layouts, and
you want to be able to test new ones rapidly.)
*/
public class Keypad {

    public static char one_list[] = {'A', 'D', 'G', 'J', 'M', 'P', 'T', 'W', ' ', '#', '*', 'a', 'd', 'g', 'j', 'm', 'p', 't', 'w', '1'};
    public static char two_list[] = {'B', 'E', 'H', 'K', 'N', 'Q', 'U', 'X', 'b', 'e', 'h', 'k', 'n', 'q', 'u', 'x', '0'};
    public static char three_list[] = {'C', 'F', 'I', 'L', 'O', 'R', 'V', 'Y', 'c', 'f', 'i', 'l', 'o', 'r', 'v', 'y'};
    public static char four_list[] = {'S', 's', 'Z', 'z', '2', '3', '4', '5', '6', '8'};
    public static char five_list[] = {'7', '9'};

    public static int presses(String phrase) {
        System.out.println(phrase);
        int count = 0;
        for(char c : phrase.toCharArray()) {
            count += parse(c);
        }
        return count;
    }

    public static int parse(char c) {
        if(contain(one_list, c)) return 1;
        if(contain(two_list, c)) return 2;
        if(contain(three_list, c)) return 3;
        if(contain(four_list, c)) return 4;
        if(contain(five_list, c)) return 5;
        return 0;
    }

    public static boolean contain(char list[], char c) {
        for(char a : list) {
            if(a == c) return true;
        }
        return false;
    }

}
