class Solution {
    public int largestRectangleArea(int[] heights) {
           int[]rarr = new int[heights.length];int[]larr = new int[heights.length];

         Stack<Integer> stack = new Stack<Integer>();

                for (int i = 0; i < heights.length ; i++) {
                    if(stack.isEmpty())
                        larr[i] = 0;
                    else {
                        while (!stack.isEmpty())
                            if (heights[stack.peek()] >= heights[i])
                                stack.pop();
                            else
                                break;
                        if (stack.isEmpty())
                            larr[i] = 0;
                        else larr[i] = stack.peek() + 1;
                    }
                stack.push(i);

                }
                while(!stack.isEmpty())stack.pop();

                for (int i = heights.length-1; i >=0 ; i--) {
                    if(stack.isEmpty())
                        rarr[i] = heights.length-1;
                    else {
                        while (!stack.isEmpty())
                            if (heights[stack.peek()] >= heights[i])
                                stack.pop();
                            else
                                break;
                        if (stack.isEmpty())
                            rarr[i] = heights.length-1;
                        else rarr[i] = stack.peek() - 1;
                    }
                    stack.push(i);

                }
int max = 0;
                int tempArea;
                for (int i = 0; i < heights.length; i++) {
                    tempArea = (rarr[i] - larr[i ] +1 ) * heights[i];
                    if (tempArea>max) max = tempArea;
                }

                return max;
    }
}