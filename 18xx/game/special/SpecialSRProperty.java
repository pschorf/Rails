/* $Header: /Users/blentz/rails_rcs/cvs/18xx/game/special/Attic/SpecialSRProperty.java,v 1.1 2005/11/24 22:42:40 evos Exp $
 * 
 * Created on 24-Nov-2005
 * Change Log:
 */
package game.special;

/**
 * @author Erik Vos
 */
public abstract class SpecialSRProperty extends SpecialProperty {
    
    public SpecialSRProperty () {
        super();
        isSRProperty = true;
    }

}
