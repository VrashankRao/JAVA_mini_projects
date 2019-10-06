package birthday;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class birthday {
   public static void main(String[] args)throws IOException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM");  
	    Date date = new Date();  
	    System.out.println("Today's Date is "+formatter.format(date)+"\nThese people have birthday today ");
        File f1=new File("bdfile.txt");
        String[] name=null;  
        FileReader fr = new FileReader(f1);  
        @SuppressWarnings("resource")
	    BufferedReader br = new BufferedReader(fr);
        String s;     
        while((s=br.readLine())!=null){
    	    name=s.split(" ");  
            for (String name:names){
        	        if (name.equals(formatter.format(date))){
                	        while((s=br.readLine())!=null){
                 		        names=s.split(" "); 
                                for (String name1 : names){
                        	        System.out.println("happy birthday "+ name1);
                                }break;
                            }
                    }
            }
        }
    }
}
