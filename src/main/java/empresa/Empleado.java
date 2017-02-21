package empresa;

public class Empleado {
	
	private int empnum;
	private String apellido;
	private String oficio;
	private double salario;
	private double comision;
	private int dir;
	private int dptonum;
	private String fechaalta;
	private double totalsalario;
	
	public Empleado() {

	}

	public Empleado(int empnum, String apellido, String oficio, double salario, double comision, int dir, int dptonum,
			String fechaalta) {
		this.empnum = empnum;
		this.apellido = apellido;
		this.oficio = oficio;
		this.salario = salario;
		this.comision = comision;
		this.dir = dir;
		this.dptonum = dptonum;
		this.fechaalta = fechaalta;
	}

	public int getEmpnum() {
		return empnum;
	}

	public void setEmpnum(int empnum) {
		this.empnum = empnum;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

	public int getDptonum() {
		return dptonum;
	}

	public void setDptonum(int dptonum) {
		this.dptonum = dptonum;
	}

	public String getFechaalta() {
		return fechaalta;
	}

	public void setFechaalta(String fechaalta) {
		this.fechaalta = fechaalta;
	}

	public double getTotalsalario() {
		return totalsalario;
	}

	public void setTotalsalario(double totalsalario) {
		this.totalsalario = totalsalario;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (Double.doubleToLongBits(comision) != Double.doubleToLongBits(other.comision))
			return false;
		if (dir != other.dir)
			return false;
		if (dptonum != other.dptonum)
			return false;
		if (empnum != other.empnum)
			return false;
		if (fechaalta == null) {
			if (other.fechaalta != null)
				return false;
		} else if (!fechaalta.equals(other.fechaalta))
			return false;
		if (oficio == null) {
			if (other.oficio != null)
				return false;
		} else if (!oficio.equals(other.oficio))
			return false;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}

	public String toString() {
		return "Empleado [empnum=" + empnum + ", apellido=" + apellido + ", oficio=" + oficio + ", salario=" + salario
				+ ", comision=" + comision + ", dir=" + dir + ", dptonum=" + dptonum + ", fechaalta=" + fechaalta + "]";
	}
	
	public void pedirEmpleado(int empnum){
		this.empnum=empnum;
		this.apellido=PedirDatos.leerCadena("Introduzca el apellido del empleado.");
		this.oficio=PedirDatos.leerCadena("Introduzca el oficio del empleado.");
		this.salario=PedirDatos.leerDecimal("Introduzca el salario del empleado.");
		this.comision=PedirDatos.leerDecimal("Introduzca la comisión del empleado.");
		this.dir=PedirDatos.leerEntero("Introduzca el director del empleado.");
		this.dptonum=PedirDatos.leerEntero("Introduzca el número del departamento.");
		this.fechaalta=PedirDatos.leerCadena("Introduzca la fecha de alta.");
		this.totalsalario=this.salario+this.comision;
	}
	public void pedirEmpleado(int empnum,int dptonum){
		this.empnum=empnum;
		this.apellido=PedirDatos.leerCadena("Introduzca el apellido del empleado.");
		this.oficio=PedirDatos.leerCadena("Introduzca el oficio del empleado.");
		this.salario=PedirDatos.leerDecimal("Introduzca el salario del empleado.");
		this.comision=PedirDatos.leerDecimal("Introduzca la comisión del empleado.");
		this.dir=PedirDatos.leerEntero("Introduzca el director del empleado.");
		this.dptonum=dptonum;
		this.fechaalta=PedirDatos.leerCadena("Introduzca la fecha de alta.");
		this.totalsalario=this.salario+this.comision;
	}

	
}
