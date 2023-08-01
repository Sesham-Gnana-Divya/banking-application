package com.virtusa.project.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class TokenGenerator {

	public String generateRandomPassword(int len) {
		String chars = "0123456789";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		sb.append('D');
		for (int i = 2; i < len; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		return sb.toString();
	}
	public String generateRandomPassword() {
		String chars = "0123456789";
		Random rnd = new Random();
		
		StringBuilder sb = new StringBuilder(4);
		sb.append('D');
		sb.append('T');
		for (int i = 2; i < 4; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		return sb.toString();
	}
}
