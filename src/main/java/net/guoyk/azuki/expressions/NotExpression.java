package net.guoyk.azuki.expressions;

import net.guoyk.azuki.AzukiException;
import net.guoyk.azuki.WrapperExpression;

import java.util.Map;

/**
 * 'not' expression
 *
 * @author Guo Y.K.
 */
public class NotExpression extends WrapperExpression {

    public NotExpression(Object object) throws AzukiException {
        super(object);
    }

    @Override
    public boolean validate(Map<String, String> map) {
        return getExpression() == null || !getExpression().validate(map);
    }

}
