/*
    @Author :S.Reshma
    Title   :index to array
    Quiz    :assign the index valuevto array value

*/
class indexToArray
{

    public static void main (String []args){
    int a [] = {10,20,30,40,50,60,70};
    System.out.println("Before Convertion ");
    for(int i = 0 ; i<a.length ; i++)
    {
     System.out.print(a[i] + "\t");
    }
    for(int i = 0 ; i<a.length ; i++)
    {
     a[i] = i;
    }
    System.out.println("\nAfter Convertion ");
    for(int i = 0 ; i<a.length ; i++)
    {
     System.out.print(a[i] + "\t");
    }
}
}

   




