/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.olingo4;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Olingo4EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Olingo4Endpoint target = (Olingo4Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "connecttimeout":
        case "connectTimeout": target.getConfiguration().setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "contenttype":
        case "contentType": target.getConfiguration().setContentType(property(camelContext, java.lang.String.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "filteralreadyseen":
        case "filterAlreadySeen": target.getConfiguration().setFilterAlreadySeen(property(camelContext, boolean.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "httpasyncclientbuilder":
        case "httpAsyncClientBuilder": target.getConfiguration().setHttpAsyncClientBuilder(property(camelContext, org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class, value)); return true;
        case "httpclientbuilder":
        case "httpClientBuilder": target.getConfiguration().setHttpClientBuilder(property(camelContext, org.apache.http.impl.client.HttpClientBuilder.class, value)); return true;
        case "httpheaders":
        case "httpHeaders": target.getConfiguration().setHttpHeaders(property(camelContext, java.util.Map.class, value)); return true;
        case "inbody":
        case "inBody": target.setInBody(property(camelContext, java.lang.String.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "proxy": target.getConfiguration().setProxy(property(camelContext, org.apache.http.HttpHost.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "serviceuri":
        case "serviceUri": target.getConfiguration().setServiceUri(property(camelContext, java.lang.String.class, value)); return true;
        case "sockettimeout":
        case "socketTimeout": target.getConfiguration().setSocketTimeout(property(camelContext, int.class, value)); return true;
        case "splitresult":
        case "splitResult": target.getConfiguration().setSplitResult(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("backoffErrorThreshold", int.class);
        answer.put("backoffIdleThreshold", int.class);
        answer.put("backoffMultiplier", int.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("connectTimeout", int.class);
        answer.put("contentType", java.lang.String.class);
        answer.put("delay", long.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("filterAlreadySeen", boolean.class);
        answer.put("greedy", boolean.class);
        answer.put("httpAsyncClientBuilder", org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class);
        answer.put("httpClientBuilder", org.apache.http.impl.client.HttpClientBuilder.class);
        answer.put("httpHeaders", java.util.Map.class);
        answer.put("inBody", java.lang.String.class);
        answer.put("initialDelay", long.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("pollStrategy", org.apache.camel.spi.PollingConsumerPollStrategy.class);
        answer.put("proxy", org.apache.http.HttpHost.class);
        answer.put("repeatCount", long.class);
        answer.put("runLoggingLevel", org.apache.camel.LoggingLevel.class);
        answer.put("scheduledExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        answer.put("scheduler", java.lang.Object.class);
        answer.put("schedulerProperties", java.util.Map.class);
        answer.put("sendEmptyMessageWhenIdle", boolean.class);
        answer.put("serviceUri", java.lang.String.class);
        answer.put("socketTimeout", int.class);
        answer.put("splitResult", boolean.class);
        answer.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        answer.put("startScheduler", boolean.class);
        answer.put("synchronous", boolean.class);
        answer.put("timeUnit", java.util.concurrent.TimeUnit.class);
        answer.put("useFixedDelay", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Olingo4Endpoint target = (Olingo4Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "connecttimeout":
        case "connectTimeout": return target.getConfiguration().getConnectTimeout();
        case "contenttype":
        case "contentType": return target.getConfiguration().getContentType();
        case "delay": return target.getDelay();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "filteralreadyseen":
        case "filterAlreadySeen": return target.getConfiguration().isFilterAlreadySeen();
        case "greedy": return target.isGreedy();
        case "httpasyncclientbuilder":
        case "httpAsyncClientBuilder": return target.getConfiguration().getHttpAsyncClientBuilder();
        case "httpclientbuilder":
        case "httpClientBuilder": return target.getConfiguration().getHttpClientBuilder();
        case "httpheaders":
        case "httpHeaders": return target.getConfiguration().getHttpHeaders();
        case "inbody":
        case "inBody": return target.getInBody();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "proxy": return target.getConfiguration().getProxy();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "serviceuri":
        case "serviceUri": return target.getConfiguration().getServiceUri();
        case "sockettimeout":
        case "socketTimeout": return target.getConfiguration().getSocketTimeout();
        case "splitresult":
        case "splitResult": return target.getConfiguration().isSplitResult();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getConfiguration().getSslContextParameters();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "synchronous": return target.isSynchronous();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        default: return null;
        }
    }
}

