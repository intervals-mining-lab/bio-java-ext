package libiada.FastChainAlgorithms.FastChain.Calculators;

import libiada.FastChainAlgorithms.FastChain.FastChain;
import libiada.FastChainAlgorithms.FastChain.FastUniformChain;
import libiada.FastChainAlgorithms.FastChain.Interfaces.IFastCalculator;
import libiada.IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 29.07.11
 * Time: 2:46
 */
public class FastHentropy implements IFastCalculator {
    @Override
    public double getValue(FastChain chain, LinkUp linkUp) throws Exception {
        double result = 0;
        for (int i = 0; i < chain.alphabetPower(); i++) {
            result -= getValue(chain.getFastUniformChain(i), linkUp);
        }
        return result;
    }

    @Override
    public double getValue(FastUniformChain chain, LinkUp linkUp) throws Exception {
        double p = FastCalculatorFactory.getPropability().getValue(chain, linkUp);
        return p * (Math.log10(p) / Math.log10(2));
    }

    @Override
    public String getName() {
        return "H";
    }
}
