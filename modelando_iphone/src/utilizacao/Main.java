package utilizacao;

import modelo.Iphone;

public class Main {
	public static void main(String[] args) {
		String numeroTelefone, url, musica;
		Iphone iphone = new Iphone();
		
		url = "https://github.com/HVcostalm";
		numeroTelefone = "71981910779";
		musica = "M83 - Wait";
		
		System.out.printf("----INICIO DA FUNCIONALIDADE REPRODUTOR MUSICAL----\n\n");
		iphone.selecionarMusica(musica);
		iphone.tocar();
		iphone.pausar();
		System.out.printf("\n----TERMINO DA FUNCIONALIDADE REPRODUTOR MUSICAL----\n");
		
		System.out.printf("\n----INICIO DA FUNCIONALIDADE NAVEGADOR INTERNET----\n\n");
		iphone.exibirPagina(url);
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		System.out.printf("\n----TERMINO DA FUNCIONALIDADE REPRODUTOR MUSICAL----\n");
		
		System.out.printf("\n----INICIO DA FUNCIONALIDADE APARELHO TELEFONICO----\n\n");
		iphone.ligar(numeroTelefone);
		iphone.atender();
		iphone.iniciarCorreioVoz();
		System.out.printf("\n----TERMINO DA FUNCIONALIDADE REPRODUTOR MUSICAL----");
	}
}
