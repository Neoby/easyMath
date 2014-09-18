/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2014 Sun Microsystems, Inc.
 */

package view.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Enrico
 */
public class View extends JPanel{
      public Color BG_COLOR= new Color(0,130,244);
    JLabel titolo, adminAccess,underTitle;
    JPanel titlePane,bottomInfo,logInField;
    
    
    public View(){
        this.setLayout(new BorderLayout());
        this.setBackground(BG_COLOR);
        titlePane = new JPanel();
        //DEBUG
        titlePane.setBackground(new Color(60,0,84));
        titlePane.setBackground(BG_COLOR);
        titlePane.setLayout(new BorderLayout());
        
        bottomInfo = new JPanel();
        bottomInfo.setBackground(new Color(60,0,84));
        
        adminAccess = new JLabel("Crea subito un test >");
        adminAccess.setFont(new Font("calibri",10,16));
        adminAccess.setForeground(Color.white);
        
        titolo = new JLabel("easyMath",JLabel.CENTER);
        titolo.setBorder(new EmptyBorder(14, 0, 0, 0) );
        titolo.setFont(new Font("calibri",20,28));
        titolo.setForeground(Color.white);
        
        underTitle = new JLabel("Inserisci credenziali",JLabel.CENTER);
        underTitle.setBorder(new EmptyBorder(6, 0, 0, 0) );
        underTitle.setFont(new Font("calibri",20,18));
        underTitle.setForeground(Color.white);
        
        
        titlePane.add(titolo,BorderLayout.PAGE_START);
        titlePane.add(underTitle,BorderLayout.CENTER);
        bottomInfo.add(adminAccess);
        this.add(titlePane,BorderLayout.PAGE_START);
        
        logInField= new JPanel();
        logInField.setLayout(null);
        logInField.setBackground(BG_COLOR);
        
        JTextArea nomeUtenteTxt;
        nomeUtenteTxt = new JTextArea();
        nomeUtenteTxt.setBounds(50,34, 180,36);
        
        logInField.add(nomeUtenteTxt,BorderLayout.PAGE_START);
        
        JTextArea passUtenteTxt;
        passUtenteTxt = new JTextArea();
        passUtenteTxt.setBounds(50,88, 180,36);
        passUtenteTxt.setRows(1);
        logInField.add(passUtenteTxt,BorderLayout.CENTER);
        
        this.add(logInField,BorderLayout.CENTER);
        this.add(bottomInfo,BorderLayout.PAGE_END);
        

    }
}
