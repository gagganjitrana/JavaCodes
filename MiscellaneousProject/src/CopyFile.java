import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		String currentDir=System.getProperty("user.home")+"\\"+ "Downloads";
		System.out.println(currentDir);
		
		File dir = new File(currentDir);
		File[] dirFileList =  dir.listFiles();
		
		for(int i=0;i<dirFileList.length;i++)
		{
			if(dirFileList[i].getName().equalsIgnoreCase("VaccineBill.pdf"))
				
			{
				Path srcPath= Paths.get(dirFileList[i].getAbsolutePath());
				System.out.println("src: "+srcPath);
				Path destPath=Paths.get(System.getProperty("user.home")+"\\"+ "Desktop"+"\\"+"VaccineBill.pdf");
				System.out.println("Dest: "+destPath);
				Files.copy(srcPath, destPath);
			}
		}
		

	}

}
