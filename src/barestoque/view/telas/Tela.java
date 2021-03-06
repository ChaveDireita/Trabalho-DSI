package barestoque.view.telas;

import barestoque.view.Janela;
import java.awt.GridBagLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

public abstract class Tela extends JPanel
{
    protected JComponent[][] mapa;
    protected Janela pai;
    protected int linhas,
                  colunas;
    
    protected JPanel painelSuporte;
    
    
    public Tela (Janela pai, int linhas, int colunas)
    {
        this.pai = pai;
        this.linhas = linhas;
        this.colunas = colunas;
        
        painelSuporte = new JPanel ();
        
        mapa = new JComponent[linhas][colunas];
        for (int i = 0; i < mapa.length; i++)
            for (int j = 0; j < mapa[i].length; j++)
                mapa[i][j] = new JPanel ();
    }
    
    public void insertMapa (JComponent jc, int linha, int coluna)
    {
        mapa[linha][coluna] = jc;
    }
    
    protected void montarTela ()
    {
        for (JComponent[] jcarray : mapa)
            for (JComponent jc : jcarray)
                    add (jc);
    } 

    public JComponent[][] getMapa() 
    {
        return mapa;
    }

    public Janela getPai()
    {
        return pai;
    }

    public int getLinhas()
    {
        return linhas;
    }

    public int getColunas()
    {
        return colunas;
    }

    public JPanel getPainelSuporte() 
    {
        return painelSuporte;
    }
    
    
}
