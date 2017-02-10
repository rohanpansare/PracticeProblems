import java.util.Scanner;

/**
 * Created by rohanpansare on 1/26/2017.
 */
public class repalcechard {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String line = sc.nextLine();
        int length = line.length();
        StringBuilder encrypt = new StringBuilder();
        for(int i=0; i<length;i++){
            char c = line.charAt(i);
            int value = c-'a';
            if(value >=0 && value <=26){
                if(value  >9){
                    encrypt.append(value+"#");
                }else{
                    encrypt.append(value);
                }
            }else{
                encrypt.append(c);
            }
        }
        System.out.println(encrypt.toString());
    }
}
