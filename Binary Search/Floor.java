class Floor
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,7,8,10,10,15,17};
        int key = 5;
        System.out.println(search(arr , 0 , arr.length-1 , key));
    }
    public static int search(int[] arr , int start , int end , int key)
    {
        int res = -1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] == key)
            {
                return arr[mid];
            }
            else if(arr[mid] < key)
            {
                res = arr[mid];
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