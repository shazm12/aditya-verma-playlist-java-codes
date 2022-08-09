import java.util.*;
class count_elements
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched");
        int num = sc.nextInt();
        int[] arr = {1,2,3,4,5,6,6,6,6,6,7,7,7,8,8,9};
        int first = first_ind(arr , num , 0 , arr.length-1);
        int last = last_ind(arr , num , 0 , arr.length-1);
        if(first == -1 && last == -1)
        {
            System.out.println("-1");
        }
        else
        {
            int count = last - first + 1;
            System.out.println(count);
        }
    }

    public static int first_ind(int[] arr , int num , int start , int end)
    {
        int index = -1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] == num)
            {
                index = mid;
                end = mid - 1;
            }
            else if(arr[mid] > num)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return index;
    }

    public static int last_ind(int[] arr, int num , int start , int end)
    {
        int res = -1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] == num)
            {
                res = mid;
                start = mid + 1;
            }
            else if(arr[mid] > num)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return res;
    }
}