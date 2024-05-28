package org.example;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PantallaGenerarRanking {
    private JFrame ventana;
    private JDateChooser dateChooserDesde;
    private JDateChooser dateChooserHasta;
    private Font fuenteGrande;

    public PantallaGenerarRanking() {
        ventana = new JFrame("Mi Ventana Simple");
        ventana.setSize(600, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new FlowLayout());

        fuenteGrande = new Font("Arial", Font.PLAIN, 20);

        dateChooserDesde = new JDateChooser();
        dateChooserHasta = new JDateChooser();
    }

    public void opcGenerarRankingVinos(GestorGenerarRanking gestor, PantallaGenerarRanking pantalla){
        this.habilitarVentana(gestor, pantalla);
    }

    public void habilitarVentana(GestorGenerarRanking gestor, PantallaGenerarRanking pantalla) {
        JLabel etiqueta = new JLabel("Generar ranking de vinos, elija las fechas a filtrar:");
        etiqueta.setFont(pantalla.fuenteGrande); // Aplica la fuente grande a la etiqueta
        pantalla.ventana.add(etiqueta);
        pantalla.ventana.setVisible(true);
        gestor.opcGenerarRankingVinos(this, gestor);
    }

    public void solicitarSeleccionFechas(GestorGenerarRanking gestor, PantallaGenerarRanking pantalla){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel labelDesde = new JLabel("Fecha desde:");
        labelDesde.setFont(pantalla.fuenteGrande); // Aplica la fuente grande al label
        panel.add(labelDesde);
        pantalla.dateChooserDesde.setFont(pantalla.fuenteGrande);
        panel.add(pantalla.dateChooserDesde);

        JLabel labelHasta = new JLabel("Fecha hasta:");
        labelHasta.setFont(pantalla.fuenteGrande); // Aplica la fuente grande al label
        panel.add(labelHasta);
        pantalla.dateChooserHasta.setFont(pantalla.fuenteGrande);
        panel.add(pantalla.dateChooserHasta);

        JButton btnFiltrar = new JButton("Filtrar");
        btnFiltrar.setFont(pantalla.fuenteGrande); // Aplica la fuente grande al botón
        btnFiltrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date fechaDesde = pantalla.dateChooserDesde.getDate();
                Date fechaHasta = pantalla.dateChooserHasta.getDate();
                gestor.tomarSeleccionFechas(pantalla, gestor, fechaDesde, fechaHasta);
            }
        });
        panel.add(btnFiltrar);

        pantalla.ventana.add(panel);
        pantalla.ventana.setVisible(true);
    }
    public void solicitarSeleccionTipoResena(PantallaGenerarRanking pantalla, GestorGenerarRanking gestor){
        // Borra t0do lo que está en la ventana
        pantalla.ventana.getContentPane().removeAll();
        pantalla.ventana.repaint();

        // Crea un panel para agregar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Crea un JComboBox para permitir al usuario seleccionar si el tipo es "premium" o "no es premium"
        String[] tipos = { "Es premium", "No es premium" };
        JComboBox<String> comboBoxTipos = new JComboBox<>(tipos);
        comboBoxTipos.setFont(pantalla.fuenteGrande); // Aplica la fuente grande al JComboBox

        // Agrega el JComboBox al panel
        panel.add(comboBoxTipos);

        // Crea un botón para que el usuario confirme su selección
        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setFont(pantalla.fuenteGrande); // Aplica la fuente grande al botón
        btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tipoSeleccionado = (String) comboBoxTipos.getSelectedItem();
                gestor.tomarSeleccionTipoResena(pantalla, gestor, tipoSeleccionado);
            }
        });

        // Agrega el botón al panel
        panel.add(btnConfirmar);

        // Agrega el panel a la ventana y la hace visible
        pantalla.ventana.add(panel);
        pantalla.ventana.setVisible(true);
    }
    public void solicitarSeleccionFormaVisualizacion(PantallaGenerarRanking pantalla, GestorGenerarRanking gestor){
        // Borra t0do lo que está en la ventana
        pantalla.ventana.getContentPane().removeAll();
        pantalla.ventana.repaint();

        // Crea un panel para agregar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Crea un JComboBox para permitir al usuario seleccionar si el tipo es "premium" o "no es premium"
        String[] tipos = { "Excel", "Pantalla", "Realidad Virtual" };
        JComboBox<String> comboBoxTipos = new JComboBox<>(tipos);
        comboBoxTipos.setFont(pantalla.fuenteGrande); // Aplica la fuente grande al JComboBox

        // Agrega el JComboBox al panel
        panel.add(comboBoxTipos);

        // Crea un botón para que el usuario confirme su selección
        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setFont(pantalla.fuenteGrande); // Aplica la fuente grande al botón
        btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tipoSeleccionado = (String) comboBoxTipos.getSelectedItem();
                gestor.tomarSeleccionFormaVisualizacion(pantalla, gestor, tipoSeleccionado);
            }
        });

        // Agrega el botón al panel
        panel.add(btnConfirmar);

        // Agrega el panel a la ventana y la hace visible
        pantalla.ventana.add(panel);
        pantalla.ventana.setVisible(true);
    }

    public void solicitarConfirmacionReporte(PantallaGenerarRanking pantalla, GestorGenerarRanking gestor) {
        // Crea un panel para agregar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Crea un mensaje de confirmación
        JLabel mensaje = new JLabel("¿Desea generar el reporte?");
        mensaje.setFont(pantalla.fuenteGrande); // Aplica la fuente grande al mensaje
        panel.add(mensaje);

        // Crea botones para confirmar o cancelar
        JButton btnSi = new JButton("Sí");
        btnSi.setFont(pantalla.fuenteGrande); // Aplica la fuente grande al botón
        btnSi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestor.tomarConfirmacionReporte(pantalla, gestor);
            }
        });
        panel.add(btnSi);

        JButton btnNo = new JButton("No");
        btnNo.setFont(pantalla.fuenteGrande); // Aplica la fuente grande al botón
        btnNo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.ventana.dispose();
            }
        });
        panel.add(btnNo);

        // Agrega el panel a la ventana y la hace visible
        pantalla.ventana.getContentPane().removeAll();
        pantalla.ventana.repaint();
        pantalla.ventana.add(panel);
        pantalla.ventana.setVisible(true);
    }
}


