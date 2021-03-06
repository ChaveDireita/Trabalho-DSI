package barestoque.view.telas.compra;

import barestoque.DAO.ProdutoDAO;
import barestoque.controller.ControladorCadastroLista;
import barestoque.model.Produto;
import barestoque.view.InicializadorLookAndFeel;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;

public class CadastroCompra extends javax.swing.JPanel
{
    Produto[] listaProduto;
    
    public CadastroCompra ()
    {
        ArrayList <Produto> lProduto = new ProdutoDAO ().listaDeProdutos();
        listaProduto = new Produto[lProduto.size()];
        lProduto.toArray(listaProduto);
        initComponents ();
        setBackground(InicializadorLookAndFeel.COR_FOREGROUND);
        
        msgErro.setText ("");
        
        spinnerQuantidade.addChangeListener (new ControladorCadastroLista (this));
        comboBoxProduto.addActionListener (new ControladorCadastroLista (this));
        botaoAdd.addActionListener (new ControladorCadastroLista (this));
        botaoLimpar.addActionListener (new ControladorCadastroLista (this));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        comboBoxProduto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        spinnerQuantidade = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        labelPreco = new javax.swing.JLabel();
        botaoLimpar = new barestoque.view.componentes.JNegativeButton ();
        botaoAdd = new barestoque.view.componentes.JPositiveButton ();
        msgErro = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Efetuar Comprar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Produto");

        comboBoxProduto.setModel(new javax.swing.DefaultComboBoxModel<Produto> (listaProduto));

        jLabel2.setText("Quantidade");

        spinnerQuantidade.setFont(barestoque.view.InicializadorLookAndFeel.FONTE_LABEL_PADRAO);
        spinnerQuantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel3.setText("Valor(R$):");

        labelPreco.setText("0");

        botaoLimpar.setText("X");
        botaoLimpar.setPreferredSize(new java.awt.Dimension(40, 40));

        botaoAdd.setText("+");
        botaoAdd.setPreferredSize(new java.awt.Dimension(40, 40));

        msgErro.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPreco))
                    .addComponent(jLabel1)
                    .addComponent(msgErro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 111, Short.MAX_VALUE)
                        .addComponent(botaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(msgErro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(labelPreco))))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public JButton getBotaoAdd() {
        return botaoAdd;
    }

    public JButton getBotaoLimpar() {
        return botaoLimpar;
    }

    public JComboBox<Produto> getComboBoxProduto() {
        return comboBoxProduto;
    }

    public JLabel getLabelPreco() {
        return labelPreco;
    }

    public JSpinner getSpinnerQuantidade() {
        return spinnerQuantidade;
    }

    public JLabel getMsgErro() {
        return msgErro;
    }
    
    public void limparDados ()
    {
        spinnerQuantidade.setValue(1);
        atualizarPreco();
    }
    
    public void atualizarPreco ()
    {
        int quantidade = (Integer) spinnerQuantidade.getValue ();
        labelPreco.setText("" + (((Produto) comboBoxProduto.getSelectedItem()).getValor()*quantidade));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdd;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JComboBox<Produto> comboBoxProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel msgErro;
    private javax.swing.JSpinner spinnerQuantidade;
    // End of variables declaration//GEN-END:variables
}
