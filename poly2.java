public class poly2 {
    int msg(){
        int a=10;
        int b=20;
        return a+b;
    }

    int msg(int a){
        int b=5;
        return a*b;
    }

    int msg(int a,int b){
        return a-b;
    }
    public static void main(String[] args) {
        poly2 p=new poly2();
        System.out.println(p.msg());
        System.out.println( p.msg(10));
        System.out.println(p.msg(60, 20));
    }
    
}
