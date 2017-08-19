package com.algawoks.socialbooks.client.domain;

public class DetalhesErros {

	private String titulo;

	private long status;

	private Long timestamp;

	private String mensagemDesenvolvedor;

	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getMensagemDesenvolvedor() {
		return mensagemDesenvolvedor;
	}

	public void setMensagemDesenvolvedor(String mensagemDesenvolvedor) {
		this.mensagemDesenvolvedor = mensagemDesenvolvedor;
	}

}
