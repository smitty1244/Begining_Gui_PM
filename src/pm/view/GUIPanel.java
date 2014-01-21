package pm.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import pm.controller.GUIController;
/**
 * 
 * @author jsmi6845
 *@version 1.3 added Layout manager
 */
public class GUIPanel extends JPanel
{
// data members, must be initialized in GUI Panel.
	private GUIController baseController;
	private JButton firstButton;
	private JButton secondButton;
	private SpringLayout baseLayout;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("My first button :D");
		
		
		secondButton = new JButton("Look, I made another button!!!");
		
		
		
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.BLUE);
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(secondButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 94, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 94, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 86, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, 271, SpringLayout.WEST, this);
		
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -51, SpringLayout.NORTH, secondButton);
		baseLayout.putConstraint(SpringLayout.EAST, secondButton, -53, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, secondButton, -140, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, secondButton, -262, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, secondButton, -117, SpringLayout.SOUTH, this);
	}
}
