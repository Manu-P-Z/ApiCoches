package com.manu.ApiCoches.entities;

import org.springframework.data.annotation.Id;

public class Coche {
	@Id
	private String id;
	private Marca marca;
	private String modelo;
	private String year;
	private TipoMotor tipoMotor;
	private Combustible combustible;
	private Float cilindrada;
	private int potencia;
	private Traccion traccion;
	private Sobrealimentacion sobrealimentacion;
	private int par;
	private Transmision transmision;
	private int capacidadDeposito;
	private int peso;
	
	private int velMaxima;
	private Float aceleracion0_100;
	
	//No hablamos de lo que hay aqui abajo

	public Coche() {
		super();
	}

	public Coche(String id, Marca marca, String modelo, String year, TipoMotor tipoMotor, Combustible combustible,
			Float cilindrada, int potencia, Traccion traccion, Sobrealimentacion sobrealimentacion, int par,
			Transmision transmision, int capacidadDeposito, int peso, int velMaxima, Float aceleracion0_100) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.year = year;
		this.tipoMotor = tipoMotor;
		this.combustible = combustible;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		this.traccion = traccion;
		this.sobrealimentacion = sobrealimentacion;
		this.par = par;
		this.transmision = transmision;
		this.capacidadDeposito = capacidadDeposito;
		this.peso = peso;
		this.velMaxima = velMaxima;
		this.aceleracion0_100 = aceleracion0_100;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public TipoMotor getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(TipoMotor tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public Combustible getCombustible() {
		return combustible;
	}

	public void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}

	public Float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Float cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public Traccion getTraccion() {
		return traccion;
	}

	public void setTraccion(Traccion traccion) {
		this.traccion = traccion;
	}

	public Sobrealimentacion getSobrealimentacion() {
		return sobrealimentacion;
	}

	public void setSobrealimentacion(Sobrealimentacion sobrealimentacion) {
		this.sobrealimentacion = sobrealimentacion;
	}

	public int getPar() {
		return par;
	}

	public void setPar(int par) {
		this.par = par;
	}

	public Transmision getTransmision() {
		return transmision;
	}

	public void setTransmision(Transmision transmision) {
		this.transmision = transmision;
	}

	public int getCapacidadDeposito() {
		return capacidadDeposito;
	}

	public void setCapacidadDeposito(int capacidadDeposito) {
		this.capacidadDeposito = capacidadDeposito;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getVelMaxima() {
		return velMaxima;
	}

	public void setVelMaxima(int velMaxima) {
		this.velMaxima = velMaxima;
	}

	public Float getAceleracion0_100() {
		return aceleracion0_100;
	}

	public void setAceleracion0_100(Float aceleracion0_100) {
		this.aceleracion0_100 = aceleracion0_100;
	}

	
}