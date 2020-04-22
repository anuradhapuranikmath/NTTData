package com.nttdata;

import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class BaseEncoder {  
	 public static void main(String[] args) {  
		 
		 //Base Encoder
	Encoder basicEncoder = Base64.getEncoder();  
	String encodedString = basicEncoder.encodeToString("Hey Java".getBytes());  
	System.out.println("Encoded String :" + encodedString);  
	Decoder basicDecoder = Base64.getDecoder();  
	 System.out.println("Decoded String :" + new String(basicDecoder.decode(encodedString)));
	 
	 //URL Encoder
	 Encoder urlEncoder = Base64.getUrlEncoder();  
	 String encodedURLString = urlEncoder.encodeToString("Hello?Java".getBytes());  
	 System.out.println("Encoded String Using URL Encoder :" + encodedURLString);  
	 Decoder urlDecoder = Base64.getUrlDecoder();  
	 System.out.println("Decoded String :" + new String(urlDecoder.decode(encodedURLString)));  
	 
	 //MIME encoder
	 String string = "Java 8 Encoding and Decoding";
			 Encoder mimeEncoder = Base64.getMimeEncoder();
			 Decoder mimeDecoder=Base64.getMimeDecoder();
			 String encodedString1 = mimeEncoder.encodeToString(string. getBytes());
			 
			 System.out.println("MIME Encoder :" + encodedString1);
      
	 }
	}
