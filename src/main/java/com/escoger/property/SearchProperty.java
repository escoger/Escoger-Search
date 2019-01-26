package com.escoger.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class SearchProperty {

	private int threadpoolcount;
	
	
	public int getThreadpoolcount() {
		return threadpoolcount;
	}

	public void setThreadpoolcount(int threadpoolcount) {
		this.threadpoolcount = threadpoolcount;
	}

	
}
