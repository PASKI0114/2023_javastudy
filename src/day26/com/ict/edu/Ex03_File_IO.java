package day26.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//D:/njm/test01.txt 읽어서 D:/njm/test02.txt 에 내용추가 
public class Ex03_File_IO {
	public static void main(String[] args) {
		// 읽기
		String pathname = "D:/njm/test01.txt";
		String pathname1 = "D:/njm/test02.txt";
		File file = new File(pathname);
		File file1 = new File(pathname1);
		FileInputStream fis = null;
		FileOutputStream fos = null;
		// 버퍼
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		// 읽음 실행
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(file1,true);
			bos = new BufferedOutputStream(fos);

			//모든 파일의 복사, 이동은 해당 방식으로 해야한다.
			int b = 0;
			while((b = bis.read())!= -1) {
				bos.write(b);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
}
