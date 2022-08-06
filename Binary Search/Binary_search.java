import java.util.*;
class Binary_search
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched");
        int num = sc.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(bin_search(arr , num , 0 , arr.length-1));
    }
    public static int bin_search(int[] arr , int num , int start , int end)
    {
        while(start <= end)
        {
            int mid = start + (end - start)/2 ;
            if(arr[mid] == num)
            {
                return mid;
            }
            else if(arr[mid] < num)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return -1;
    }
}