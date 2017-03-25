/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metime;

/**
 *
 * @author Gisward
 */
public class SearchCntl 
{
    NavigationCntl theNavigationCntl;
    
    public void setNavigationCntl(NavigationCntl parentNavigationCntl)
    {
        this.theNavigationCntl = parentNavigationCntl;
    }
    /* copied from LoginCntl class. Use the same logic when searching for a contact in ContactList
    public boolean requestAuthenticate(String usernameToCheck, char[] passwordToCheck)
    {
        //theUserList.printUsers(); //for check
        boolean authenticated = theUserList.authenticate(usernameToCheck, passwordToCheck);

        return authenticated;
    }
*/
}
