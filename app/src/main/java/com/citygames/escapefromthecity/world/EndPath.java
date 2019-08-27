package com.citygames.escapefromthecity.world;

import java.util.Stack;

public class EndPath {
    public Stack<Street> endPath;
    public int tag;

    public EndPath()
    {
        endPath = new Stack<Street>(){};
        tag = randomInt(0,50);
    }

    public  static int randomInt(int low, int high)
    {
        int result = (int)(Math.random()
                * (high-low-1)) + low;
        return result;
    }


}
