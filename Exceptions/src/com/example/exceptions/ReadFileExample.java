package com.example.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("input.txt");
			int character;
			while((character = reader.read()) != -1 ) {
				System.out.println((char) character);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}

}
