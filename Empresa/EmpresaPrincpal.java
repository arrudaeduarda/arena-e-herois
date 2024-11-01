package Empresa;

public class EmpresaPrincpal {
	public static void main(String[] args) {
		Departamento departamento1 = new Departamento("RH"); 
		Empresa emp = new Empresa("Senai",departamento1);
		
		departamento1.exibirInfo();
		System.out.println(" ");
		emp.exibirInfo();
	}
}
