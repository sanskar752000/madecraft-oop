package com.Inheritance;

import java.util.Random;

// ExtraRandom class here is a child of Class Random
public class ExtraRandom extends Random{

    public String nextLetter() {
        int letterStartAt = 97;
        int randomInt = new Random().nextInt(26) + letterStartAt;
        return "" + (char)randomInt;
    }
}
