package com.hsbc.raven.cr.model;

public class Risk {
	 private final long id;
	    private final String content;

	     public Risk(long id, String content) {
	        this.id = id;
	        this.content = content;
	    }

	    public long getId() {
	        return id;
	    }

	    public String getContent() {
	        return content;
	    }

}

