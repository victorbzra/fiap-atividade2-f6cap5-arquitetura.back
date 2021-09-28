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
		parque1.setHorarioFunc("05h às 24h");
		parque1.setAvaliacao(4);
		parque1.setUrlOfc("https://parqueibirapuera.org/");
		parque1.setDesc("O Ibirapuera é um bairro nobre localizado na região centro-sul da capital paulista, no distrito de Moema, e cortado pela Avenida Indianópolis. ");
		parque1.setId(chaveSequencial++);

		
		Parques parque2 = new Parques();
		parque2.setNome("Jardim Botânico de São Paulo");
		parque2.setHorarioFunc("09h às 17h");
		parque2.setAvaliacao(5);
		parque2.setUrlOfc("https://jardimbotanico.sp.gov.br/");
		parque2.setDesc("O Jardim Botânico de São Paulo foi fundado em 1928 a partir de um convite feito ao naturalista brasileiro Frederico Carlos Hoehne, para que implantasse um projeto de botânica na região da Água Funda, na cidade de São Paulo. ");
		parque2.setId(chaveSequencial++);
		
		Parques parque3 = new Parques();
		parque3.setNome("Parque Alfredo Volpi");
		parque3.setHorarioFunc("06h às 18h");
		parque3.setAvaliacao(4);
		parque3.setUrlOfc("https://www.saopaulo.sp.gov.br/conhecasp/parques-e-reservas-naturais/parque-alfredo-volpi/");
		parque3.setDesc("O Parque Alfredo Volpi é um parque localizado no bairro de Cidade Jardim, distrito do Morumbi, na zona oeste da cidade brasileira de São Paulo e Prefeitura Regional do Butantã");
		parque3.setId(chaveSequencial++);
		
		Parques parque4 = new Parques();
		parque4.setNome("Parque Buenos Aires");
		parque4.setHorarioFunc("06h às 20h");
		parque4.setAvaliacao(3);
		parque4.setUrlOfc("https://www.prefeitura.sp.gov.br/cidade/secretarias/meio_ambiente/parques/regiao_centrooeste/index.php?p=5732");
		parque4.setDesc("Parque Buenos Aires é um parque público localizado no bairro de Higienópolis, na região central da cidade de São Paulo, outrora chamado Praça Buenos Aires. ");
		parque4.setId(chaveSequencial++);
		
		Parques parque5 = new Parques();
		parque5.setNome("Parque da Independência");
		parque5.setHorarioFunc("05h às 20h");
		parque5.setAvaliacao(5);
		parque5.setUrlOfc("https://www.prefeitura.sp.gov.br/cidade/secretarias/meio_ambiente/parques/regiao_sul/index.php?p=5747");
		parque5.setDesc("O Parque da Independência, inaugurado em 1989, nas margens do córrego do bairro do Ipiranga, na cidade de São Paulo, faz parte do patrimônio histórico cultural brasileiro devido ao Grito da Independência do país, ali proclamada por D. Pedro I.");
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
