public class Rotated_Sorted_Array_Search
{
    public static void main(String[] args)
    {
        int[] arr = {11 ,12 , 15 , 18 , 2 , 5 ,6 ,8};
        int key = 15;
        System.out.println(search(arr , key));
    }
    public static int search(int[] A, int B) 
    {
        int minindex = minelement(A , 0 , A.length - 1);
        int first = Binsearch(A , 0 , minindex - 1 , B);
        int second = Binsearch(A , minindex , A.length - 1 , B);
        if(first == -1 && second == -1)
        {
            return -1;
        }
        return Math.max(first , second);
    }
    public static int minelement(int[] arr , int start , int end)
    {
        if(arr[0] < arr[arr.length - 1])
        {
            return 0;
        }
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            int next = (mid+1) % arr.length;
            int prev = (mid - 1 + arr.length) % arr.length;
            if(arr[mid] < arr[next] && arr[mid] < arr[prev])
            {
                return mid;
            }
            else if(arr[start] < arr[mid])
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
    public static int Binsearch(int[] arr , int start , int end , int key)
    {
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] == key)
            {
                return mid;
            }
            else if(arr[mid] < key)
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
