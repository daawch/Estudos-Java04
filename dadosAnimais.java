package aula04;

public class dadosAnimais 
{
	public static void main(String[] args) 
	{
		gato gato = new gato ();
		peixe peixe = new peixe();
		passaro passaro = new passaro();
		
		
		gato.setAcao("arranha");
		gato.setIdade(5);
		gato.setNome("zorro");
		
		peixe.setAcao("nada");
		peixe.setIdade(1);
		peixe.setNome("peixonauta");
		
		passaro.setAcao("voa");
		passaro.setIdade(2);
		passaro.setNome("chiquinho gavião");
		
		
	System.out.println("nome do seu gato: "+gato.getNome()+", ele tem "+gato.getIdade()+" anos"+", e ele "+gato.getAcao()+"\n");
	
	System.out.println("nome do seu peixe: "+peixe.getNome()+", ele tem "+peixe.getIdade()+" ano, "+"e ele "+peixe.getAcao()+"\n");
	
	System.out.println("nome do seu passaro: "+passaro.getNome()+", ele tem "+passaro.getIdade()+" anos, "+"e ele "+passaro.getAcao());
	
	}
	
	
	
	
	
	
	
	
	
}
