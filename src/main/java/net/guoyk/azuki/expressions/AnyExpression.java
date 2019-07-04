package net.guoyk.azuki.expressions;

import net.guoyk.azuki.AzukiException;
import net.guoyk.azuki.CombinationExpression;
import net.guoyk.azuki.Expression;

import java.util.Map;

/**
 * 'any' expression
 *
 * @author Guo Y.K.
 */
public class AnyExpression extends CombinationExpression {

    public AnyExpression(Object object) throws AzukiException {
        super(object);
    }

    @Override
    public boolean validate(Map<String, String> map) {
        for (Expression expression : getExpressions()) {
            if (expression.validate(map)) return true;
        }
        return false;
    }

}
