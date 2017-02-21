package empresa;

import java.util.Vector;

public class Empleados {
	
	private Vector<Empleado> empleados = new Vector<Empleado>();
	private Departamentos2 d;
	
	public Empleados(Departamentos2 d) {
		this.d=d;
	}
	
	
	public Vector<Empleado> getEmpleados() {
		return empleados;
	}
	
	


	public void menu(){
		int opcion=0;
		do {
			 System.out.println("1. añadir empleado");
			 System.out.println("2. listar empleados");
			 System.out.println("3. modificar empleado");
			 System.out.println("4. borrar empleado");
			 System.out.println("0. salir");
			 opcion=PedirDatos.leerEntero("seleccione una opcion");
			 
			 switch (opcion) {
			case 1:
				addEmpleado();
				break;
			case 2:
				listarEmpleados();
				
				break;
			case 3:
				setEmpleado();
				break;
			case 4:
				borrarEmpleado();
				break;
			case 0:
				System.out.println("has salido del menu");
				break;
			default:
				System.out.println("debe introducir un numero entre 0 y 4");
				break;
			}
		} while (opcion!=0);
	}
	
	private int buscarEmpleado(int empnum){
		for (int i = 0; i < empleados.size(); i++) {
			if(empleados.elementAt(i).getEmpnum()==empnum){
				return i;
			}
		}
		return -1;
	}
	
	private void addEmpleado(){
		int empnum=PedirDatos.leerEntero("Introduzca el número del empleado a añadir.");
		if(buscarEmpleado(empnum)!=-1){
			System.out.println("El empleado con número "+empnum+" ya existe.");
			return;
		}
		int dptonum = PedirDatos.leerEntero("Introduzca el número del departamento del empleado a añadir.");
		
		if(d.buscarDepartamento(dptonum)==-1){
			System.out.println("No existe el departamento al que desea añadir al empleado.");
			return;
		}
		Empleado e = new Empleado();
		e.pedirEmpleado(empnum, dptonum);
		empleados.addElement(e);
		int pos = d.buscarDepartamento(dptonum);
		(d.getDepartamentos())[pos].setTotalsalarios(e.getSalario());
	}
	
	private void listarEmpleados(){
		for (int i = 0; i < empleados.size(); i++) {
			System.out.println(empleados.elementAt(i));
		}
	}

	private void setEmpleado(){
		int empnum=PedirDatos.leerEntero("Introduzca el número del empleado a modificar.");
		int pos=buscarEmpleado(empnum);
		if(pos==-1){
			System.out.println("El empleado con número "+empnum+" no existe");
			return;
		}
		int dptonum = PedirDatos.leerEntero("Introduzca el número del departamento del empleado que quiere modificar.");
		if(d.buscarDepartamento(dptonum)==-1){
			System.out.println("El departamento del empleado que desea modificar no existe.");
			return;
		}
		
		double salarioantiguo = -empleados.elementAt(pos).getSalario();
		(d.getDepartamentos())[pos].setTotalsalarios(salarioantiguo);
		
		Empleado e = new Empleado();
		e.pedirEmpleado(empnum,dptonum);
		empleados.setElementAt(e, pos);
		
		int pos1 = d.buscarDepartamento(dptonum);
		(d.getDepartamentos())[pos1].setTotalsalarios(e.getSalario());
	}
	
	private void borrarEmpleado(){
		int empnum=PedirDatos.leerEntero("Introduzca el número del empleado a eliminar.");
		int pos=buscarEmpleado(empnum);
		if(pos==-1){
			System.out.println("El empleado con número "+empnum+" no existe");
			return;
		}
		empleados.remove(pos);
	}
	
}
