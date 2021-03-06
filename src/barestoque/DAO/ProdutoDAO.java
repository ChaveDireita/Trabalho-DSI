package barestoque.DAO;

import barestoque.model.Categoria;
import barestoque.model.Fornecedor;
import barestoque.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDAO extends ClasseDAO <Produto>{
    
    public ProdutoDAO(){
        super ("produto", new String[] {"codigo", "nome", "valor", "unidade", "quantidade", "codigo_categoria", "codigo_fornecedor"});
    }
    
    public void adicionarQuantidade (int codigo, int valor)
    {
        updateSet(new String[] {"quantidade"}, new Object[] {"quantidade + " + valor}, "codigo = " + codigo);
    }
    
    public void removerQuantidade (int codigo, int valor)
    {
        updateSet(new String[] {"quantidade"}, new Object[] {"quantidade - " + valor}, "codigo = " + codigo);
    }
    
    public void inserirProduto(Produto p){
        p.setCategoria(new CategoriaDAO().getCategoriaDeNome(p.getCategoria().getNome()));
        insertInto(p);
    }
    
    public void inserir (Produto p)
    {
        p.setCategoria(new CategoriaDAO().getCategoriaDeNome(p.getCategoria().getNome()));
        insertInto(p);
    }
    
    public ArrayList <Produto> listaDeProdutos ()
    {
        return selectAllFrom();
    }
    
    public Produto getProdutoDeCodigo (int codigo)
    {
        ArrayList <Produto> plista = selectFromWhere("codigo = " + codigo);
        if (plista.isEmpty())
            return null;
        return plista.get(0);
    }
    
    public ArrayList <Produto> listaDeProdutosDeCategoria (Categoria c)
    {
        ArrayList <Produto> pArray = selectFromWhere("codigo_categoria = " + c.getCodigo());
        if (pArray == null)
            return new ArrayList<Produto> ();
        return pArray;
    }
    
    @Override
    protected Produto montarObjeto(ResultSet resultado) throws SQLException
    {
        String nome = resultado.getString("nome"),
               unidade = resultado.getString("unidade");
        
        int quantidade = resultado.getInt("quantidade"),
            codigo_categoria = resultado.getInt("codigo_categoria"),
            codigo_fornecedor = resultado.getInt("codigo_fornecedor"),
            codigo = resultado.getInt("codigo");
        
        double valor = resultado.getDouble("valor");
        
        Categoria categoria = new CategoriaDAO().getCategoriaDeCodigo(codigo_categoria);
        Fornecedor fornecedor = new FornecedorDAO().getFornecedorDeCodigo(codigo_fornecedor);
        
        Produto p = new Produto (codigo, nome, valor, unidade, quantidade, categoria, fornecedor);
        
        return p;
    }

    @Override
    protected Object[] desmontarObjeto(Produto produto) 
    {
        Object[] o = new Object[6];
        o[0] = produto.getNome();
        o[1] = produto.getValor();
        o[2] = produto.getUnidade();
        o[3] = produto.getQuantidade();
        o[4] = produto.getCategoria().getCodigo();
        o[5] = produto.getFornecedor().getCodigo();
        
        return o;
    }
    
    public Object[] desmontarParaLista (Produto produto)
    {
        Object[] o = new Object[6];
        
        o[0] = produto.getCodigo();
        o[1] = produto.getNome();
        o[2] = produto.getValor();
        o[3] = produto.getUnidade();
        o[4] = produto.getQuantidade();
        o[5] = produto.getFornecedor().getNome();
        
        return o;
    }
    
}

