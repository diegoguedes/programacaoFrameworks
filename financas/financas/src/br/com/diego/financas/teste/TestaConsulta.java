package br.com.diego.financas.teste;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.diego.financas.modelo.Conta;
import br.com.diego.financas.modelo.Movimentacao;
import br.com.diego.financas.util.JPAUtil;

public class TestaConsulta {
	public static void main(String[] args) {
		EntityManager oEntityManager = new JPAUtil().getEM();
		Conta oConta = new Conta();
		oConta.setId(202);

		Query query = oEntityManager.createQuery("select m from Movimentacao m where m.conta=:pconta");
		query.setParameter("pconta", oConta);
		List<Movimentacao> lista = query.getResultList();

		for (Movimentacao movimentacao : lista) {
			System.out.println("Nome:" + movimentacao.getConta().getTitular());
			System.out.println("Id:" + movimentacao.getConta().getId());
		}

	}
}
