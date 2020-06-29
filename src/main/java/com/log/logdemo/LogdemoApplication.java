package com.log.logdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogdemoApplication {

    private static final Logger log = LoggerFactory.getLogger(LogdemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LogdemoApplication.class, args);
        log.info("info");
        log.error("error");
        for (int i = 0; i < 1; i++) {
            log.debug("\n" +
                    "   WebServiceTemplateAutoConfiguration:\n" +
                    "      Did not match:\n" +
                    "         - @ConditionalOnClass did not find required class 'org.springframework.oxm.Marshaller' (OnClassCondition)\n" +
                    "\n" +
                    "   WebServicesAutoConfiguration:\n" +
                    "      Did not match:\n" +
                    "         - @ConditionalOnClass did not find required class 'org.springframework.ws.transport.http.MessageDispatcherServlet' (OnClassCondition)\n" +
                    "\n" +
                    "   WebSocketMessagingAutoConfiguration:\n" +
                    "      Did not match:\n" +
                    "         - @ConditionalOnClass did not find required class 'org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer' (OnClassCondition)\n" +
                    "\n" +
                    "   WebSocketReactiveAutoConfiguration:\n" +
                    "      Did not match:\n" +
                    "         - @ConditionalOnWebApplication did not find reactive web application classes (OnWebApplicationCondition)\n" +
                    "\n" +
                    "   WebSocketServletAutoConfiguration.JettyWebSocketConfiguration:\n" +
                    "      Did not match:\n" +
                    "         - @ConditionalOnClass did not find required class 'org.eclipse.jetty.websocket.jsr356.server.deploy.WebSocketServerContainerInitializer' (OnClassCondition)\n" +
                    "\n" +
                    "   WebSocketServletAutoConfiguration.UndertowWebSocketConfiguration:\n" +
                    "      Did not match:\n" +
                    "         - @ConditionalOnClass did not find required class 'io.undertow.websockets.jsr.Bootstrap' (OnClassCondition)\n" +
                    "\n" +
                    "   XADataSourceAutoConfiguration:\n" +
                    "      Did not match:\n" +
                    "         - @ConditionalOnClass did not find required class 'javax.transaction.TransactionManager' (OnClassCondition)\n" +
                    "\n" +
                    "\n" +
                    "Exclusions:\n" +
                    "-----------\n" +
                    "\n" +
                    "    None\n" +
                    "\n" +
                    "\n" +
                    "Unconditional classes:\n" +
                    "----------------------\n" +
                    "\n" +
                    "    org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration\n" +
                    "\n" +
                    "    org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration\n" +
                    "\n" +
                    "    org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration\n" +
                    "\n" +
                    "    org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration\n" +
                    "\n" +
                    "    org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "2020-06-29 14:10:20.339 [main] DEBUG o.s.core.env.PropertySourcesPropertyResolver - Found key 'spring.liveBeansView.mbeanDomain' in PropertySource 'systemProperties' with value of type String\n" +
                    "2020-06-29 14:10:20.343 [main] DEBUG com.log.logdemo.LogdemoApplication - debug111"+i);
        }

        log.warn("warn");
    }

}
