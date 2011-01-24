package libiada.Root.SimpleTypes;

import libiada.Root.IBaseObject;
import libiada.Root.IBin;

/**
 * Created by IntelliJ IDEA.
 * User: ������
 * Date: 11.12.2010
 * Time: 2:04:45
 * To change this template use File | Settings | File Templates.
 */
public class ValueChar implements IBaseObject {
    public char value = '_';

    public ValueChar(char sym) {
        value = sym;
    }

    public IBaseObject Clone() {
        return new ValueChar(value);  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean Equals(Object obj) {
        if (this == obj)
            return true;
        if (this.getClass() != obj.getClass())
            return false;
        return EqualsAsChar((ValueChar)obj);
    }

    private boolean EqualsAsChar(ValueChar c) {
        if (null == c)
        {
            return false;
        }
        return c.value == value;
    }

    public IBin GetBin() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
