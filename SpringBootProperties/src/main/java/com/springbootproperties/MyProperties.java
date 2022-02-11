package com.springbootproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
@PropertySource("G:\\myProperties")

public class MyProperties {
	String name;
	String Version;
	Boolean messagingused;
	Integer [] zip;
	
	
	
	 public Integer[] getZip() {
		return zip;
	}
	public void setZip(Integer[] zip) {
		this.zip = zip;
	}
	Myapp myapp;
	 Mail mail;
	 
	 
	 
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		Version = version;
	}
	public Boolean getMessagingused() {
		return messagingused;
	}
	public void setMessagingused(Boolean messagingused) {
		this.messagingused = messagingused;
	}
	public Myapp getMyapp() {
		return myapp;
	}
	public void setMyapp(Myapp myapp) {
		this.myapp = myapp;
	}
	public Mail getMail() {
		return mail;
	}
	public void setMail(Mail mail) {
		this.mail = mail;
	}
	public static class Myapp{
		 String language;
		 String build;
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public String getBuild() {
			return build;
		}
		public void setBuild(String build) {
			this.build = build;
		}  
	 }
	 public static class Mail {
		 String host;
		 int port;
		 String protocal;
		public String getHost() {
			return host;
		}
		public void setHost(String host) {
			this.host = host;
		}
		public int getPort() {
			return port;
		}
		public void setPort(int port) {
			this.port = port;
		}
		public String getProtocal() {
			return protocal;
		}
		public void setProtocal(String protocal) {
			this.protocal = protocal;
		}
		 
	 }
}
