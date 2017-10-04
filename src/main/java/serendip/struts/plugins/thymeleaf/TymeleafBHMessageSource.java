package serendip.struts.plugins.thymeleaf;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.LocalizedTextUtil;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.util.Assert;

import java.util.Locale;

public class TymeleafBHMessageSource implements MessageSource {

    @Override
    public String getMessage(String code, Object[] args, String defaultMessage, Locale locale) {
       // System.out.println("locale"+code+"locale="+args +"locale"+locale);
        String message = LocalizedTextUtil.findDefaultText(code, ActionContext.getContext().getLocale(), args);
        if(message==null){
            return defaultMessage ;
        }
//        System.out.println("message"+message);
        return  message ;

    }

    @Override
    public String getMessage(String code, Object[] args, Locale locale) throws NoSuchMessageException {
//        System.out.println("locale"+code+"locale="+args +"locale"+locale);
        String message = LocalizedTextUtil.findDefaultText(code, ActionContext.getContext().getLocale(), args);
        System.out.println("message"+message);
        return  message;

    }

    @Override
    public String getMessage(MessageSourceResolvable resolvable, Locale locale) throws NoSuchMessageException {
        return  "getMessage MessageSourceResolvable null 03";

    }
}
