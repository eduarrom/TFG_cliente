package com.rodrigo.TFG_cliente.Presentacion.seguridad.filters.imp;

import com.rodrigo.TFG_cliente.Presentacion.seguridad.filters.SQLParser;

public class SQLParserImp extends SQLParser {

	@Override
	public boolean isSafe(String cadena) {
		boolean isSafe;
		String c= cadena.toLowerCase();
		
		if (c.contains("\"") ||
			c.contains("\'") ||
			c.contains("select") ||
			c.contains("insert") ||
			c.contains("update") ||
			c.contains("delete") ||
			c.contains("create") ||
			c.contains("drop") ||
			c.contains("alter") ||
			c.contains(";") 
		) {
			isSafe= false;
		} else {
			isSafe= true;
		}
		
		return isSafe;
	}

}
