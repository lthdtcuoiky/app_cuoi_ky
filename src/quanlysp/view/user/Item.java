package view.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Item extends JFrame {

	private JPanel panelItem;

	public Item() {

	}

	public JPanel getItems(String name, String price, String linkImg) {
		panelItem = new JPanel();
		JButton btnLinkImg = new JButton();
		btnLinkImg.setIcon(new ImageIcon(linkImg));
		btnLinkImg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});

		JLabel lbNameItem = new JLabel(name);

		JLabel lbPriceItem = new JLabel("Giá: " + price);
		GroupLayout gl_panel = new GroupLayout(panelItem);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(btnLinkImg, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 240, 300)
				.addGroup(gl_panel.createSequentialGroup().addGap(20).addComponent(lbNameItem)
						.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE).addComponent(lbPriceItem)
						.addGap(10)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup()
				.addComponent(btnLinkImg, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.DEFAULT_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 0, Short.MAX_VALUE).addGroup(gl_panel
						.createParallelGroup(Alignment.BASELINE).addComponent(lbNameItem).addComponent(lbPriceItem))
				.addGap(5)));
		panelItem.setLayout(gl_panel);
		return panelItem;
	}

	public static void main(String[] args) {
		System.out.println("hihi");
//		JPanel panel = Item.getItems("hello", "baby", "em nè");
//		panel.setVisible(true);
	}
}
