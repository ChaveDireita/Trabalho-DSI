package barestoque.model;

import java.util.ArrayList;
import java.util.Set;

public class Venda extends EntidadeBanco implements Valoravel, Quantificavel
{
    private Cliente cliente;
    private Prato prato;
    private double valor;
    private int quantidade;

    public Venda (int codigo, Cliente cliente, Prato prato, int quantidade)
    {
        super (codigo);
        this.cliente = cliente;
        this.prato = prato;
        calcularValor ();
        setQuantidade (quantidade);
    }

    public Venda ()
    {
        super (-1);
    }
    
    public double getValor() 
    {
        return valor;
    }
    
    public void calcularValor() throws IllegalArgumentException{
        this.valor = prato.getValor ()*quantidade;
    }

    public Cliente getCliente ()
    {
        return cliente;
    }

    public Prato getPrato ()
    {
        return prato;
    }

    public int getQuantidade ()
    {
        return quantidade;
    }
    
    public void setCliente (Cliente cliente)
    {
        this.cliente = cliente;
    }

    public void setPrato (Prato prato)
    {
        this.prato = prato;
    }

    public void setQuantidade (int quantidade) throws IllegalArgumentException
    {
        if (!validarQuantidade (quantidade))
            throw new IllegalArgumentException ();
        this.quantidade = quantidade;
    }
    
    public boolean checarViabilidade ()
    {
        Set <Produto> chaves = prato.getMedidaIngredientes ().keySet ();
        
        for (Produto p : chaves)
        {
            int quantidadeEstoque = p.getQuantidade ();
            int quantidadeNecessaria = quantidade * prato.getMedidaIngredientes ().getOrDefault (p, 0);
            
            if (quantidadeEstoque < quantidadeNecessaria)
                return false;
        }
        return true;
    }
    
}
