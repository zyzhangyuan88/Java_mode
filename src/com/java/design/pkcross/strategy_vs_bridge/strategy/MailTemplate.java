package com.java.design.pkcross.strategy_vs_bridge.strategy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class MailTemplate {
	//邮件发件人
	private String from;
	//收件人
	private String to;
	//邮件标题
	private String subject;
	//邮件内容
	private String context;

	//通过构造函数传递足够多的信息
	public MailTemplate(String _from,String _to,String _subject,String _context){
		this.from = _from;
		this.to = _to;
		this.subject = _subject;
		this.context = _context;
	}
	
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}
	
	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setContext(String context){
		this.context = context;
	}
	
	//邮件都有内容
	public String getContext(){
		return context;
	}
	
}
