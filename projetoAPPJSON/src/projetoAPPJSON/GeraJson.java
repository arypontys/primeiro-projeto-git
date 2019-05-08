package projetoAPPJSON;
/*
criar o projeto APPJSON com duas classes (Cerveja e GeraJson) e inporta uma
biblioteca gson fruto de uma pesquisa no google sobre "gson.jar"
criar a classe com o nome "Cerveja" e passar os parametros "nome" "malte" "marca" "ano"
e criar uma classe com o nome "GeraJson" que vai transformar todo
o conteudo do objeto java em Json.
passa o arquivo java como parametro para transformar em json
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger.Level;
import java.util.logging.Logger;

import com.google.gson.Gson;



public class GeraJson {
//	public static void main(String[] args) {
		Cerveja skol = new Cerveja();
		skol.setAno(2019);
		skol.setMalte("Puro Malte");
		skol.setMarca("Skol");
		skol.setNome("Skol Ice NBlue Red");
		
		Gson g= new Gson();
		String json = g.toJson(skol);
		
//		System.out.println(json);
		
		try {
			FileWriter fw = new FileWriter("/home/eu/Área de Trabalho/cerveja.json");
			
			fw.write(json);
			fw.close();
						
		}catch (Exception e){
						
		}

	}
}