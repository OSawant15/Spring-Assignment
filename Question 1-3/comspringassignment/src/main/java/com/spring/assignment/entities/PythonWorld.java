package com.spring.assignment.entities;

public class PythonWorld implements PythonLanguage {
	public JavaLanguage jl1;

	public String learningPython() {
		return "I am learning Python";
	}

	public PythonWorld(JavaLanguage jl1) {
		super();
		this.jl1 = jl1;
	}

}
