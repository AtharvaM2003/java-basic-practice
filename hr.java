public class hr{
    public static void main(String[] args) {
        int n=16;
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
            
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                if(j==1||i==j){
                    System.out.print("*");
                }
                else  {
                    System.out.print(" ");

            } }
            
            System.out.println();
        }
          for(int i=n;i>=1;i--){
            //Inner Loop for star
            
            for(int j=1;j<=i;j++){
                if(j==1||i==j){
                    System.out.print("*");
                }
                else  {
                    System.out.print(" ");

            } }
            
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                if(j==1||i==j){
                    System.out.print("*");
                }
                else  {
                    System.out.print(" ");

            } }
            System.out.println();
        } 
                //Outer loop
        
    }
}