import java.util.*;

class arrays{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int n=sc.nextInt();
        int numbers[]=new int[n];
        //int[] marks=new int[n];
        //It could be also int marks[]=new int[n]
        // when we already know the size and values
        //int marks[]={88,89,90};
        // numbers[0]=88;
        // numbers[1]=89;
        // numbers[2]=90;
        System.out.println("Enter Elements in Array: ");
        for(int i=0;i<n;i++)
        {
        
            numbers[i]=sc.nextInt();
        
        }
        System.out.println("Element to be searched: ");
        
        int a=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        if(numbers[i]==a){
        System.out.println("Number: "+numbers[i]+ " at index "+i);
        }
        }
    }
}