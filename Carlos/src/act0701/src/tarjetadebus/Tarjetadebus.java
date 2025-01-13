package tarjetadebus;

public class Tarjetadebus {
	
	public String nombre;
	public String saldo;
	public String id; 
	private String contraseña;
	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	public String getCdunirecup() {
		return cdunirecup;
	}


	public void setCdunirecup(String cdunirecup) {
		this.cdunirecup = cdunirecup;
	}


	private String cdunirecup; {
	
	}

	public Tarjetadebus() {
		super();
		this.nombre = "";
		this.saldo = "";
		this.id = "";
		this.cdunirecup = "";
		this.contraseña = "";
	}

	
	public Tarjetadebus(String nombre, String saldo, String id) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.id = id;
		
	}
		
	public Tarjetadebus(String nombre, String saldo, String id, String cdunirecup, String contraseña) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.id = id;
		this.cdunirecup = cdunirecup;
		this.contraseña = contraseña;
	}
	
	public void mostrar(String tipoImpresion)
	{
		if (tipoImpresion.equals("Confidencial")) 
		{
			System.out.println("**CONFIDENCIAL**");
			System.out.println("Nombre: "+ this.nombre);
			System.out.println("Saldo: "+ this.saldo);
			System.out.println("ID: "+ this.id);
			System.out.println("cdunirecup: "+ this.cdunirecup);
			System.out.println("contraseña: "+ this.contraseña);
		}
		else 
		{
			System.out.println("**DATOS PUBLICOS**");
			System.out.println("Nombre: "+ this.nombre);
			System.out.println("Saldo: "+ this.saldo);
			System.out.println("ID: "+ this.id);
			
		}
				
		
	}

	
}

