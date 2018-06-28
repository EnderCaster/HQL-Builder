package com.endercaster.util.QueryBuilder.impl;

public interface QueryInterface {
	public String all();
	public String one();
	public int count();
	public boolean exists();
	public QueryInterface indexBy();
	public QueryInterface where();
	public QueryInterface andWhere();
	public QueryInterface orWhere();
	public QueryInterface filterWhere();
	public QueryInterface andFilterWhere();
	public QueryInterface orFilterWhere();
	public QueryInterface limit();
	public QueryInterface offset();
	public String getRawCommand();
}
