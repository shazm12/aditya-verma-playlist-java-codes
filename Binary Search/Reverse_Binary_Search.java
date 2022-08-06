import java.util.*;
class Reverse_Binary_Search
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched");
        int num = sc.nextInt();
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(rev_bin_search(arr , num , 0 , arr.length - 1));
    }
    public static int rev_bin_search(int[] arr , int num , int start , int end)
    {
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] == num)
            {
                return mid;
            }
            else if(arr[mid] < num)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return -1;
    }
}