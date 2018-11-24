package com.nonatosantos.design.model;

public interface EstadoOrcamento {

	void aplicaDescontoExtra(Orcamento orcamento);

	void aprova(Orcamento orcamento);
	void reprova(Orcamento orcamento);
	void finaliza(Orcamento orcamento);

}
