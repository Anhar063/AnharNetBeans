/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventaris;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Tools",
        id = "Inventaris.Anhar063Action"
)
@ActionRegistration(
        displayName = "#CTL_Anhar063Action"
)
@ActionReference(path = "Menu/Tools", position = 0)
@Messages("CTL_Anhar063Action=TB")
public final class Anhar063Action implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
