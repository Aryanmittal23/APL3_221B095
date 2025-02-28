public class Single
{
    int x=6;
    private Single()
    {
        x++;
        System.out.print(x);
    };
    private static Single uniqueInstance=new Single();
    public static Single
 getInstance()
    {
        return uniqueInstance;
    }
}