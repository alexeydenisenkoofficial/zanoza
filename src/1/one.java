public class one {
    public static void main (String[] args)
    {
        int Size=5,j=0;
        int Summa=0;
        int Arr[]=new int[Size];
        while(j<Size)
        {
            Arr[j]=j+1;
            j++;
        }
        for (int i=0;i<Size;i++)
        {
            Summa+=Arr[i];
        }
        System.out.print(Summa+" ");
    }
}
