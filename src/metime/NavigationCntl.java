
package metime;

import javax.swing.JFrame;

/**
 *
 * @author Gisward
 */
public class NavigationCntl 
{
    MainMenuUI theMainMenuUI;
    
    public NavigationCntl()
    {
        System.out.println("Made it to NavigationCntl");
        requestMainMenuUI();
    }
    
    public void requestMainMenuUI()
    {
        theMainMenuUI = new MainMenuUI(this);
        theMainMenuUI.pack();
        theMainMenuUI.setTitle("Main Menu");
        theMainMenuUI.setLocationRelativeTo(null);
        theMainMenuUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theMainMenuUI.setVisible(true);
    }
}
