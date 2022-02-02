package aula04;

import java.util.Scanner;

public class gato extends animal
{
	private String acao;
	
	@Override
	public void som()
	{
		super.som();
		
		System.out.println("miado...");
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
