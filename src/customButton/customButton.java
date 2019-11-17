
package customButton;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.border.Border;

public class customButton extends JButton implements MouseListener, MouseMotionListener{

    private Color corInicio = new Color(102, 0, 0);
    private Color corClick = new Color(0, 0, 0);   
    private Color corHover = new Color(204, 51, 0);
    
    private Border borderMoved = javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255));
    
    
    private Color corTXTInicio = new Color(255, 255, 255);
    private Color corTXTClick = new Color(255, 255, 255);
    private Color corTXTHover = new Color(255, 255, 255);
    
    private Font fonte = new Font("Tahoma", Font.BOLD, 14);
    
    @SuppressWarnings("LeakingThisInConstructor")
     public customButton() {
        this.setFont(fonte);
        this.setPreferredSize(new Dimension(150, 35));
        this.setSize(new Dimension(150, 35));
        this.setBorder(null);
        this.setContentAreaFilled(false);
        this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setBackground(this.corInicio);
        this.setForeground(this.corTXTInicio);
        this.setOpaque(true);
        this.setVisible(true);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }
     
     public void paintComponent (Graphics grp){
         super.paintComponent(grp);
     }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    public void mousePressed(MouseEvent e) {
        this.setForeground(this.corTXTClick);
        this.setBackground(this.corClick);
    }

    public void mouseReleased(MouseEvent e) {
        this.setBackground(this.corInicio);
        this.setForeground(this.corTXTInicio);
    }

    public void mouseEntered(MouseEvent e) {
        
    }

    public void mouseExited(MouseEvent e) {
        this.setBorder(null);
        this.setBackground(this.corInicio);
        this.setForeground(this.corTXTInicio);
    }

    public void mouseDragged(MouseEvent e) {
        
    } 
    
     public Color getColorPressed() {
        return corClick;
    }

    public void setColorPressed(Color corClick) {
        this.corClick = corClick;
    }

    public Color getColorTextPressed() {
        return corTXTClick;
    }

    public void setColorTextPressed(Color corTXTClick) {
        this.corTXTClick = corTXTClick;
    }

    public Color getColorHover() {
        return corHover;
    }

    public void setColorHover(Color corHover) {
        this.corHover = corHover;
    }

    public Color getColorTextHover() {
        return corTXTHover;
    }

    public void setColorTextHover(Color corTXTHover) {
        this.corTXTHover = corTXTHover;
    }

    public Color getColorNormal() {
        return corInicio;
    }

    public void setColorNormal(Color corInicio) {
        this.setBackground(corInicio);
        this.corInicio = corInicio;      
    }

    public Color getColorTextNormal() {
        return corTXTInicio;
    }

    public void setColorTextNormal(Color corTXTInicio) {
        this.setForeground(corTXTInicio);
        this.corTXTInicio = corTXTInicio;
    }
    
    public Border getColorBorde() {
        return borderMoved;
    }

    public void setColorBorde(Border borderMoved) {
        this.borderMoved = borderMoved;
    }

    public void mouseMoved(MouseEvent e) {
        
        this.setForeground(this.corTXTHover);
        this.setBackground(this.corHover);
        
        this.setBorder(borderMoved);
    }
}
