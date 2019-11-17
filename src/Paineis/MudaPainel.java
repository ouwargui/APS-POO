
package Paineis;

import javax.swing.JPanel;

public class MudaPainel {
 
    private JPanel conteiner;
    private JPanel content;
    
    public MudaPainel(JPanel container, JPanel content){
        
        this.conteiner = container;
        this.content = content;
        this.conteiner.removeAll();
        this.conteiner.revalidate();
        this.conteiner.repaint();
        
        this.conteiner.add(this.content);
        this.conteiner.revalidate();
        this.conteiner.repaint();
        
    }
    
}
