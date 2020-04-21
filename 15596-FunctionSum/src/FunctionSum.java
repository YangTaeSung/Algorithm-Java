import java.io.*;

public class FunctionSum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		bw.write("output test \n");
		bw.flush();
		bw.close();
		
		String hello = br.readLine();
		System.out.println("hello");
		System.out.println("world");
	}

}
