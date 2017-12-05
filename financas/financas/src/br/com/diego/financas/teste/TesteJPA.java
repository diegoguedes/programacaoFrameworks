package br.com.diego.financas.teste;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.diego.financas.modelo.Conta;
import br.com.diego.financas.modelo.Movimentacao;
import br.com.diego.financas.modelo.TipoTransacao;
import br.com.diego.financas.util.JPAUtil;

public class TesteJPA {
	public static void main(String[] args) {
		EntityManager em = (new JPAUtil()).getEM();

		Conta conta = new Conta();
		conta.setAgencia("1234");
		conta.setBanco("Itau");
		conta.setNumero("1.234-5");
		conta.setTitular("Bruno");

		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setConta(conta);
		movimentacao.setDataMovimentacao(new Date());
		movimentacao.setDescricao("sacar para lanchar");
		movimentacao.setTipo(TipoTransacao.SAIDA);
		movimentacao.setValor(new BigDecimal(10));

		em.getTransaction().begin();
		
		em.persist(movimentacao);
		
		em.getTransaction().commit();

		System.out.println("Conta\n nome: " + conta.getTitular() + " \n agencia: " + conta.getAgencia());

		em.close();
	}
}
