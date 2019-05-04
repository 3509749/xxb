package com.sc.xxb.admin.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;




@Component
@ConfigurationProperties(prefix = "main")
public class MainProps {
    private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "MainProps{" +
				"company='" + company + '\'' +
				'}';
	}
}
