package net.guoyk.azuki.expressions;

import net.guoyk.azuki.AzukiException;
import net.guoyk.azuki.EvaluationExpression;

import java.util.Map;

/**
 * 'endsWith' expression
 *
 * @author Guo Y.K.
 */
public class EndsWithExpression extends EvaluationExpression {

    public EndsWithExpression(Object object) throws AzukiException {
        super(object);
    }

    @Override
    public boolean validate(Map<String, String> map) {
        for (Map.Entry<String, String> entry : getValues().entrySet()) {
            String value = map.get(entry.getKey());
            if (value == null || !value.endsWith(entry.getValue())) {
                return false;
            }
        }
        return true;
    }

}
