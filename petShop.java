package aula04;

import java.util.ArrayList;
import java.util.Collection;


public class petShop
{
	public static void main(String[] args)
	{
	Collection<String> produtos = new ArrayList();
	produtos.add("ra��o de gato\n");
	produtos.add("alpiste\n");
	produtos.add("ra��o para peixe\n");
	produtos.add("coleira\n");
	
	System.out.println("nosso cat�logo: \n"+produtos);
	
	produtos.remove("alpiste");
	
	System.out.println("nosso cat�logo (atualizado): \n"+produtos);
	}
	
}
