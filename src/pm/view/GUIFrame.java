package pm.view;

import javax.swing.JFrame;

import pm.controller.GUIController;
/**
 * GUIFrame framework class for Java GUI 
 * @author Jacob Smith
 * @version 1.3 added setContentPane(basePanel)
 */
public class GUIFrame extends JFrame
{
	private GUIController baseController;
	private GUIPanel basePanel;

	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(300, 500);
		//set visible must be after size and content pane
		this.setVisible(true);
	}
}
