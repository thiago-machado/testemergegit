package br.com.teste;

public class ClassePrincipal {
	public static void main (String[] args) {
		
		System.out.println("Bem vindo ao sistema...");
		
		if(args != null && args.size() > 0) {
			for(String argument : args) {
				System.out.println("Arg...");
				System.out.println(argument);
			}
		} else {
			System.err.println("Without arguments...");
		}
	}
}