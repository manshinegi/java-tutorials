public class IntegerLiterals {

    // It has multiple primitive data types.
    // byte, short, int, long
    // byte - 8 bits
    // short - 16 bits
    // int -  32 bits
    // long - 64 bits.

    // default Value = 0

    private byte a;
    private short b;
    private int c;

    private long d;
    private long e = 1000L;

    private Integer someValue; // default = null

    private int max = Integer.MAX_VALUE;
    private int min = Integer.MIN_VALUE;


    // integer can be represented as octal & hexadecimal

    private int value = 10; // decimal representation
    private int octalValue = 012; // Octal Representation
    private int hexaValue = 0xa; // Hexa Representation.

}

class FloatingLiteral {

    // float - 32 bits
    // double - 64 bits

    // default Value = 0.0

    private float value = 0F;
    private double doubleValue = 0.0D;

    // 3 * 10^-1

    private float someValue = 0.3f;
    private double some = 3E-2;

}

class characterLiterals {

    // it is denoted by single quotes ('')
    // It follows unicode structure.
    // size - 16 bits.

    // For ex. I need to represent Alphabet A.

    // default value = ' '

//    private char a = 'A';
//    private char unicodeValueOfA = '\u0041';

        char a = 'a';

}


class StringLiterals {


    // Anything represented within double quotes ("").
    // default value = null
    /*
     * Multi Line Coments
     */


    private String value = " \"My name  is Aman\" ";

}

// Those data types, which doesnt have classes are called
// primitives.

// int, long, byte, short, boolean, char, double

// All primitves have wrapper classes.

// Only language which is pure OO Language is SmalTalk & Pascal.

// Default Value of object is null always.

