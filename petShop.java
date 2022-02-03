package aula04;

import java.util.ArrayList;
import java.util.Collection;


public class petShop
{
	public static void main(String[] args)
	{
	Collection<String> produtos = new ArrayList();
	produtos.add("ração de gato\n");
	produtos.add("alpiste\n");
	produtos.add("ração para peixe\n");
	produtos.add("coleira\n");
	
	System.out.println("nosso catálogo: \n"+produtos);
	
	produtos.remove("alpiste");
	
	System.out.println("nosso catálogo (atualizado): \n"+produtos);
	}
	
}
