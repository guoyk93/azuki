package net.guoyk.azuki.expressions;

import net.guoyk.azuki.AzukiException;
import net.guoyk.azuki.CombinationExpression;
import net.guoyk.azuki.Expression;

import java.util.Map;

/**
 * 'all' expression
 *
 * @author Guo Y.K.
 */
public class AllExpression extends CombinationExpression {

    public AllExpression(Object object) throws AzukiException {
        super(object);
    }

    @Override
    public boolean validate(Map<String, String> map) {
        for (Expression expression : getExpressions()) {
            if (!expression.validate(map)) return false;
        }
        return true;
    }
}
