package net.guoyk.azuki.expressions;

import net.guoyk.azuki.AzukiException;
import net.guoyk.azuki.EvaluationExpression;

import java.util.Map;

/**
 * 'startsWithIgnoreCase' expression
 *
 * @author Guo Y.K.
 */
public class StartsWithIgnoreCaseExpression extends EvaluationExpression {

    public StartsWithIgnoreCaseExpression(Object object) throws AzukiException {
        super(object);
    }

    @Override
    public boolean validate(Map<String, String> map) {
        for (Map.Entry<String, String> entry : getValues().entrySet()) {
            String value = map.get(entry.getKey());
            if (value == null || !value.toLowerCase().startsWith(entry.getValue().toLowerCase())) {
                return false;
            }
        }
        return true;
    }
}
