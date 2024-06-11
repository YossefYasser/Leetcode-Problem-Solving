class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int[] stack = new int[asteroids.length];
        int top = -1; 
        for (int g : asteroids) {
            if (top == -1) {
                stack[++top] = g;
            } else {
                if (g < 0) { // moving to left
                    if (stack[top] < 0) { // top also moving to left
                        stack[++top] = g;
                    } else {
                        while (top >= 0 && stack[top] > 0 && stack[top] < (-g)) {
                            top--; // bnshel kol ele f skto w a2l mno
                        }
                        if (top >= 0) {
                            if (stack[top] > 0 && stack[top] == (-g)) {
                                top--; // hy3ml de w ytl3
                            } else if (stack[top] < 0) {
                                stack[++top] = g;
                            }
                        } else {//el stack fady zwd ele m3ana 3shan da khls 3la kolo
                            stack[++top] = g;
                        }
                    }
                } else { // moving to right msh h3ml 7aaga swa2 el top right aw left
                    stack[++top] = g;
                }
            }
        }
        int[] ans = new int[top + 1];
        for (int i = 0; i <= top; i++) {
            ans[i] = stack[i];
        }
        return ans;
    }
}