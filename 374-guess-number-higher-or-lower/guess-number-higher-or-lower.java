/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
int l = 0;
int r = n;
long dou =(l+r);
int mid = (int)dou/2;
System.out.println("left is " + l + " right is " + r + " and mid is " + mid);

int result;
int counter =0;
while (guess (mid)!=0)
{
    counter++;
    if(counter>200)
        return 0;
if(guess(mid) ==1)
    {

        l = mid+1;
        dou =((long)l+(long)r);
        mid = (int)(dou/2);
                System.out.println("left is " + l + " right is " + r + " and mid is " + mid);


    }

else if( guess(mid)==-1)
    {
        r = mid-1;
        dou =((long)l+(long)r);
        mid = (int)(dou/2);
        System.out.println("left is " + l + " right is " + r + " and mid is " + mid);

    }

}
return mid;


}
}