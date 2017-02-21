package empresa;

public class Departamentos {
	 private Departamento[] departamentos=new Departamento[100];
	 private int posicion=0;
	 private Empleados e;
	 
	 
	 

	public void menu(){
		 int opcion=0;
		do {
			 System.out.println("1. añadir departamento");
			 System.out.println("2. listar departamento");
			 System.out.println("3. modificar departamento");
			 System.out.println("4. borrar departamento");
			 System.out.println("5. Mostrar total salario de un departamento.");
			 System.out.println("6. Mostrar total salarios de los departamentos.");
			 System.out.println("0. salir");
			 opcion=PedirDatos.leerEntero("seleccione una opcion");
			 
			 switch (opcion) {
			case 1:
				addDepartamento();
				break;
			case 2:
				listarDepartamento();
				
				break;

			case 3:
				setDepartamento();
				break;

			case 4:
				borrarDepartamento();
				break;
			case 5:
				mostrarSalarioDepartamento();
				break;
			case 6:
				mostrarSalarios();
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
	 
	public void setEmpleados(Empleados e){
		this.e=e;
		
	}
	 private void mostrarSalarioDepartamento() {
		double totalsalarios = 0; 
		int dptonum = PedirDatos.leerEntero("Introduzca el número del departamento del que desea consultar el salario.");
		for (int i = 0; i < e.getEmpleados().size(); i++) {
			if(e.getEmpleados().elementAt(i).getDptonum()==dptonum){
				totalsalarios += e.getEmpleados().elementAt(i).getSalario();
			}
		}
		System.out.println("El salario total del departamento "+dptonum+" es de "+ totalsalarios+" euros.");
	}

	private void mostrarSalarios() {
		double totalsalarios;
		for (int i = 0; i < posicion; i++) {
			totalsalarios = 0;
			int dptonum = departamentos[i].getDptonum();
			for (int j = 0; j < e.getEmpleados().size(); j++) {
				if(e.getEmpleados().elementAt(j).getDptonum()==dptonum){
					totalsalarios += e.getEmpleados().elementAt(j).getSalario();
				}
			}
			System.out.println("El salario total del departamento "+dptonum+" es de "+ totalsalarios+" euros.");		}
		}

	public int buscarDepartamento(int dptonum){
		for (int i = 0; i < posicion; i++) {
			if(dptonum==departamentos[i].getDptonum()){
				return i;
			}	
		}
		return -1;	
	}

	private void addDepartamento() {
		int dptonum=PedirDatos.leerEntero("introduzca el numero de departamento que desea añadir");
		int pos=buscarDepartamento(dptonum);
		if(pos!=-1){
			System.out.println("el departamento ya existe");
			return;
		}
		Departamento d=new Departamento();
		d.pedirDepartamento(dptonum);
		departamentos[posicion]=d;
		posicion++;		
	}
	
	private void listarDepartamento() {
		for (int i = 0; i < posicion; i++) {
			System.out.println(departamentos[i]);
		}		
	}
	
	private void setDepartamento() {
		int dptonum=PedirDatos.leerEntero("inserte el codigo del departamento que desea modificar");
		int pos=buscarDepartamento(dptonum);
		if(pos==-1){
			System.out.println("el departamento no existe, no se puede modificar");
			return;
		}
		Departamento d=new Departamento();
		d.pedirDepartamento(dptonum);
		departamentos[pos]=d;	
	}

	private void borrarDepartamento() {
		int dptonum=PedirDatos.leerEntero("inserte el numero del departamento que desea eliminar");
		int pos=buscarDepartamento(dptonum);
		if(pos==-1){
			System.out.println("el departamento no existe, no se puede eliminar");
			return;
		}
		for (int i = pos; i < posicion; i++) {
			departamentos[i]=departamentos[i+1];
		}
		posicion--;	
	}
	
}
