package lambda;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
Properties pro=new Properties();
//System.out.println(System.getProperty("user.dir")+"/src/lambda/sagar.properties");

//pro.load(new FileInputStream(System.getProperty("user.dir")+"/src/lambda/sagar.properties"));
pro.load(new FileInputStream("./src/lambda/sagar.properties"));
System.out.println(pro.getProperty("pwd"));
pro.setProperty("pwd", "jatin");
pro.store(new FileOutputStream("./src/lambda/sagar.properties"), "dbdbbd");
System.out.println(pro.getProperty("pwd"));
System.out.println(new FileOutputStream("./src/lambda/sagar.properties"));
//System.out.println("/src/lambda/sagar.properties");
	}

}
