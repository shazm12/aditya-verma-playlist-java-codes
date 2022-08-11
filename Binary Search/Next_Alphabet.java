class Next_Alphabet
{
    public static void main(String[] args)
    {
        char[] ch = {'a','b','c','f','g','l','q','r','s'};
        char key = 'i';
        char flag = search(ch , 0 , ch.length - 1 , key);
        if(flag == '#')
        {
            System.out.println("No element found");
        }
        else
        {
            System.out.println(flag);
        }
    }
    public static char search(char[] ch , int start , int end , char key)
    {
        char c = '#';
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(ch[mid] == key)
            {
                start = mid+1;
            }
            else if(ch[mid] < key)
            {
                start = mid + 1;
            }
            else
            {
                c = ch[mid];
                end = mid - 1;
            }
        }
        return c;
    }
}