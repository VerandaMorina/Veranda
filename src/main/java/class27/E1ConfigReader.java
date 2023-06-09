package class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {

        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";
        //brings the data from the file in the form of bytes
        FileInputStream fileInputStream=new FileInputStream(path);
        //brings the data from the file in the form of values
        Properties prop=new Properties();
        prop.load(fileInputStream);
        System.out.println(prop.get("userName"));
    }
}
