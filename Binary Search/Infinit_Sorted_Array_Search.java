//Note in this i have not given a extremely long array but the concept used to do this problem is what you should follow.
class Infinit_Sorted_Array_Search
{
    public static void main(String[] args)
    {
        int[] arr = new int[1000000];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = i+1;
        }
        int key = 94366;
        System.out.println(range(arr , key));
    }
    public static int range(int[] arr , int key)
    {
        int low = 0;
        int high = 1;
        while(arr[high] < key)
        {
            low = high;
            high = high*2;
        }
        return Binsearch(arr , low , high , key);
    }
    public static int Binsearch(int[] arr , int start , int end, int key)
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