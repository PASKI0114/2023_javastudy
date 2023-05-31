package day26.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//D:/njm/test01.txt 읽어서 D:/njm/test02.txt 에 내용추가 
public class Ex03_File_ID {
	public static void main(String[] args) {
		// 읽기
		String pathname = "D:/njm/test01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		String msg = "";
		// 버퍼
		BufferedInputStream bis = null;
		// 읽음 실행
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);

			byte[] b = new byte[(int) file.length()];
			bis.read(b);

			 msg = new String(b);
			System.out.println(msg);
			// 쓰기
	
		} catch (Exception e) {
			e.printStackTrace();
		
		String pathname1 = "D:/njm/test02.txt";
		File file1 = new File(pathname1);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(file1,true);
			bos = new BufferedOutputStream(bos);
			byte[] b = msg.getBytes();
			bos.write(b);
			bos.flush();
		} catch (FileNotFoundException e3) {
			e.printStackTrace();
		} catch (IOException e2) {
			e.printStackTrace();
		}

		} finally {
			try {
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}}
