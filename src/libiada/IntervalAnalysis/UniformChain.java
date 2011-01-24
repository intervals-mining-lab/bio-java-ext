package libiada.IntervalAnalysis;

import libiada.EventTheory.Place;
import libiada.IntervalAnalysis.Characteristics.AuxiliaryInterfaces.ICharacteristicCalculator;
import libiada.Root.IBaseObject;
import libiada.Root.SimpleTypes.ValueChar;
import libiada.Statistics.FrequencyList;

/**
 * Created by IntelliJ IDEA.
 * User: ������
 * Date: 11.12.2010
 * Time: 1:39:23
 * To change this template use File | Settings | File Templates.
 */
public class UniformChain extends ChainWithCharacteristic implements IBaseObject {
    public UniformChain(int length, IBaseObject message) throws Exception {
        super(length);
        pAlphabet.add(message);
    }

    public FrequencyList getCommonIntervals() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public FrequencyList getStartInterval() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public FrequencyList getEndInterval() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void addItem(IBaseObject what, Place where) throws Exception
    {
        if (getMessage().Equals(what))
        {
            super.addItem(what, where);            
        }
    }

    @Override
    protected void buildIntervals() {
        //TODO: "������"
    }

    @Override
    public double injectIntoCharacteristic(Class<? extends ICharacteristicCalculator> calculatorClass, LinkUp link) throws Exception {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public IBaseObject getMessage() {
        return pAlphabet.get(1);
    }
}
