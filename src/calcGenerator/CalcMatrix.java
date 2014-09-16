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

package calcGenerator;

/**
 *
 * @author Enrico
 */
public class CalcMatrix {

    private boolean div_Enabled;
    private boolean molt_Eneabled;
    private boolean sum_Enabled;
    private boolean sub_Enabled;
    private int maxOperands;
    private int maxOperators;
    private boolean valid;
    private int op_enabled;
    char[] operands;

    
    
    
    public CalcMatrix() {
        new CalcMatrix(true, true,true, true, 9,4);      
    }
    
    /** Generate a new Calculation Matrix.
     *  <P>This will be the 'seed' with witch CalcGenerator will create a new 
     *  calc.</P>
     * 
     *  <P><b>Warning! </b>At least <b>one sign-parm must be true</b>, otherwise the Matrix will be
     *  considerated INVALID</P>
     *  
     */
    public CalcMatrix(boolean ALLOW_SUMS, boolean ALLOW_SUBTRACTIONS,boolean ALLOW_MOLTIPLICATIONS, boolean ALLOW_DIVISIONS, int maxOperands,int maxOperators){
        this.op_enabled=0;
        
        if(ALLOW_MOLTIPLICATIONS)op_enabled++;       
        if(ALLOW_DIVISIONS)op_enabled++;
        if(ALLOW_SUMS)op_enabled++;
        if(ALLOW_SUBTRACTIONS)op_enabled++;
        
        operands = new char[op_enabled];
        
        int i=0;
        
        if(ALLOW_MOLTIPLICATIONS)operands[i++]='*';
        if(ALLOW_DIVISIONS)operands[i++]=':';
        if(ALLOW_SUMS)operands[i++]='+';
        if(ALLOW_SUBTRACTIONS)operands[i++]='-';
        

        this.maxOperands = maxOperands;
        this.maxOperators = maxOperators;
        
        if(op_enabled==0){
            this.valid = false;
        }
        else {
            this.valid=true;
        }
    }
    
    /**
     *
     * @return all active operands in a char array
     */
    public char[] getActiveOperands(){
        return operands;
    }
    
    /**
     * Set the maximal calculation's opernads value
     * @param maxOperand the maximal calculation's opernads value
     */
    public void setMaxOperandsValue(int maxOperand){
        if(maxOperand>0){
            this.maxOperands=maxOperand;
        }
    }
    
    /**
     *
     * @return the maximal calculation's opernads value
     */
    public int getMaxOperandsValue(){
        return this.maxOperands;
    }
    
    
    /**
     * Set the maximal number of operators on a calculation
     * @param maxOperators the maximal operators on a sigle calculation
     */
    public void setMaxOperators(int maxOperators){
        if(maxOperators<6){
            this.maxOperators=maxOperators;
        }
    }
    
        /**
     *
     * @return the maximal calculation's opernads value
     */
    public int getMaxOperators(){
        return this.maxOperators;
    }
    
    public boolean isValid(){
        return valid;
    }
}
