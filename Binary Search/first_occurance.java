import java.util.*;
class first_occurance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched");
        int num = sc.nextInt();
        int[] arr ={1,2,3,4,5,6,6,6,6,6,6,6,6,7,7,7,8,8,9}; 
        System.out.println(first_ind(arr , num , 0 , arr.length-1));
    }
    public static int first_ind(int[] arr , int num , int start , int end)
    {
        int res = -1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] == num)
            {
                res = mid;
                end = mid-1;
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
        return res;
    }
}