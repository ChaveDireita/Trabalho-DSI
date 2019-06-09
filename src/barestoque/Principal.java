package barestoque;

import barestoque.view.InicializadorLookAndFeel;
import barestoque.view.Janela;
import barestoque.view.telas.TelaInicial;
import barestoque.view.telas.TelaMenu;
import barestoque.view.telas.produto.TelaProduto;
import javax.swing.SwingUtilities;

public class Principal
{
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> 
        {
            new InicializadorLookAndFeel ().init();
            Janela j = new Janela ("Teste", 1280, 768, true);
            j.aparecer();
            j.setCena(new TelaInicial(j));
        });
        
        
    }
}
