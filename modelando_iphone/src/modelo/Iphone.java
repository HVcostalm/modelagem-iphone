package modelo;

import funcionalidade.AparelhoTelefonico;
import funcionalidade.NavegadorInternet;
import funcionalidade.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("TOCANDO MUSICA VIA IPHONE");
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("PAUSANDO MUSICA VIA IPHONE");
	}

	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("SELECIONANDO A MUSICA " + musica + " VIA IPHONE");
	}

	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		System.out.println("EXIBINDO A PAGINA " + url + " VIA IPHONE");
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("ADICIONANDO NOVA ABA VIA IPHONE");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("ATUALIZANDO A PAGINA VIA IPHONE");
	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("LIGANDO PARA O NUMERO " + numero + " VIA IPHONE");
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("ATENDENDO O NUMERO VIA IPHONE");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("INICIANDO O CORREIO DE VOZ VIA IPHONE");
	}

}
