class Index_of_first_1_in_infinite_array
{
    public static void main(String[] args)
    {
        int[] arr = new int[10000000];
        for(int i = 0 ; i < 56789 ; i++)
        {
            arr[i] = 0;
        }
        for(int i = 56789 ; i < arr.length ; i++)
        {
            arr[i] = 1;
        }
        System.out.println(range(arr , 1));
    }
    public static int range(int[] arr , int key)
    {
        int low = 0;
        int high = 1;
        while(arr[high] != 1)
        {
            low = high;
            high = high*2;
        }
        return search(arr , low , high , 1);
    }
    public static int search(int[] arr , int start , int end , int key)
    {
        int res = -1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] == key)
            {
                res = mid;
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