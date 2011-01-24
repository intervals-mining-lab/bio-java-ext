package libiada.IntervalAnalysis.Characteristics.Calculators;

import libiada.IntervalAnalysis.Chain;
import libiada.IntervalAnalysis.Characteristics.AuxiliaryInterfaces.IChainDataForCalculator;
import libiada.IntervalAnalysis.Characteristics.AuxiliaryInterfaces.ICharacteristicCalculator;
import libiada.IntervalAnalysis.Characteristics.CharacteristicsFactory;
import libiada.IntervalAnalysis.LinkUp;
import libiada.IntervalAnalysis.UniformChain;

/**
 * Created by IntelliJ IDEA.
 * User: ������
 * Date: 21.01.2011
 * Time: 21:12:43
 * To change this template use File | Settings | File Templates.
 */
public class AverageRemoteness implements ICharacteristicCalculator {
    public double calculate(UniformChain pChain, LinkUp Link) throws Exception {
        return Math.log10(pChain.getCharacteristic(Link, CharacteristicsFactory.getDeltaG()))/Math.log10(2);
    }

    public double calculate(Chain pChain, LinkUp link) throws Exception {
        IChainDataForCalculator Data = pChain;
        double temp = 0;
        double n = pChain.getCharacteristic(link, CharacteristicsFactory.getIntervalsCount());
        for (int i = 0; i < pChain.getAlpahbet().getPower(); i++)
        {
            double Uniformdg = Data.IUniformChain(i).getCharacteristic(link, CharacteristicsFactory.getDeltaG());
            double n_j = Data.IUniformChain(i).getCharacteristic(link, CharacteristicsFactory.getIntervalsCount());
            temp += n_j/n*Math.log10(Uniformdg)/Math.log10(2);
        }
        return temp;
    }
}
