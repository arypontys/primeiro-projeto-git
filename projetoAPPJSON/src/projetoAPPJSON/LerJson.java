package projetoAPPJSON;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class LerJson {
	public static void main(String[] args){  	
		Gson gson = new Gson();
		
		try {
			
			BufferedReader Cerveja = new BufferedReader(new FileReader("/home/eu/Área de Trabalho/cerveja.json"));
		
			LerJson lerJson = (LerJson) gson.fromJson(Cerveja, LerJson.class);
		
			System.out.println("cerveja");
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
