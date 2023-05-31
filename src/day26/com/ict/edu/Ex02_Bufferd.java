package day26.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Ex01의 읽는속도 향상을 위해서 BufferedInputStream 사용
//혼자서는 사용하지못한다. 반드시 InputStream 중 하나를 이용해야함.
public class Ex02_Bufferd {
	public static void main(String[] args) {
		String pathname = "D:/njm/test02.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			byte[] b = new byte[(int) file.length()];
			bis.read(b);
			
			String msg = new String(b);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}

	}
}
