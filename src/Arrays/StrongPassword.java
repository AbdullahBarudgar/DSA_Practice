package Arrays;

import javax.xml.transform.Result;
import java.io.*;

public class StrongPassword {

    public static int minimumNumber(int n, String password) {

        int output;
        int count=0;
        Boolean num=false ,lc=false ,uc=false , sp = false;

        if(n<6){
            output= 6-n;
        }
        else{
            for(int i=0; i<password.length(); i++){

                int a =password.charAt(i);
                System.out.print(a);
                if(a>=48 && a<=57){
                    num=true;
                }
                if(a>=97 && a<=122){
                    lc=true;
                }
                if(a>=65 && a<=90){
                    uc=true;
                }
                if(a>=33 && a<=47 && a>=58 && a<=64 ){
                    sp=true;

                }
            }
            if(num ==false) count++;
            if(uc ==false) count++;
            if(lc ==false) count++;
            if(sp ==false) count++;

            output =count;
        }
        return output;
    }



    public static void main(String[] args) throws IOException {

        StrongPassword result =new StrongPassword();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

