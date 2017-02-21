package empresa;

public class Departamento {
	
	private int dptonum;
	private String dnombre;
	private String loc;
	private double totalsalarios;
	
	public Departamento() {
		// TODO Apéndice de constructor generado automáticamente
	}

	public Departamento(int dptonum, String dnombre, String loc) {
		super();
		this.dptonum = dptonum;
		this.dnombre = dnombre;
		this.loc = loc;
	}

	public int getDptonum() {
		return dptonum;
	}

	public void setDptonum(int dptonum) {
		this.dptonum = dptonum;
	}

	public String getDnombre() {
		return dnombre;
	}

	public void setDnombre(String dnombre) {
		this.dnombre = dnombre;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Departamento [dptonum=" + dptonum + ", dnombre=" + dnombre + ", loc=" + loc + "]";
	}

	

	public double getTotalsalarios() {
		return totalsalarios;
	}

	public void setTotalsalarios(double totalsalarios) {
		this.totalsalarios += totalsalarios;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		if (dnombre == null) {
			if (other.dnombre != null)
				return false;
		} else if (!dnombre.equals(other.dnombre))
			return false;
		if (dptonum != other.dptonum)
			return false;
		if (loc == null) {
			if (other.loc != null)
				return false;
		} else if (!loc.equals(other.loc))
			return false;
		return true;
	}
	
	public void pedirDepartamento(int dptonum){
		this.dptonum=dptonum;
		this.dnombre=PedirDatos.leerCadena("inserte en nombre del departamento");
		this.loc=PedirDatos.leerCadena("inserte la localizacion del departamento");
	}	
	public void pedirDepartamento(){
		this.dptonum=PedirDatos.leerEntero("inserte el numero del departamento");
		this.dnombre=PedirDatos.leerCadena("inserte en nombre del departamento");
		this.loc=PedirDatos.leerCadena("inserte la localizacion del departamento");	
	}	
}
