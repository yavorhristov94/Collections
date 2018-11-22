package net.twinray;

import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Integer.parseInt;

public class Calculator {
//going to set up a stack to push each element of the calc and return when we have
//a final result
//so if we have 1 - 2 +3 + 4...


    public int evaluate(final String input)
    {

        final Deque<String> stack = new ArrayDeque<>();
        final String[] tokens = input.split(" ");
        for (String token:tokens){stack.add(token);}


        while (stack.size() > 1 ){
            //we take the first equation off the deck
            // so now in the equation we load 1 - 2
            // and in the stack remains + 3 + 4
            final int left = parseInt(stack.pop());
            final String operator = stack.pop();
            final int right = parseInt(stack.pop());

            //we calc the result
            int result = 0;
            switch (operator)
            {
                case "+": result = left + right; break;
                case "-": result = left - right; break;
            }

            stack.push(String.valueOf(result));
            //we push it back onto the stack so what we have is
            // -1 + 3 + 4
        }
        return parseInt(stack.pop());
    }
}
