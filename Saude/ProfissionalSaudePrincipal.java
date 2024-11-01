package Saude;

public class ProfissionalSaudePrincipal {
	public static void main(String[] args) {
		Medico medico = new Medico("Eduardo","Anestesiología",15000,"00000000-0/BR");
		Dentista dentista = new Dentista ("Joab","Odontopediatria",1900,"0-0000.000/BR");
		Fisioterapeuta fisioterapeuta = new Fisioterapeuta ("Pedro","Fisioterapia Aquática",19900,"00-0.000.000/BR");
		
		medico.agendaConsulta();
		dentista.agendaConsulta();
		fisioterapeuta.agendaConsulta();
	}
}
