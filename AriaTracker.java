import java.util.*;
import java.io.*;

public class AriaTracker {
	public static void main(String[] args) {
		Scanner varScanner = new Scanner(System.in);
		System.out.print("input the tracker-list's path: ");
		String from = varScanner.nextLine();
		System.out.print("input the list's filename:");
		String filename = varScanner.nextLine();
		String temp = convert(from+filename);
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(from+filename+"_aria",true));
			out.write(temp);
			out.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Format converted successfully");
	}
	
	private	static String convert(String filepath) {
        try {
            File file = new File(filepath);
            String res="";
            if (file.isFile() && file.exists()) {
                InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = bufferedReader.readLine();
                while (lineTxt != null) {
                	if(lineTxt.equals(""))
                	{
                		lineTxt = bufferedReader.readLine();
                		continue;
                	}
                	res=res+lineTxt+",";
                	lineTxt = bufferedReader.readLine();
                }
                return res.substring(0,res.length()-1);
            }
        } catch (UnsupportedEncodingException | FileNotFoundException e) {
            System.out.println("Cannot find the file specified!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error reading file content!");
            e.printStackTrace();
        }
        return null;
    }
}
