//package main;
//
//import javafx.application.Application;
//import javax.swing.*;
//import java.awt.*;
//
//
//
//class Main extends JFrame {
//	public Main(){
//	}
//	
//	public static void main(String args[]) {
//		
//	}
//}


//class Main extends JFrame {
//    JLabel cards;
//    JLabel remaining_cards_1;
//    JLabel mana_num_p1;
//    JLabel mana_num_p2;
//    JLabel remaining_cards_2;
//    JLabel mana_1;
//    JLabel mana_2;
//
//    public Main() {
//        setTitle("Hearthstone");
//        setSize(800, 600);
//        setLocationRelativeTo(null);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//        // Background image
//        JLabel background = new JLabel(new ImageIcon("src/images/background of entry.jpg"));
//        background.setLayout(new BorderLayout());
//        setContentPane(background); // Set it AFTER layout
//
//        // Panel to hold multiple components
//        JPanel infoPanel = new JPanel(new GridLayout(4, 5));
//        infoPanel.setOpaque(false); // Transparent background
//        
//        JPanel cardsPanel1 = new JPanel(new GridLayout(1,2));
//        JPanel cardsPanel2 = new JPanel(new GridLayout(1,2));
//        JPanel manaPanel1 = new JPanel(new GridLayout(1,2));
//        JPanel manaPanel2 = new JPanel(new GridLayout(1,2));
//        JPanel cardsPanel3 = new JPanel(new GridLayout(1,2));
//        
//        // Create labels
//        cards = new JLabel("Cards in hand");
//        remaining_cards_1 = new JLabel("Player 1 - Remaining Cards");
//        remaining_cards_2 = new JLabel("Player 2 - Remaining Cards");
//        mana_1 = new JLabel("Remaining Mana 0/0");
//        mana_2 = new JLabel("Remaining Mana 0/0");
//        mana_num_p1 = new JLabel("0/0");
//        mana_num_p2 = new JLabel("0/0");
//
//        // images
//        
//        JLabel card_p1 = new JLabel(new ImageIcon(new ImageIcon("src/images/card back.jpg").getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH)));
//        JLabel card_p2 = new JLabel(new ImageIcon(new ImageIcon("src/images/card back.jpg").getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH)));
//        JLabel mana_p1 = new JLabel(new ImageIcon(new ImageIcon("src/images/mana.jpg").getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH)));
//        JLabel mana_p2 = new JLabel(new ImageIcon(new ImageIcon("src/images/mana.jpg").getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH)));
//        JLabel hero1 = new JLabel(new ImageIcon(new ImageIcon("src/images/Jaina.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
//        JLabel hero2 = new JLabel(new ImageIcon(new ImageIcon("src/images/Rexxar.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
//        JLabel cards_in_hand = new JLabel(new ImageIcon(new ImageIcon("src/images/card back.jpg").getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH)));
//        
//     
//        cardsPanel1.add(card_p1);
//        cardsPanel1.add(remaining_cards_1);
//        cardsPanel2.add(card_p2);
//        cardsPanel2.add(remaining_cards_2);
//        manaPanel1.add(mana_p1);
//        manaPanel1.add(mana_1);
//        manaPanel2.add(mana_p2);
//        manaPanel2.add(mana_2);
//        cardsPanel3.add(cards_in_hand);
//        cardsPanel3.add(cards);
//
//        // Add labels to the panel
//        infoPanel.add(cardsPanel1);
//        infoPanel.add(new JLabel(""));
//        infoPanel.add(hero1);
//        infoPanel.add(new JLabel(""));
//        infoPanel.add(cardsPanel3);
//        infoPanel.add(manaPanel1);
//        infoPanel.add(new JLabel(""));
//        infoPanel.add(new JLabel(""));
//        infoPanel.add(new JLabel(""));
//        infoPanel.add(new JLabel(""));
//        infoPanel.add(manaPanel2);
//        infoPanel.add(new JLabel(""));
//        infoPanel.add(new JLabel(""));
//        infoPanel.add(new JLabel(""));
//        infoPanel.add(new JLabel(""));
//        infoPanel.add(cardsPanel2);
//        infoPanel.add(new JLabel(""));
//        infoPanel.add(hero2);
//        infoPanel.add(new JLabel(""));
//        infoPanel.add(new JLabel(""));
//        
//        
//        // Add the panel to center (or any position)
//        background.add(infoPanel, BorderLayout.CENTER);
//
//        setVisible(true); // Make visible after all setup
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(Main::new);
//    }
//}
