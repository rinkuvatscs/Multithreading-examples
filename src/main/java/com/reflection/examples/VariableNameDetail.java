package com.reflection.examples;

public class VariableNameDetail {

	int id;
	String variableName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "VariableNameDetail [id=" + id + ", variableName="
				+ variableName + "]";
	}
	public VariableNameDetail(int id, String variableName) {
		super();
		this.id = id;
		this.variableName = variableName;
	}
	public String getVariableName() {
		return variableName;
	}
	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}
}
