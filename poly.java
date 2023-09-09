class poly{
    void msg(){
        System.out.println("Hi there this is my first program");
    }
    void msg(int a){
        System.out.println("Hi this is second function");
    }
    void msg(int a,int b){
        System.out.println("Hi this is third function");
    }
   public static void main(String[] args) {
        poly p=new poly();
        p.msg();
        p.msg(0);
        p.msg(0, 0);
        
    }
}