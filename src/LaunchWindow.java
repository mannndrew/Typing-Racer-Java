import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LaunchWindow {
	
	FileInput resource = new FileInput();
	ImageIcon image = new ImageIcon(resource.workingDir + "\\keyboard.png");
	JTextArea WPM = new JTextArea();
	JTextField textField = new JTextField();
	JLabel normalText = new JLabel();                   
	JLabel blueText = new JLabel();
	JLabel redText = new JLabel();
	JLabel keyboard = new JLabel(image);
	
	public LaunchWindow() {
		
		WPM.setFont(new Font("Monospaced", Font.PLAIN, 14));
		WPM.setForeground(new Color(0xFFFFFF));
		WPM.setBackground(Color.darkGray);
		WPM.setLineWrap(true);
		WPM.setWrapStyleWord(true);
		WPM.setFocusable(false);
		WPM.setText("WPM: \n\n\nTime: \n\n\nSentences Completed:");
		
		textField.setPreferredSize(new Dimension(400,30));
		textField.setForeground(new Color(0xFFFFFF));
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white);
		
		normalText.setOpaque(false);
		normalText.setBounds(150, 0, 500, 150);
		normalText.setForeground(new Color(0xFFFFFF));
		normalText.setFont(new Font("Monospaced", Font.PLAIN, 20));
		
		blueText.setOpaque(false);
		blueText.setBounds(150, 0, 500, 150);
		blueText.setForeground(new Color(0x00FFFF));
		blueText.setFont(new Font("Monospaced", Font.PLAIN, 20));
		
		redText.setOpaque(false);
		redText.setBounds(150, 0, 500, 150);
		redText.setForeground(new Color(0xFF0000));
		redText.setFont(new Font("Monospaced", Font.PLAIN, 20));
		
		keyboard.setBounds(0, 0, 545, 200);
		
		JPanel Q = new JPanel();
		Q.setBounds(66, 47, 30, 31);
		Q.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel W = new JPanel();
		W.setBounds(102, 47, 30, 31);
		W.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel E = new JPanel();
		E.setBounds(137, 47, 30, 31);
		E.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel R = new JPanel();
		R.setBounds(173, 47, 30, 31);
		R.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel T = new JPanel();
		T.setBounds(209, 47, 30, 31);
		T.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel Y = new JPanel();
		Y.setBounds(245, 47, 30, 31);
		Y.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel U = new JPanel();
		U.setBounds(280, 47, 30, 31);
		U.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel I = new JPanel();
		I.setBounds(316, 47, 30, 31);
		I.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel O = new JPanel();
		O.setBounds(352, 47, 30, 31);
		O.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel P = new JPanel();
		P.setBounds(387, 47, 30, 31);
		P.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel A = new JPanel();
		A.setBounds(79, 83, 30, 31);
		A.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel S = new JPanel();
		S.setBounds(114, 83, 30, 31);
		S.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel D = new JPanel();
		D.setBounds(149, 83, 31, 31);
		D.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel F = new JPanel();
		F.setBounds(184, 83, 31, 31);
		F.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel G = new JPanel();
		G.setBounds(219, 83, 31, 31);
		G.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel H = new JPanel();
		H.setBounds(255, 83, 31, 31);
		H.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel J = new JPanel();
		J.setBounds(290, 83, 31, 31);
		J.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel K = new JPanel();
		K.setBounds(325, 83, 31, 31);
		K.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel L = new JPanel();
		L.setBounds(360, 83, 31, 31);
		L.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel Z = new JPanel();
		Z.setBounds(91, 119, 31, 31);
		Z.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel X = new JPanel();
		X.setBounds(127, 119, 31, 31);
		X.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel C = new JPanel();
		C.setBounds(163, 119, 31, 31);
		C.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel V = new JPanel();
		V.setBounds(198, 119, 31, 31);
		V.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel B = new JPanel();
		B.setBounds(234, 119, 31, 31);
		B.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel N = new JPanel();
		N.setBounds(270, 119, 31, 31);
		N.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel M = new JPanel();
		M.setBounds(306, 119, 31, 31);
		M.setBackground(new Color(0f, 0f, 0f, 1f));
		
		JPanel Space = new JPanel();
		Space.setBounds(166, 155, 173, 33);
		Space.setBackground(new Color(0f, 0f, 0f, 1f));

		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.darkGray);
		bottomPanel.add(textField);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setPreferredSize(new Dimension(120, 0));
		leftPanel.setBackground(Color.darkGray);
		leftPanel.add(WPM);
		
		JPanel rightPanel = new JPanel();
		rightPanel.setPreferredSize(new Dimension(120, 0));
		rightPanel.setBackground(Color.darkGray);
		
		JPanel centerBackground = new JPanel();
		centerBackground.setBackground(Color.darkGray);
		centerBackground.setSize(800,400);
		
		JPanel topBackground = new JPanel();
		topBackground.setBackground(Color.darkGray);
		topBackground.setSize(800,400);
		
		JLayeredPane centerPanel = new JLayeredPane();
		centerPanel.add(centerBackground, Integer.valueOf(0));
		centerPanel.add(Q, Integer.valueOf(1));
		centerPanel.add(W, Integer.valueOf(1));
		centerPanel.add(E, Integer.valueOf(1));
		centerPanel.add(R, Integer.valueOf(1));
		centerPanel.add(T, Integer.valueOf(1));
		centerPanel.add(Y, Integer.valueOf(1));
		centerPanel.add(U, Integer.valueOf(1));
		centerPanel.add(I, Integer.valueOf(1));
		centerPanel.add(O, Integer.valueOf(1));
		centerPanel.add(P, Integer.valueOf(1));
		centerPanel.add(A, Integer.valueOf(1));
		centerPanel.add(S, Integer.valueOf(1));
		centerPanel.add(D, Integer.valueOf(1));
		centerPanel.add(F, Integer.valueOf(1));
		centerPanel.add(G, Integer.valueOf(1));
		centerPanel.add(H, Integer.valueOf(1));
		centerPanel.add(J, Integer.valueOf(1));
		centerPanel.add(K, Integer.valueOf(1));
		centerPanel.add(L, Integer.valueOf(1));
		centerPanel.add(Z, Integer.valueOf(1));
		centerPanel.add(X, Integer.valueOf(1));
		centerPanel.add(C, Integer.valueOf(1));
		centerPanel.add(V, Integer.valueOf(1));
		centerPanel.add(B, Integer.valueOf(1));
		centerPanel.add(N, Integer.valueOf(1));
		centerPanel.add(M, Integer.valueOf(1));
		centerPanel.add(Space, Integer.valueOf(1));
		centerPanel.add(keyboard, Integer.valueOf(2));
		
		JLayeredPane topPanel = new JLayeredPane();
		topPanel.setPreferredSize(new Dimension(400,120));
		topPanel.add(topBackground, Integer.valueOf(0));
		topPanel.add(normalText, Integer.valueOf(1));
		topPanel.add(blueText, Integer.valueOf(2));
		topPanel.add(redText, Integer.valueOf(3));
	
		JFrame frame = new JFrame();
		frame.setTitle("Typing Racer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setSize(800,400);
		frame.add(bottomPanel, BorderLayout.SOUTH);
		frame.add(leftPanel, BorderLayout.WEST);
		frame.add(centerPanel, BorderLayout.CENTER);
		frame.add(topPanel, BorderLayout.NORTH);
		frame.add(rightPanel, BorderLayout.EAST);
		
		textField.addKeyListener( new KeyListener() {
			public void keyTyped(KeyEvent e) {}

			public void keyPressed(KeyEvent e) {
				int ch = e.getKeyChar();
				
				if(ch=='A' || ch=='a')
					A.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='B' || ch=='b')
					B.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='C' || ch=='c')
					C.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='D' || ch=='d')
					D.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='E' || ch=='e')
					E.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='F' || ch=='f')
					F.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='G' || ch=='g')
					G.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='H' || ch=='h')
					H.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='I' || ch=='i')
					I.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='J' || ch=='j')
					J.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='K' || ch=='k')
					K.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='L' || ch=='l')
					L.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='M' || ch=='m')
					M.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='N' || ch=='n')
					N.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='O' || ch=='o')
					O.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='P' || ch=='p')
					P.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='Q' || ch=='q')
					Q.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='R' || ch=='r')
					R.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='S' || ch=='s')
					S.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='T' || ch=='t')
					T.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='U' || ch=='u')
					U.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='V' || ch=='v')
					V.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='W' || ch=='w')
					W.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='X' || ch=='x')
					X.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='Y' || ch=='y')
					Y.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch=='Z' || ch=='z')
					Z.setBackground(new Color(0f, 1f, 1f, 1f));
				
				if(ch==32)
					Space.setBackground(new Color(0f, 1f, 1f, 1f));
			}

			public void keyReleased(KeyEvent e) {
				int ch = e.getKeyChar();
				
				if(ch=='A' || ch=='a')
					A.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='B' || ch=='b')
					B.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='C' || ch=='c')
					C.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='D' || ch=='d')
					D.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='E' || ch=='e')
					E.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='F' || ch=='f')
					F.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='G' || ch=='g')
					G.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='H' || ch=='h')
					H.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='I' || ch=='i')
					I.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='J' || ch=='j')
					J.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='K' || ch=='k')
					K.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='L' || ch=='l')
					L.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='M' || ch=='m')
					M.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='N' || ch=='n')
					N.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='O' || ch=='o')
					O.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='P' || ch=='p')
					P.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='Q' || ch=='q')
					Q.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='R' || ch=='r')
					R.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='S' || ch=='s')
					S.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='T' || ch=='t')
					T.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='U' || ch=='u')
					U.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='V' || ch=='v')
					V.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='W' || ch=='w')
					W.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='X' || ch=='x')
					X.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='Y' || ch=='y')
					Y.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch=='Z' || ch=='z')
					Z.setBackground(new Color(0f, 0f, 0f, 1f));
				
				if(ch==32)
					Space.setBackground(new Color(0f, 0f, 0f, 1f));
			}
		});
	}
}
