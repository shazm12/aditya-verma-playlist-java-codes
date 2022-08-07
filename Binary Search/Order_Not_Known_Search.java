//This question is a type when array is already given to and you dont know if the array is in ascending or in descending order.
import java.util.*;
class Order_Not_Known_Search
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched");
        int num = sc.nextInt();
        int[] arr = {20,19,18,17,16,15,14,13,12,11,10};
        System.out.println(agnostic(arr , num , 0 , arr.length -1));
    }
    public static int agnostic(int[] arr , int num ,int start , int end)
    {
        //Checking if the length of the array is 1.
        if(arr.length == 1)
        {
            return (arr[start] == num) ? start : -1 ;
        }
        // Checking if array is in ascending order
        else if(arr[0] < arr[end])
        {
            while(start <= end)
            {
                int mid = start + (end - start)/2;
                if(arr[mid] == num)
                {
                    return mid;
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
        }
        // Else the array is in descending order
        else
        {
            while(start <= end)
            {
                int mid = start + (end - start)/2;
                if(arr[mid] == num)
                {
                    return mid;
                }
                else if(arr[mid] > num)
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}