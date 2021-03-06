package barestoque.view.componentes;

import barestoque.view.InicializadorLookAndFeel;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class JNegativeButton extends JButton
{

    public JNegativeButton() 
    {
        setBackground (InicializadorLookAndFeel.COR_BOTAO_NEGATIVO);
    }

    public JNegativeButton(Icon icon)
    {
        super(icon);
        setBackground (InicializadorLookAndFeel.COR_BOTAO_NEGATIVO);
    }

    public JNegativeButton(String text) 
    {
        super(text);
        setBackground (InicializadorLookAndFeel.COR_BOTAO_NEGATIVO);
    }

    public JNegativeButton(Action a) 
    {
        super(a);
        setBackground (InicializadorLookAndFeel.COR_BOTAO_NEGATIVO);
    }

    public JNegativeButton(String text, Icon icon) 
    {
        super(text, icon);
        setBackground (InicializadorLookAndFeel.COR_BOTAO_NEGATIVO);
    }
    
}
