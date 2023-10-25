public class nrPrimeInSir {
    public static void main (String args[])
    {
        int[] sirNr = {1,3,2,5,7,9,10,20};
        for (int a=0;a<sirNr.length;a++)
            if (nrPrim(sirNr[a]))
                System.out.println(sirNr[a]);
    }

    public static Boolean nrPrim(int nr)
    {
        for (int i=2;i<=nr/2;i++)
            if (nr%i==0)
                return false;
        return true;
    }
}