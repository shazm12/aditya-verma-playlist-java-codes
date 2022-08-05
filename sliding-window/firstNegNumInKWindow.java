import java.util.*;

public class slidingWindow {

    public List<Integer> firstNegInKWindow(int[] arr, int k, int n) {
        int i= 0;
        int j = 0;
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> temp = new LinkedList<>();
        while(j  < n) {
            if(arr[j] <0) {
                temp.add(arr[j]);
            }

            if(j-i+1 < k) {
                j++;
            }
            else if(j-i+1==k) {
                if(temp.size() == 0) {
                    ans.add(0);
                }
                else {
                    int top = temp.peek();
                    ans.add(top);
                    if(arr[i] == top) {
                        temp.poll();
                    }
                }
                j++;
                i++; 
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,-18,30,13,28};
        int k = 3;
        int n = 8;
        slidingWindow obj = new slidingWindow();
        List<Integer> ans = new ArrayList<>();
        ans = obj.firstNegInKWindow(arr,k,n);
        System.out.println(ans);
    }
    
}
