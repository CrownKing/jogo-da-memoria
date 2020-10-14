package telas;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaPrincipal extends JFrame{

	private static final long serialVersionUID = 1L;
	private JButton botao1;
	private JButton botao2;
	private JPanel painel;

	public TelaPrincipal() {
		super ("Jogo da memoria");
		this.setBounds(400, 300, 350, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		painel = new JPanel();
		this.add(painel);
		painel.setLayout(null);
		
		botao1 = new JButton ("Botao1");
		painel.add(botao1);
		botao1.setBounds(10,10,50, 50);
		
		botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("o botao foi apertado");
			}
		});
		
		botao2= new JButton ("botao2");
		painel.add(botao2);
		botao2.setBounds(60, 10, 50, 50);
	}

}
