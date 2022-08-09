class no_of_times_array_rotated
{
    public static void main(String[] args)
    {
        int[] arr = {6,7,8,9,1,2,3,4,5};
        int r = rotated(arr , 0 , arr.length-1);
        System.out.println(rotated(arr , 0 , arr.length - 1));
    }
    public static int rotated(int[] arr , int start , int end)
    {
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % arr.length;
            int pre = (mid + arr.length - 1) % arr.length;
            if(arr[mid] <= arr[next] && arr[mid] <= arr[pre])
            {
                return mid;
            }
            else if(arr[mid] >= arr[start])
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