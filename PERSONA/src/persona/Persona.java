package persona;

public class Persona {
	public String nombre;
	public String id;
	public String género;
	public String colordepiel;
	public String nacionalidad;
	private String cuentasdeahorros;
	public String getCuentasdeahorros() {
		return cuentasdeahorros;
	}

	public void setCuentasdeahorros(String cuentasdeahorros) {
		this.cuentasdeahorros = cuentasdeahorros;
	}

	public String getContactosdeempresa() {
		return contactosdeempresa;
	}

	public void setContactosdeempresa(String contactosdeempresa) {
		this.contactosdeempresa = contactosdeempresa;
	}

	public String getDepositosenelbanco() {
		return depositosenelbanco;
	}

	public void setDepositosenelbanco(String depositosenelbanco) {
		this.depositosenelbanco = depositosenelbanco;
	}

	public String getManejodecuentas() {
		return manejodecuentas;
	}

	public void setManejodecuentas(String manejodecuentas) {
		this.manejodecuentas = manejodecuentas;
	}
	private String familiares;
	private String contactosdeempresa;
	private String depositosenelbanco;
	private String manejodecuentas;

	public Persona(String nombre, String id, String género, String colordepiel, String nacionalidad,
		String cuentasdeahorros, String familiares, String contactosdeempresa, String depositosenelbanco,
		String manejodecuentas) {
		super();
	this.nombre = nombre;
	this.id = id;
	this.género = género;
	this.colordepiel = colordepiel;
	this.nacionalidad = nacionalidad;
	this.cuentasdeahorros = cuentasdeahorros;
	this.familiares = familiares;
	this.contactosdeempresa = contactosdeempresa;
	this.depositosenelbanco = depositosenelbanco;
	this.manejodecuentas = manejodecuentas; 
	} 
	
	public Persona() {
		super();
		this.nombre = "";
		this.id = "";
		this.género = "";
		this.colordepiel = "";
		this.nacionalidad = "";
		this.cuentasdeahorros = "";
		this.familiares = "";
		this.contactosdeempresa = "";
		this.depositosenelbanco = "";
		this.manejodecuentas = ""; 
	} 
	public Persona(String cuentasdeahorros, String familiares, String contactosdeempresa, String depositosenelbanco,String manejodecuentas) {
				super();
			this.cuentasdeahorros = cuentasdeahorros;
			this.familiares = familiares;
			this.contactosdeempresa = contactosdeempresa;
			this.depositosenelbanco = depositosenelbanco;
			this.manejodecuentas = manejodecuentas; 
}} 