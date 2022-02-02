package aula04;

public class peixe extends animal
{
	private String acao;
	
	
	@Override
	public void som()
	{
		super.som();
		
		System.out.println("ronco...");
	}
	
	
	public String getAcao()
	{
		return acao;
	}
	
	public void setAcao(String acao)
	{
		this.acao=acao;
	}
	
}
