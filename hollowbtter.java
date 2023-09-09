public class hollowbtter{
    public static void main(String[] args) {
        int n=5;
        //Outer loop
        for(int i=1;i<=n;i++){
            //Inner Loop for star
            
            for(int j=1;j<=i;j++){
                if(j==1||i==j){
                    System.out.print("*");
                }
                else  {
                    System.out.print(" ");

            } }
            
            // for(int j=1;j<=2*(n-i);j++){
            //     System.out.print(" ");
            // }
            // for(int j=1;j<=i;j++){
            //     System.out.print("*");
            // }
            System.out.println();
        }
                //Outer loop
        
    }
}