// By nearly sorted array we means the either element is at its original index or at index-1 or index+1 index.
class Nearly_Sorted_Array_Search
{
    public static void main(String[] args)
    {
        int[] arr = {5 , 10 , 30 , 20 , 40};
        int key = 20;
        System.out.println(search(arr , 0 , arr.length - 1 , key));
    }
    public static int search(int[] arr , int start , int end , int key)
    {
        int first = start;
        int last = end;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] == key)
            {
                return mid;
            }
            else if(mid - 1 >= first && arr[mid - 1] == key)
            {
                return mid - 1;
            }
            else if(mid + 1 <= last && arr[mid + 1] == key)
            {
                return mid + 1;
            }
            else if(arr[mid] < key)
            {
                start = mid + 2;
            }
            else 
            {
                end = mid - 2;
            }
        }
        return -1;
    }
}