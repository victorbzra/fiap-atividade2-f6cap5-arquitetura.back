package br.com.fiap.traveller.parque.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Parques> listaParques = new ArrayList<Parques>();
	private static Integer chaveSequencial = 0;
	
	
	static {
		Parques parque1 = new Parques();
		parque1.setNome("Parque do Ibirapuera");
		parque1.setHorarioFunc("05h �s 24h");
		parque1.setAvaliacao(4);
		parque1.setUrlOfc("https://parqueibirapuera.org/");
		parque1.setDesc("O Ibirapuera � um bairro nobre localizado na regi�o centro-sul da capital paulista, no distrito de Moema, e cortado pela Avenida Indian�polis. ");
		parque1.setId(chaveSequencial++);

		
		Parques parque2 = new Parques();
		parque2.setNome("Jardim Bot�nico de S�o Paulo");
		parque2.setHorarioFunc("09h �s 17h");
		parque2.setAvaliacao(5);
		parque2.setUrlOfc("https://jardimbotanico.sp.gov.br/");
		parque2.setDesc("O Jardim Bot�nico de S�o Paulo foi fundado em 1928 a partir de um convite feito ao naturalista brasileiro Frederico Carlos Hoehne, para que implantasse um projeto de bot�nica na regi�o da �gua Funda, na cidade de S�o Paulo. ");
		parque2.setId(chaveSequencial++);
		
		Parques parque3 = new Parques();
		parque3.setNome("Parque Alfredo Volpi");
		parque3.setHorarioFunc("06h �s 18h");
		parque3.setAvaliacao(4);
		parque3.setUrlOfc("https://www.saopaulo.sp.gov.br/conhecasp/parques-e-reservas-naturais/parque-alfredo-volpi/");
		parque3.setDesc("O Parque Alfredo Volpi � um parque localizado no bairro de Cidade Jardim, distrito do Morumbi, na zona oeste da cidade brasileira de S�o Paulo e Prefeitura Regional do Butant�");
		parque3.setId(chaveSequencial++);
		
		Parques parque4 = new Parques();
		parque4.setNome("Parque Buenos Aires");
		parque4.setHorarioFunc("06h �s 20h");
		parque4.setAvaliacao(3);
		parque4.setUrlOfc("https://www.prefeitura.sp.gov.br/cidade/secretarias/meio_ambiente/parques/regiao_centrooeste/index.php?p=5732");
		parque4.setDesc("Parque Buenos Aires � um parque p�blico localizado no bairro de Higien�polis, na regi�o central da cidade de S�o Paulo, outrora chamado Pra�a Buenos Aires. ");
		parque4.setId(chaveSequencial++);
		
		Parques parque5 = new Parques();
		parque5.setNome("Parque da Independ�ncia");
		parque5.setHorarioFunc("05h �s 20h");
		parque5.setAvaliacao(5);
		parque5.setUrlOfc("https://www.prefeitura.sp.gov.br/cidade/secretarias/meio_ambiente/parques/regiao_sul/index.php?p=5747");
		parque5.setDesc("O Parque da Independ�ncia, inaugurado em 1989, nas margens do c�rrego do bairro do Ipiranga, na cidade de S�o Paulo, faz parte do patrim�nio hist�rico cultural brasileiro devido ao Grito da Independ�ncia do pa�s, ali proclamada por D. Pedro I.");
		parque5.setId(chaveSequencial++);
		

		listaParques.add(parque1);
		listaParques.add(parque2);
		listaParques.add(parque3);
		listaParques.add(parque4);

	}

	public List<Parques> getParques() {
		return listaParques;
	}

	public void adc(Parques parque) {
		listaParques.add(parque);
		parque.setId(chaveSequencial++);
	}

	public void remove(Integer id) {
		final Iterator<Parques> it = Banco.listaParques.iterator();
        while (it.hasNext()) {
            final Parques parque = it.next();
            if (parque.getId() == id) {
                it.remove();
            }
			
		}
	}

	public Parques findID(Integer id) {
		for (Parques parque : listaParques) {
			if (parque.getId() == id) {
                return parque;
            }
			
		} return null;

	}
	
}
