/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import views.SystemViews;


/**
 *
 * @author USER
 */
public class SettingsControllers implements MouseListener{
    
  private SystemViews views;
  public SettingsControllers (SystemViews views){
      this.views=views;
      
      
      this.views.jLabelPurchases.addMouseListener(this);
      this.views.jLabelCustomers.addMouseListener(this);
      this.views.jLabelEmployes.addMouseListener(this);
      this.views.jLabelSuplimers.addMouseListener(this);
      this.views.jLabelCategorias.addMouseListener(this);
      this.views.jLabelReportes.addMouseListener(this);
      this.views.jLabelSetting.addMouseListener(this);
      this.views.jLabelSales.addMouseListener(this);
  }
    @Override
    public void mouseClicked(MouseEvent e) {
      
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
         if(e.getSource()==views.jLabelPurchases){
            views.jPanelPutchase.setBackground(new Color(152,202,63));
        }
          else if(e.getSource()==views.jLabelSales){
            views.jPanelSales.setBackground(new Color(152,202,63));
        }
         else if(e.getSource()==views.jLabelCustomers){
            views.jPanelCustomers.setBackground(new Color(152,202,63));
        }
         else if(e.getSource()==views.jLabelEmployes){
            views.jPanelEmployes.setBackground(new Color(152,202,63));
        }
         else if(e.getSource()==views.jLabelSuplimers){
            views.jPanelSuplimers.setBackground(new Color(152,202,63));
        }
         else if(e.getSource()==views.jLabelCategorias){
            views.jPanelCategorias.setBackground(new Color(152,202,63));
        }
         else if(e.getSource()==views.jLabelReportes){
            views.jPanelReportes.setBackground(new Color(152,202,63));
        }
         else if(e.getSource()==views.jLabelSetting){
            views.jPanelSetting.setBackground(new Color(152,202,63));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
         if(e.getSource()==views.jLabelPurchases){
            views.jPanelPutchase.setBackground(new Color(255,255,255));
        }
                 else if(e.getSource()==views.jLabelSales){
            views.jPanelSales.setBackground(new Color(255,255,255));
        }
         else if(e.getSource()==views.jLabelCustomers){
            views.jPanelCustomers.setBackground(new Color(255,255,255));
        }
         else if(e.getSource()==views.jLabelEmployes){
            views.jPanelEmployes.setBackground(new Color(255,255,255));
        }
         else if(e.getSource()==views.jLabelSuplimers){
            views.jPanelSuplimers.setBackground(new Color(255,255,255));
        }
         else if(e.getSource()==views.jLabelCategorias){
            views.jPanelCategorias.setBackground(new Color(255,255,255));
        }
         else if(e.getSource()==views.jLabelReportes){
            views.jPanelReportes.setBackground(new Color(255,255,255));
        }
         else if(e.getSource()==views.jLabelSetting){
            views.jPanelSetting.setBackground(new Color(255,255,255));
        }
    }

    
    
}
    