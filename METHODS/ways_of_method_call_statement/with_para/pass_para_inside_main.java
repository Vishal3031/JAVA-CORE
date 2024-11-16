public class pass_para_inside_main {
    
    public static void vishal() {
        String[] str={"hello", "hii","vihaan"};
        
        if(str.length>1) {
            System.out.print(str[1]);
        }else {
            System.out.print("Insufficient arguments passed to main.");
        }
    }
    public static void main(String[] args) {
        vishal();
    }

}
