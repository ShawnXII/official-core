package com.official.start;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 官网dubbo服务启动类
 * @author ShawnXII
 * @Version 1.0
 */
public class OfficialBootstrap {
	
	private static Logger log = LoggerFactory.getLogger(OfficialBootstrap.class);
    private static volatile boolean running = true;
    static ClassPathXmlApplicationContext context;

	public static void main(String[] args){
		 log.info("################OfficialBootstrap准备启动服务！################");
	        context = new ClassPathXmlApplicationContext("applicationContext-configuration.xml");
	        context.start();
	        log.info("################OfficialBootstrap服务启动成功！################");
	        Runtime.getRuntime().addShutdownHook(new Thread() {
	            public void run()
	            {
	                if (context != null)
	                {
	                    context.stop();
	                    context.close();
	                    context = null;
	                }
	                log.info("################OfficialBootstrap服务已经停止!################");
	                synchronized (OfficialBootstrap.class)
	                {
	                    running = false;
	                    OfficialBootstrap.class.notify();
	                }
	            }
	        });

	        synchronized (OfficialBootstrap.class)
	        {
	            while (running)
	            {
	                try
	                {
	                	OfficialBootstrap.class.wait();
	                }
	                catch (Throwable e)
	                {}
	            }
	        }
		 
	}
	
}
